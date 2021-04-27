package io.github.grandckay.lecture3.task4;

public class Encoder {
    public void encode(short code) {
        System.out.println(code +  " => '" + (char) code + '\'');
    }

    public void decode(char symbol) {
        System.out.println( '\'' + "" + symbol + "" + '\'' +  " => " + (int) symbol);
    }
}
