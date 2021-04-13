package RysardPoplavskij.lection3;

public class Dog {

    int age;
    String color;
    String name;

    public Dog(int age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public void voice() {
        System.out.println("Dog is barking:");
        System.out.println("hau hau");
    }

    public void eat() {
        System.out.println("Dog is eating:");
        System.out.println("omn nom nom");
    }

    public void sleep() {
        System.out.println("Dog is sleeping:");
        System.out.println("snark");
    }
}
