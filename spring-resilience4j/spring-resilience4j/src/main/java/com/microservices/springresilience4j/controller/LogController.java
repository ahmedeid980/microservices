package com.microservices.springresilience4j.controller;

import io.github.resilience4j.retry.annotation.Retry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class LogController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogController.class);

    @GetMapping("getInfo")
    @Retry(name = "logService", fallbackMethod = "feedBackInformation")
    public String getInfo() {
        LOGGER.info("we entered the function here is getInfo() {}");
//        ResponseEntity<String> forEntity = new RestTemplate().getForEntity("http://localhost:9033/get", String.class);
        return "forEntity.getBody()";
    }

    public String feedBackInformation(Exception ex) {
        return "please, try again later .. ";
    }

}
