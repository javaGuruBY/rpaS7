package rysard_poplavskij;

import by.jrr.start.rysard_poplavskij.stock.Stock;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StockTest {

    @Test
    public void updateStockTest() {
        Stock google = new Stock("GOOG", 10, 7, 12);
        google.updatePrice(10, 10, 10);
        assertEquals((google.getMinPrice()), 5, 1);
    }

    @Test
    public void printStockTest() {
        Stock google = new Stock("GOOG", 10, 10, 10);
        String actualResult = google.printInformation(google);
        System.out.println(actualResult);
        String expectedResult = "Company = \"GOOG\", Current Price = 10, Min Price = 10, Max Price = 10";
        assertEquals(expectedResult, actualResult);
    }
}
