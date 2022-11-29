package com.example.calculator.services;

import com.example.calculator.model.Equation;
import com.example.calculator.repository.CalculatorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
@AllArgsConstructor
public class CalculateService {
    private final CalculatorRepository repository;

    public double calculate(double firstParameter, String operator, double secondParameter) {
        double value;
        switch (operator) {
            case "+":
                value = firstParameter + secondParameter;
                break;
            case "-":
                value = firstParameter - secondParameter;
                break;
            case "*":
                value = firstParameter * secondParameter;
                break;
            case "/":
                value = firstParameter / secondParameter;
                break;
            default:
                throw new IllegalArgumentException("Input wasn't a recognized operator");
        }
        repository.save(Equation.builder()
                .result(value)
                .timestamp(new Timestamp(System.currentTimeMillis()))
                .build());
        return value;
    }
}
