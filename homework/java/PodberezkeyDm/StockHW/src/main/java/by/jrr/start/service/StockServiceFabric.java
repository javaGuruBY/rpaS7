package by.jrr.start.service;

import by.jrr.start.bean.Stock;

public class StockServiceFabric {

    private StockServiceFabric() {
    }

    public static StockServiceInterface getStockService(Stock stock) {
        if ("ENG".equals(stock.getCountryCode())) {
            return new StockEnglandService(stock);
        }
        return new StockService(stock);

    }
}
