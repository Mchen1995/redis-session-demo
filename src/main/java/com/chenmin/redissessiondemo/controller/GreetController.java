package com.chenmin.redissessiondemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;


@RestController
public class GreetController {
    @GetMapping("/hostname")
    public String getHostName() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (Exception e) {
            return "Get Hostname failed";
        }
    }
}
