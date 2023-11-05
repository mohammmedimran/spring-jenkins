package com.jenkins.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")

public class JenkinsController {
    @GetMapping("/get/{name}")
    public String getMessage(@PathVariable (value="name") String userName) {
        return "welcome to jenkins\t" + userName;
    }
}
