package com.example.restapi.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller
public class OAuthController {

    @GetMapping("/login")
    public String login() {
        // Redirection vers l'URL de connexion OAuth 2.0
        return "redirect:/oauth2/authorization/github";
    }

    @GetMapping("/callback")
    public String callback(@RequestParam("code") String code, OAuth2AuthenticationToken token) {
        return "redirect:http://localhost:4200";
    }
}