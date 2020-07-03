package com.cloud.client1.contoller;

import com.cloud.client1.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lijy
 * @descriptin
 * @since
 */
@RestController
public class Client1Controller {
    @Value("${server.port}")
    private String port;

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/userlist")
    public List getUser() {
        List users = new ArrayList<>();
        User user = new User();
        user.setName("lijingyang ");
        user.setSex(1);
        users.add(user);
        return users;
    }

    @RequestMapping("/hello")
    public String hello() {
        //进行远程调用
        System.out.println("访问跳转·······");
        return restTemplate.getForObject("http://service-client/hello", String.class);


    }

}


