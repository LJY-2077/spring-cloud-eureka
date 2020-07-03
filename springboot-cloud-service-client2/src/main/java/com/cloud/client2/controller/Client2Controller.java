package com.cloud.client2.controller;

import com.cloud.client2.bean.Menu;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lijy
 * @descriptin
 * @since
 */
@RestController
public class Client2Controller {
    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "menulist")
    public List menuList() {
        List menus = new ArrayList();
        Menu menu = new Menu();
        menu.setCode("m001");
        menu.setName("系统菜单");
        menu.setUrl("/url/sys");
        menus.add(menu);

        return menus;
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World"+port;
    }
}
