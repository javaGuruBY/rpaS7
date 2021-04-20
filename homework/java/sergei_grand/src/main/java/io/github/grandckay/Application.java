package io.github.grandckay;

import io.github.grandckay.junit_test.test.MyCalculatorServiceTest;

public class Application {

    public static void main(String[] args) throws Exception {
//        CalculatorService calculatorService = new CalculatorService();
//        int result = calculatorService.sum(1, 2);
//        System.out.println("result = " + result);

        MyCalculatorServiceTest myCalculatorServiceTest = new MyCalculatorServiceTest();
        myCalculatorServiceTest.run();
    }
}
