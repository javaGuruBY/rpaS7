package by.jrr.start;

import java.util.Random;
import java.util.Scanner;

public class LightColorDetector {


    public String detect(int waveLenght) {

        if (waveLenght < 449 && waveLenght > 380) {
            System.out.println("Violet(Фиолетовый)");
        } else if (waveLenght < 494 && waveLenght > 450) {
            System.out.println("Blue(Синий)");
        } else if (waveLenght < 569 && waveLenght > 495) {
            System.out.println("Green(Зеленый)");
        } else if (waveLenght < 589 && waveLenght > 570) {
            System.out.println("Yellow(Желтый)");
        } else if (waveLenght < 619 && waveLenght > 571) {
            System.out.println("Orange(Красный)");
        } else if (waveLenght < 750 && waveLenght > 572) {
            System.out.println("Red(Красный)");
        } else {
            System.out.println("Invisible Light(Невидимый свет)");
        }
        return null;
    }
}
