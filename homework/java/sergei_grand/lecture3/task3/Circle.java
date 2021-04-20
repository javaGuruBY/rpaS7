package io.github.grandckay.lecture3.task3;

public class Circle {
    double radius;
    final static double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return PI * (radius * radius) ;
    }
}
