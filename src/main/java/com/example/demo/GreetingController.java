package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicInteger;


@RestController
public class GreetingController {

    private static final Logger LOGGER = LoggerFactory.getLogger(GreetingController.class);
    private static final AtomicInteger counter = new AtomicInteger();

    @Autowired
    private MyConfig config;

    @RequestMapping("/")
    public String root() {
        return greeting();
    }

    @RequestMapping("/greeting")
    public String greeting() {
        String message = Integer.toString(counter.incrementAndGet()) + ". " + config.getMessage();
        LOGGER.info(message);
        return message;
    }
}
