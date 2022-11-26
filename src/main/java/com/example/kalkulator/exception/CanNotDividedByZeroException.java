package com.example.kalkulator.exception;

public class CanNotDividedByZeroException extends Exception{

    public CanNotDividedByZeroException() {
    }

    public CanNotDividedByZeroException(String message) {
        super(message);
    }
}
