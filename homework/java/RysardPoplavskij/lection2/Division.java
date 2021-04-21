package RysardPoplavskij.lection2;

public class Division {
    private double a;
    private double b;

    public Division(double v) {
    }

    public Division(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calculate() {
        return a / b;
    }
}
