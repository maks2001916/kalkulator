package com.example.kalkulator.service;

import com.example.kalkulator.exception.CanNotDividedByZeroException;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
public class KalkulatorService {

    public void exception() throws CanNotDividedByZeroException {
            throw new CanNotDividedByZeroException("Одно значение не было введено");

    }

    public Integer plus(Integer a, Integer b) throws CanNotDividedByZeroException {
        if (a == null || b == null) {
            exception();
        }
        return a + b;
    }

    public Integer minus(Integer a, Integer b) throws CanNotDividedByZeroException {
        if (a == null || b == null) {
            exception();
        }
        return a - b;
    }

    public Integer multiply(Integer a, Integer b) throws CanNotDividedByZeroException {
        if (a == null || b == null) {
            exception();
        }
        return a * b;
    }

    public Integer divide(Integer a, Integer b) throws CanNotDividedByZeroException {
        if (a == null || b == null) {
            exception();
        }
        if (b == 0) {
            throw new CanNotDividedByZeroException("на ноль делить нельзя");
        }
        return a / b;
    }
}
