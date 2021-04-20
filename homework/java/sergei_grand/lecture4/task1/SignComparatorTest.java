package io.github.grandckay.lecture4.task1;

// "Number is positive"
// "Number is negative"
// "Number is equal to zero"

public class SignComparatorTest {
    SignComparator victim = new SignComparator();
    String expected;
    String actual;
    String testName;

    public SignComparatorTest(String expected) {
        this.expected = expected;
    }

    public static void main(String[] args) {
        SignComparatorTest signComparatorTest = new SignComparatorTest("Number is equal to zero");
        signComparatorTest.testToZero();
    }

    public void testPositive() {
        testName = "Test positive";
        actual = victim.compare(1);
        check(actual, expected, testName);
    }

    public void testNegative() {
        testName = "Test negative";
        actual = victim.compare(-1);
        check(actual, expected, testName);
    }

    public void testToZero() {
        testName = "Test number is equal to zero";
        actual = victim.compare(0);
        check(actual, expected, testName);
    }

    public void check(String actualResult, String expectedResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " - has passed!");
        } else {
            System.out.println(testName + " - has failed!");
            System.out.println("Expected - " + expectedResult + ", but was - " + actualResult);
        }
    }
}

















