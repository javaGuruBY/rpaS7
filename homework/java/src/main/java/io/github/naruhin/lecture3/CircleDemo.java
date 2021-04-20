package io.github.naruhin.lecture3;

import io.github.naruhin.lecture3.classes.Circle;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Circle area: " + circle.calculateArea());

    }
}
