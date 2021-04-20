package io.github.naruhin.lecture3.classes;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI * Math.pow(2,this.radius);
    }

}
