package io.github.naruhin;

public class RandomGeneratorDemo {

    //gets a number in range from a to b
    // a - range start, b - range and
    static int getRandomNum(int a, int b){
        return a + (int) (Math.random() * b);
    }

    public static void main(String[] args) {

        System.out.println("1st random num from 0 to 100 - " + getRandomNum(0,100));
        System.out.println("2nd random num from 100 to 1000 -" + getRandomNum(100,1000));
        System.out.println("3rd random num from 1000 to 1000000 -" + getRandomNum(1000,1000000));

    }
}
