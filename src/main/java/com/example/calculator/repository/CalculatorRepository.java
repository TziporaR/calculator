package com.example.calculator.repository;

import com.example.calculator.model.Equation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalculatorRepository extends JpaRepository<Equation, Long> {
}
