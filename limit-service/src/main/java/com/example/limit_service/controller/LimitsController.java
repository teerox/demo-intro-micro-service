package com.example.limit_service.controller;

import com.example.limit_service.bean.Limits;
import com.example.limit_service.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    private final Configuration configuration;

    @Autowired
    LimitsController(Configuration configuration) {
        this.configuration = configuration;
    }


    @GetMapping("/limit")
    public Limits retrieveLimits() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
        // return new Limits(1, 1000);
    }
}
