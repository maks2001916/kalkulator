package com.example.kalkulator.exception;

public class CanNotDividedByZeroException extends IllegalArgumentException{

    public CanNotDividedByZeroException() {
    }

    public CanNotDividedByZeroException(String message) {
        super(message);
    }
}
