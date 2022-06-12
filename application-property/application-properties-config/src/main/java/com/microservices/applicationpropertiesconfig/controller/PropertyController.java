package com.microservices.applicationpropertiesconfig.controller;

import com.microservices.applicationpropertiesconfig.configprop.PropertyConfiguration;
import com.microservices.applicationpropertiesconfig.entities.LimitNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertyController {

    @Autowired
    private PropertyConfiguration propertyConfiguration;

    @GetMapping("getPropertConfiguration")
    public LimitNumber getPropertConfiguration() {
        return new LimitNumber(propertyConfiguration.getMinimum(), propertyConfiguration.getMaximum());
    }

}
