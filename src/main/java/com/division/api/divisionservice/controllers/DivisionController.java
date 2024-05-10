package com.division.api.divisionservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DivisionController {
    
    @GetMapping("/divide")
    public String divide(@RequestParam double numero1, @RequestParam double numero2) {
        double result = numero1 / numero2;
        return String.valueOf(result);
    }
}