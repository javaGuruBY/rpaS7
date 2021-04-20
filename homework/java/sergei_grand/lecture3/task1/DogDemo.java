package io.github.grandckay.lecture3.task1;

public class DogDemo {
    public static void main(String[] args) {
        Dog ron = new Dog(5, "White", "Ron");
        Dog lucky = new Dog(10, "Black", "Lucky");

        System.out.println(ron.toString());
        ron.printInfo();

        System.out.println(lucky.toString());
        lucky.printInfo();

    }
}
