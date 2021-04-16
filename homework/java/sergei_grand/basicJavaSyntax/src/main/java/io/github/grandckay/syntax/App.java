package io.github.grandckay.syntax;

import io.github.grandckay.syntax.calc.Addition;
import io.github.grandckay.syntax.calc.Calculator;


public class App {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        double result = calculator.calculate(1, 3, "div");
        System.out.println("result = " + result);


        Addition addition = new Addition(10, 20);
        System.out.println(addition.calculate());

        result = addition.calculate();

        int г = 5;
        System.out.println("1111");
        Dog dog = new Dog();
        dog.bark();

        System.out.println(113);

    }
}
