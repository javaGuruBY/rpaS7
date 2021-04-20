package by.jrr.start;

import by.jrr.start.rysard_poplavskij.service.CalculatorService;


public class Application {

    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorService();
        int result = calculatorService.sum(1,2);
        System.out.println("Hello World");
    }
}
