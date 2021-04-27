package io.github.grandckay.lecture3.task1;

public class Dog {
    String name;
    int age;
    String color;

    public Dog(int age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public void voice() {
        System.out.print("Dog voice: ");
        System.out.println("Hau hau... -Auuu!");
    }

    public void eat() {
        System.out.print("Dog is eating: ");
        System.out.println("omn nom nom");
    }

    public void sleep() {
        System.out.print("Dog is sleeping: ");
        System.out.println("zZz");
    }

    public void printInfo() {
        voice();
        eat();
        sleep();
        System.out.println();
    }

    @Override
    public String toString() {
        return "Dog name -'" + name + '\'' +
                ", age - " + age +
                ", color - '" + color + '\'';
    }
}
