package by.jrr.start.service;

import by.jrr.start.service.StockServiceInterface;

public class StockFacade {

    StockServiceInterface stockService;

    public StockFacade(StockServiceInterface stockService) {
        this.stockService = stockService;
    }

    public void printInfo() {
        System.out.println(stockService.printlnInformation());
    }
}
