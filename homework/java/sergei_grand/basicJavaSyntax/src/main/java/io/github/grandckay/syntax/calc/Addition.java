package io.github.grandckay.syntax.calc;

public class Addition {
    private int a;
    private int b;

    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate() {
        return a + b;
    }
}
