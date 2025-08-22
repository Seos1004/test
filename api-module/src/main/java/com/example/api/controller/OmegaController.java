package com.example.api.controller;

import com.example.omega.OmegaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OmegaController {

    private final OmegaService omegaService;

    public OmegaController(OmegaService omegaService) {
        this.omegaService = omegaService;
    }

    @GetMapping("/omega")
    public String getOmega() {
        return omegaService.getMessage();
    }
}
