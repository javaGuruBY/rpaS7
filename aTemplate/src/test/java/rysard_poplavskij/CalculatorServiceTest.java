package rysard_poplavskij;

import by.jrr.start.service.CalculatorService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorServiceTest {

    int a = 1;
    int b = 3;

    @Test
    public void sum() throws Exception {
        CalculatorService calculatorService = new CalculatorService();
        int expected = 3;
        int actual = calculatorService.sum(a, b);
        System.out.println(actual);
        assertEquals(expected, actual);
    }


    @Test
    public void sub() {
        CalculatorService calculatorService = new CalculatorService();
        int expected = -1;
        int actual = calculatorService.sum(a, b);
        System.out.println(actual);
        assertEquals(expected, actual);

    }


}
