package io.github.grandckay.lecture4.lesson;

public class MyQuickMathsTest {
    public static void main(String[] args) {
        MyQuickMathsTest myQuickMathsTest = new MyQuickMathsTest();
        myQuickMathsTest.test1();
    }

    public void test1() {
        QuickMaths victim = new QuickMaths();
        int a = 3;
        int b = 5;

        int expectedResult = 5;
        int actualResult = victim.max(3, 5);

        check(actualResult, expectedResult, "test1");
    }

    public void check(int actualResult, int expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected " + expectedResult
                    + " but was " + actualResult);
        }
    }
}
