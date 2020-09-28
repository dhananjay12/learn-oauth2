package com.djcodes.spring.resourceserver.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simple")
public class SimpleController {

    @GetMapping("/check")
    public String check() {
        return "Working...";
    }

    @GetMapping("/jwt")
    public Jwt jwt(@AuthenticationPrincipal Jwt jwt) {
        return jwt;
    }

}
