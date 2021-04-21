package by.jrr.start;

import by.jrr.start.bean.Stock;
import by.jrr.start.service.StockFacade;
import by.jrr.start.service.StockServiceFabric;

public class Application {

    public static void main(String[] args) {
        new StockFacade(
                StockServiceFabric.getStockService(
                        new Stock(args[0], Double.valueOf(args[1]), args[2])))
                .printInfo();
    }
}
