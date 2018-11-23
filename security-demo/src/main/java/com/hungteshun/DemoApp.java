package com.hungteshun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hungteshun
 * @description:
 * @date 2018/11/23 15:05
 */
@SpringBootApplication
@RestController
public class DemoApp {

    public static void main(String[] args) {
        SpringApplication.run(DemoApp.class,args);
    }

    @GetMapping(value = "/hello")
    public String hello(){
        return "hello spring security";
    }

}
