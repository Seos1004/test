package com.example.api.controller;

import com.example.alpha.AlphaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlphaController {

    private final AlphaService alphaService;

    public AlphaController(AlphaService alphaService) {
        this.alphaService = alphaService;
    }

    @GetMapping("/alpha")
    public String getAlpha() {
        return alphaService.getMessage();
    }
}
