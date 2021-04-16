package io.github.grandckay.syntax.calc;

public class Subtraction {
    private int a;
    private int b;

    public Subtraction(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate() {
        return a - b;
    }
}
