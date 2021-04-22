package by.jrr.start.service;

public class CalculationServiceTest {
    int a = 1;
    int b = 2;

    public void sum() {
        CalculatorService calculatorService = new CalculatorService();
        int expected = 3;
        int actual = calculatorService.sum(a, b);
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    public void sub() {
        CalculatorService calculatorService = new CalculatorService();
        int expected = -1;
        int actual = calculatorService.sum(a, b);
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    private void assertEquals(int expected, int actual) {
        if (expected == actual) {
            System.out.println("Test success");
        } else {
            System.out.println("test failed");
        }
    }


}
