package com.example.kalkulator.controller;

import com.example.kalkulator.exception.CanNotDividedByZeroException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kalkulator")
public class KalkulatorController {
    private final KalkulatorController kalkulatorController;

    public KalkulatorController() {
        this.kalkulatorController = kalkulatorController;
    }

    @ExceptionHandler(value = CanNotDividedByZeroException.class)
    public ResponseEntity<String> canNotDevidedByZeroExeption(CanNotDividedByZeroException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }

    @GetMapping
    public String getGreeting() {
        return "Калькулятор запущен";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return String.format("%d + %d = %d", a, b, this.kalkulatorController.plus(a, b));
    }

    @GetMapping("/minus")
    public String minus(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return String.format("%d + %d = %d", a, b, this.kalkulatorController.minus(a, b));
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return String.format("%d + %d = %d", a, b, this.kalkulatorController.multiply(a, b));
    }

    @GetMapping("/divide")
    public String divide(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return String.format("%d + %d = %d", a, b, this.kalkulatorController.divide(a, b));
    }
}
