package io.github.grandckay.lecture3.task4;

public class EncoderDemo {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();
        encoder.encode((short) 65);

        encoder.decode('X');
    }
}
