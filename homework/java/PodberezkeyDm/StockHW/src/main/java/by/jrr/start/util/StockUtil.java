package by.jrr.start.util;

import by.jrr.start.bean.Stock;

public class StockUtil {

    private StockUtil(){
    }

    public static String getNameCompany(Stock stock) {
        return stock.getNameCompany();
    }

    public static void setNameCompany(String nameCompany, Stock stock) {
        stock.setNameCompany(nameCompany);
    }

    public static double getCurrentPrice(Stock stock) {
        return stock.getCurrentPrice();
    }

    public static void setCurrentPrice(double currentPrice, Stock stock) {
        stock.setCurrentPrice(currentPrice);
    }

    public static double getMinPrice(Stock stock) {
        return stock.getMinPrice();
    }

    public static void setMinPrice(double minPrice, Stock stock) {
        stock.setMinPrice(minPrice);
    }

    public static double getMaxPrice(Stock stock) {
        return stock.getMaxPrice();
    }

    public static void setMaxPrice(double maxPrice, Stock stock) {
        stock.setMaxPrice(maxPrice);
    }

    public static String printlnInformation(Stock stock) {
        return "Company = " + getNameCompany(stock) +
                ", CurrentPrice = " + getCurrentPrice(stock) +
                ", Max Price = " + getMaxPrice(stock) +
                ", Min Price = " + getMinPrice(stock);
    }

    public static void updatePrice(double newPrice, Stock stock){
        if (stock.getMinPrice() == null || newPrice <= stock.getMinPrice()){
            stock.setMinPrice(newPrice);
        }
        if(stock.getMaxPrice() == null || newPrice >= stock.getMaxPrice()){
            stock.setMaxPrice(newPrice);
        }
        setCurrentPrice(newPrice, stock);
    }
}
