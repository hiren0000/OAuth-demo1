package com.rebel.OAuthDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OAuthController
{
    @GetMapping("/")
    public String home()
    {
        return "Hello, buddy";
    }

    @GetMapping("/secured")
    public String secured()
    {
        return "This is secured Page :)";
    }
}
