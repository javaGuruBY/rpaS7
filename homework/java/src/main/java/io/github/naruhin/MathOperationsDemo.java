package io.github.naruhin;

public class MathOperationsDemo {

    public static void main(String[] args) {
        int a = 4;
        int b = 5;

        int multiply = a * b;
        double divide = a / (double)b;
        int addition  = a + b;
        int subtraction = a - b;

        System.out.printf("Demonstration of math operations : \nMultiply : %d * %d = %d\n", a,b,multiply);
        System.out.printf("Divide : %d / %d = %f\n", a,b,divide);
        System.out.printf("Addition : %d + %d = %d\n", a,b,addition);
        System.out.printf("Subtraction : %d - %d = %d\n", a,b,subtraction);


    }
}
