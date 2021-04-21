package by.jrr.start.service;

import by.jrr.start.bean.Stock;
import org.junit.Test;

import static org.junit.Assert.*;

public class StockServiceTest {

    StockService stockService;

    @Test
    public void getNameCompany_positive() {
        String expected = "GOOG";
        stockService = new StockService(new Stock("GOOG", 10));
        assertEquals(expected, stockService.getNameCompany());
    }

    @Test
    public void getNameCompany_negative() {
        String expected = "GOO";
        stockService = new StockService(new Stock("GOOG", 10));
        assertNotEquals(expected, stockService.getNameCompany());
    }

    @Test
    public void setNameCompany() {
        String expected = "GOOG";

        stockService = new StockService(new Stock());
        stockService.setNameCompany("GOOG");

        assertEquals(expected, stockService.getNameCompany());
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
    }

    @Test
    public void updatePrice() {
        double current = 15;
        double max = 20;
        double min = 7;

        stockService = new StockService(new Stock("GOOG", 10));

        stockService.updatePrice(20);
        stockService.updatePrice(7);
        stockService.updatePrice(15);

        assertEquals("current price", current, stockService.getCurrentPrice(), 0.01);
        assertEquals("max price", max, stockService.getMaxPrice(), 0.01);
        assertEquals("min price",min, stockService.getMinPrice(), 0.01);

    }
}
