import by.jrr.start.Stock;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StockTest {

    @Test
    public void updateStockTest(){
        Stock google = new Stock("GOOG",10);

        google.updatePrice(20);
        google.updatePrice(7);
        google.updatePrice(15);
        assertEquals(google.getCurrentPrice(),google.getMaxPrice(),google.getMinPrice());
    }

    @Test
    public void printStockTest(){
        Stock google = new Stock("GOOG", 10);

        google.updatePrice(20);
        google.updatePrice(7);
        google.updatePrice(15);

        String actual = google.printlnInformation();
        System.out.println(actual);
        String expected = "Company = GOOG, CurrentPrice = 15.0, Max Price = 20.0, Min Price = 7.0";
        assertEquals(actual,expected);
    }

}
