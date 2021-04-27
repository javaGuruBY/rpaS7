package io.github.grandckay.lecture4.lesson;

import org.junit.Assert;
import org.junit.Test;


public class QuickMathsTest {
    int a = 3;
    int b = 5;
    QuickMaths quickMaths = new QuickMaths();

    @Test
    public void max() {
        int expected = 5;
        int actual = quickMaths.max(3, 5);

        Assert.assertEquals(actual, expected);
    }
}