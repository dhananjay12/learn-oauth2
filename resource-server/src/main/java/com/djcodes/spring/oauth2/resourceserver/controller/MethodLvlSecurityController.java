package com.djcodes.spring.oauth2.resourceserver.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/method")
public class MethodLvlSecurityController {

    @Secured("ROLE_beta_user")
    @GetMapping("/secured")
    public String secured() {
        System.out.println("In Secured");
        return "Secured annotation working";
    }

    @PreAuthorize("hasAuthority('ROLE_beta_user') or #username == #jwt.claims.get('preferred_username')")
    @GetMapping("/pre-authorize/{username}")
    public String preAuthorize(@PathVariable String username, @AuthenticationPrincipal Jwt jwt) {
        System.out.println("In PreAuthorize");
        return "PreAuthorize annotation working";
    }

    @PostAuthorize("returnObject.something == #jwt.claims.get('preferred_username')")
    @GetMapping("/post-authorize/{username}")
    public SomeObject postAuthorize(@PathVariable String username, @AuthenticationPrincipal Jwt jwt) {
        System.out.println("In PostAuthorize");
        return new SomeObject(username);
    }

}

class SomeObject {

    private String something;

    public SomeObject(String something) {
        this.something = something;
    }

    public String getSomething() {
        return something;
    }

    public void setSomething(String something) {
        this.something = something;
    }
}
