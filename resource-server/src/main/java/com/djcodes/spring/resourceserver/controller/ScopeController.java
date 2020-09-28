package com.djcodes.spring.resourceserver.controller;

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
