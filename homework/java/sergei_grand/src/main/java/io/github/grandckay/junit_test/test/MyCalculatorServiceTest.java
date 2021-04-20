package io.github.grandckay.junit_test.test;

import io.github.grandckay.junit_test.service.CalculatorService;

public class MyCalculatorServiceTest {
    public static int totalTest = 0;
    public static int testFailed = 0;
    public static int testSuccess = 0;

    int a = 1;
    int b = 2;

    public void run() throws Exception {
        try {
            totalTest++;
            sum();
            testSuccess++;
        } catch (Exception e) {
            totalTest++;
            e.printStackTrace();
        }

        try {
            totalTest++;
            sub();
            testSuccess++;
        } catch (Exception e) {
            totalTest++;
            e.printStackTrace();
        }

        System.out.println("testFailed = " + testFailed);
        System.out.println("testSuccess = " + testSuccess);
        System.out.println("totalTest = " + totalTest);

        if (testFailed != 0) {
            throw new Exception("Build failed");
        }
    }

    // @Test
    public void sum() throws Exception {
        CalculatorService calculatorService = new CalculatorService();
        int expected = 3;
        int actual = calculatorService.sum(a, b);
        System.out.println("actual = " + actual);
        System.out.println("expected = " + expected);

        assertEquals(expected, actual);
    }

    // @Test
    public void sub() throws Exception {
        CalculatorService calculatorService = new CalculatorService();
        int expected = -1;
        int actual = calculatorService.sub(a, b);
        System.out.println("actual = " + actual);
        System.out.println("expected = " + expected);

        assertEquals(expected, actual);
    }

    private void assertEquals(int expected, int actual) throws Exception {
        if (expected == actual) {
            System.out.println("Test success");
        } else {
            throw new Exception("Test failed");
        }
    }
}






















