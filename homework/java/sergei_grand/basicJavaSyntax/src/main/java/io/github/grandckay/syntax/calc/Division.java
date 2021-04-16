package io.github.grandckay.syntax.calc;

public class Division {
    private int a;
    private int b;

    public Division(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double calculate() {
        return a / (double) b;
    }
}
