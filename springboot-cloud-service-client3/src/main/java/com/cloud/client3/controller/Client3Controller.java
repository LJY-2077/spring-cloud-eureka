package com.cloud.client3.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author lijy
 * @descriptin
 * @since
 */
@RestController
public class Client3Controller {
    @Value("${server.port}")
    private String port;


    @RequestMapping("/hello")
    public String hello() {
        return "Hello World"+port;
    }
}
