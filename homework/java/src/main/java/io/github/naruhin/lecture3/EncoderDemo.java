package io.github.naruhin.lecture3;

import io.github.naruhin.lecture3.classes.Encoder;

public class EncoderDemo {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();

        System.out.println("Encoding demo\nDec => Char");
        encoder.encodeDemo();

        System.out.println("\nDecoding demo\nChar => Dec");
        encoder.decodeDemo();
    }
}
