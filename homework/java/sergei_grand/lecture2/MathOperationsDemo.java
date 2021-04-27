package io.github.grandckay.lecture2;

public class MathOperationsDemo {

    public int addition(int i, int j) {
        return i + j;
    }
    public int subtraction(int i, int j) {
        return i - j;
    }
    public int multiplication(int i, int j) {
        return i * j;
    }
    public double division(int i, int j) {
        return i / (double) j;
    }
    public int remainder(int i, int j) {
        return i % j;
    }


    public static void main(String[] args) {
        int firstNumber = 5;
        int secondNumber = 2;

        System.out.println(firstNumber + " + " +  secondNumber + " = "
                + new MathOperationsDemo().addition(firstNumber, secondNumber));

        System.out.println(firstNumber + " - " +  secondNumber + " = "
                + new MathOperationsDemo().subtraction(firstNumber, secondNumber));

        System.out.println(firstNumber + " * " +  secondNumber + " = "
                + new MathOperationsDemo().multiplication(firstNumber, secondNumber));

        System.out.println(firstNumber + " / " +  secondNumber + " = "
                + new MathOperationsDemo().division(firstNumber, secondNumber));

        System.out.println(firstNumber + " % " +  secondNumber + " = "
                + new MathOperationsDemo().remainder(firstNumber, secondNumber));
    }
}
