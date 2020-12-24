package com.hdx.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xz
 * @create 2020-12-23-11:20
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "这是一个Eureka服务提供者";
    }

}
