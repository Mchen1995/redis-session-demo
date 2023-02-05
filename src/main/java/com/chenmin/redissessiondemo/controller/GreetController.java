package com.chenmin.redissessiondemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RestController
public class GreetController {
    Logger logger = LoggerFactory.getLogger(GreetController.class);

    @GetMapping("/hostname")
    public String getHostName() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (Exception e) {
            return "Get Hostname failed";
        }
    }

    @GetMapping("/persistMessage")
    public List<String> persistMessage(HttpServletRequest request) {
        HttpSession session = request.getSession();
        logger.info("sessionId:[{}]", session.getId());

        @SuppressWarnings("unchecked")
        List<String> messages = (List<String>) session.getAttribute("MY_SESSION_MESSAGES");
        if (messages == null) {
            messages = new ArrayList<>();
            session.setAttribute("MY_SESSION_MESSAGES", messages);
        }
        messages.add(String.valueOf(new Date()));
        session.setAttribute("MY_SESSION_MESSAGES", messages);
        return messages;
    }
}
