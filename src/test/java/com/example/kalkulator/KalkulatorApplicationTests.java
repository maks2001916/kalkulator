package com.example.kalkulator;

import com.example.kalkulator.controller.KalkulatorController;
import com.example.kalkulator.exception.CanNotDividedByZeroException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

@SpringBootTest
public class KalkulatorApplicationTests {
    public final KalkulatorController kalkulatorController = new KalkulatorController();

    public static Stream<Arguments> forPlusTest() {
        return Stream.of(Arguments.of(1,2,3), Arguments.of(4,5,6));
    }

    public static Stream<Arguments> forMinusTest() {
        return Stream.of(Arguments.of(3,8,28), Arguments.of(17,9,4));
    }

    public static Stream<Arguments> forMultiplyTest() {
        return Stream.of(Arguments.of(-5,3,-8), Arguments.of(8,-2,7));
    }

    public static Stream<Arguments> forDivideTest() {
        return Stream.of(Arguments.of(-6,12,7), Arguments.of(5,-8,-12));
    }

    @ParameterizedTest
    @MethodSource("forPlusTest")
    public void plusTest(Integer a, Integer b, Integer result) {
        Assertions.assertEquals(result, kalkulatorController.plus(a,b));
    }

    @ParameterizedTest
    @MethodSource("forMinusTest")
    public void minusTest(Integer a, Integer b, Integer result) {
        Assertions.assertEquals(result, kalkulatorController.plus(a,b));
    }

    @ParameterizedTest
    @MethodSource("forMultiplyTest")
    public void multiplyTest(Integer a, Integer b, Integer result) {
        Assertions.assertEquals(result, kalkulatorController.plus(a,b));
    }

    @ParameterizedTest
    @MethodSource("forDivideTest")
    public void divideTest(Integer a, Integer b, Integer result) {
        Assertions.assertEquals(result, kalkulatorController.plus(a,b));
    }

    @Test
    public void dividedByZeroException() {
        Assertions.assertThrows(CanNotDividedByZeroException.class, () -> kalkulatorController.divide(null, 4));
    }

    @Test
    public void plusWithFistNumNullException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> kalkulatorController.plus(null, 2));
    }

    @Test
    public void minusWithFistNumNullException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> kalkulatorController.minus(null, 9));
    }

    @Test
    public void multiplyWithFistNumNullException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> kalkulatorController.multiply(null, 7));
    }

    @Test
    public void divideWithFistNumNullException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> kalkulatorController.divide(null, 6));
    }

    @Test
    public void plusWithSecondNumNullException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> kalkulatorController.plus(1, null));
    }

    @Test
    public void minusWithSecondNumNullException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> kalkulatorController.minus(3, null));
    }

    @Test
    public void multiplyWithSecondNumNullException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> kalkulatorController.multiply(1, null));
    }


}
