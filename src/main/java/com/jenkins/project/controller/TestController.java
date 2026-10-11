package com.jenkins.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/jenkins")
public class TestController {
    @GetMapping("/msg")
    public String getMsg(){
        return "Jenkins is working now...";
    }
}
