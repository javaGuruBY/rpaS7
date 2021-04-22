package by.jrr.start.service;

import by.jrr.start.bean.Stock;

public class StockEnglandService  implements StockServiceInterface {

    private Stock stock;

    public StockEnglandService(Stock stock) {
        this.stock = stock;
    }

    public String getNameCompany() {
        return stock.getNameCompany();
    }

    public void setNameCompany(String nameCompany) {
        this.stock.setNameCompany(nameCompany);
    }

    public double getCurrentPrice() {
        return stock.getCurrentPrice();
    }

    public void setCurrentPrice(double currentPrice) {
        this.stock.setCurrentPrice(currentPrice);
    }

    public double getMinPrice() {
        return stock.getMinPrice();
    }

    public void setMinPrice(double minPrice) {
        this.stock.setMinPrice(minPrice);
    }

    public double getMaxPrice() {
        return stock.getMaxPrice();
    }

    public void setMaxPrice(double maxPrice) {
        this.stock.setMaxPrice(maxPrice);
    }

    public String printlnInformation() {
        if (stock.getMaxPrice() == null) {
            stock.setMaxPrice(0);
        }
        if (stock.getMinPrice() == null) {
            stock.setMinPrice(0);
        }
        return "God safe the Queen!" +
                "Company = " + getNameCompany() +
                ", CurrentPrice = " + getCurrentPrice() +
                ", Max Price = " + getMaxPrice() +
                ", Min Price = " + getMinPrice();
    }

    public void updatePrice(double newPrice){
        if (stock.getMinPrice() == null || newPrice <= stock.getMinPrice()){
            this.stock.setMinPrice(newPrice);
        }
        if(stock.getMaxPrice() == null || newPrice >= stock.getMaxPrice()){
            this.stock.setMaxPrice(newPrice);
        }
        this.setCurrentPrice(newPrice);
    }
}
