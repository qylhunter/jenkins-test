package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

    @GetMapping("/jenkins")
    public String jenkins() {
        return "hello, jenkins！！";
    }
    @GetMapping("/test")
    public String jenkinsTest() {
        return "hello, jenkins test！！";
    }

}
