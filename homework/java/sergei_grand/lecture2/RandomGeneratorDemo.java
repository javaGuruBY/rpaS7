package io.github.grandckay.lecture2;

import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        int sum = 0, count = 2;

        for (int i = 1; i <= count; i++) {
            int randomNumber = new Random().nextInt();
            System.out.println("Random number" + i + " = " + randomNumber);
            sum += randomNumber;
        }
        int secondRandom = (int) (Math.random() * Integer.MAX_VALUE);
        System.out.println("Random number3 = " + secondRandom);

        System.out.println("Sum of random numbers = " + sum);
    }
}
