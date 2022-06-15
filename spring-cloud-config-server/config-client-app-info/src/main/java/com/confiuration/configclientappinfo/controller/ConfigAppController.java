package com.confiuration.configclientappinfo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigAppController {

    @Value("${pathinfo}")
    private String min;

    @GetMapping("getmin")
    public String getMin() {
        return min;
    }

}
