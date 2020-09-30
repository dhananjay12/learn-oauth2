package com.djcodes.spring.oauth2.resourceserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role")
public class RoleController {

    @GetMapping("/check")
    public String check() {
        return "Role check working...";
    }

}
