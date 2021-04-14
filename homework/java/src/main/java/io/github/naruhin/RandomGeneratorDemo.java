package io.github.naruhin;

public class RandomGeneratorDemo {

    //gets a number in range from a to b
    // a - range start, b - range and
    static int getRandomNum(int a, int b){
        return a + (int) (Math.random() * b);
    }

    public static void main(String[] args) {

        int firstRandomNum = getRandomNum(0,100);
        int secondRandomNum = getRandomNum(100,1000);
        int thirdRandomNum = getRandomNum(1000,1000000);
        System.out.printf("1st random num from 0 to 100 - %d\n",firstRandomNum);
        System.out.printf("2nd random num from 100 to 1000 - %d\n", secondRandomNum);
        System.out.printf("3rd random num from 1000 to 1000000 - %d\n",thirdRandomNum);

        int summOfRandomNums = firstRandomNum + secondRandomNum + thirdRandomNum;

        System.out.printf("Summ of random nums - %d + %d + %d = %d", firstRandomNum,secondRandomNum,thirdRandomNum,summOfRandomNums);
    }
}
