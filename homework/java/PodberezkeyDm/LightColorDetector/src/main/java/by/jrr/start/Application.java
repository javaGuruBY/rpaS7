package by.jrr.start;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LightColorDetector lightColorDetector = new LightColorDetector();
        System.out.println("Введите длину волны ");
        lightColorDetector.detect(scanner.nextInt());
    }
}
