package com.djcodes.spring.oauth2.resourceserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scope")
public class ScopeController {

    @GetMapping("/check")
    public String check() {
        return "Scope check working...";
    }

}
