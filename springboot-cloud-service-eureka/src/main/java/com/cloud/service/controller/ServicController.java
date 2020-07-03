package com.cloud.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author lijy
 * @descriptin
 * @since
 */
@RestController
public class ServicController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String hello() {
        //进行远程调用
        return restTemplate.getForObject("http://service-admin/hello", String.class);
    }
}
