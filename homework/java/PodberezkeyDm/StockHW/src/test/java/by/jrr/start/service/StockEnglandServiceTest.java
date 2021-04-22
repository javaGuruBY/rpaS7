package by.jrr.start.service;

import by.jrr.start.bean.Stock;
import by.jrr.start.util.StockUtil;
import org.junit.Test;

import static by.jrr.start.util.StockUtil.updatePrice;
import static org.junit.Assert.*;

public class StockEnglandServiceTest {

    StockEnglandService service;

    @Test
    public void printInformation() {
        service = new StockEnglandService(new Stock("GOOG", 10));
        service.updatePrice(20);
        service.updatePrice(7);
        service.updatePrice(15);

        String actual = service.printlnInformation();
        String expected = "God safe the Queen!Company = GOOG, CurrentPrice = 15.0, Max Price = 20.0, Min Price = 7.0";
        assertEquals(actual,expected);
    }

}
