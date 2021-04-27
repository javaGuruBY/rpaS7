package io.github.grandckay.junit_test.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorServiceTest {
    int a = 1;
    int b = 2;
    CalculatorService calculatorService; // static ?!

    @Before
    public void setUp() throws Exception {
        calculatorService = new CalculatorService();
    }

    @Test
    public void sum() throws Exception {
        int expected = 3;
        int actual = calculatorService.sum(a, b);

        assertEquals(expected, actual);
    }

    @Test
    public void sub() throws Exception {
        int expected = -1;
        int actual = calculatorService.sub(a, b);

        assertEquals(expected, actual);
    }

    @Test
    public void mult() {
        int expected = 2;
        int actual = calculatorService.mult(a, b);

        assertEquals(expected, actual);
    }
}