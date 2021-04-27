package io.github.grandckay.lecture3.task3;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(10);

        System.out.println("For a radius of "
                + circle.radius + " the area is " + circle.calculateArea() );
    }
}
