package com.example.calculator.controller;

import com.example.calculator.services.CalculateService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
@AllArgsConstructor
public class CalculatorController {
    private final CalculateService calculateService;

    @PostMapping()
    public double getCalculatedResult(@RequestParam double firstParameter, @RequestParam String operator, @RequestParam double secondParameter) {
        return calculateService.calculate(firstParameter, operator, secondParameter);
    }
}
