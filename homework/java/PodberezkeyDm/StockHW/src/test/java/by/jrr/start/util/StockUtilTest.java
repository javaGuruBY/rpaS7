package by.jrr.start.util;

import by.jrr.start.bean.Stock;
import org.junit.Test;

import static org.junit.Assert.*;
import static by.jrr.start.util.StockUtil.*;

public class StockUtilTest {

    @Test
    public void getNameCompany() {
    }

    @Test
    public void setNameCompany() {
    }

    @Test
    public void getCurrentPrice() {
    }

    @Test
    public void setCurrentPrice() {
    }

    @Test
    public void getMinPrice() {
    }

    @Test
    public void setMinPrice() {
    }

    @Test
    public void getMaxPrice() {
    }

    @Test
    public void setMaxPrice() {
    }

    @Test
    public void printlnInformation() {
        Stock google = new Stock("GOOG", 10);

        updatePrice(20, google);
        updatePrice(7, google);
        updatePrice(15, google);

        String actual = StockUtil.printlnInformation(google);
        String expected = "Company = GOOG, CurrentPrice = 15.0, Max Price = 20.0, Min Price = 7.0";
        assertEquals(actual,expected);
    }

    @Test
    public void updatePriceTest() {
    }
}
