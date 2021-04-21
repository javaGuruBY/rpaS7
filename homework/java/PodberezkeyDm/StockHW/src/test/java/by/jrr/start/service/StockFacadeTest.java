package by.jrr.start.service;

import by.jrr.start.bean.Stock;
import by.jrr.start.service.StockFacade;
import org.junit.Test;

import java.util.List;

import static by.jrr.start.service.StockServiceFabric.getStockService;

public class StockFacadeTest {

    @Test
    public void printInfo() {
        Stock stock = new Stock("GOOG", 10);
        Stock engStock = new Stock("Range", 5.0, "ENG");

        List<StockFacade> stockFacades = List.of(
                new StockFacade(getStockService(stock)),
                new StockFacade(getStockService(engStock))
        );
        stockFacades.forEach(
                stockFacade -> stockFacade.printInfo()
        );
    }
}
