package by.jrr.start.service;

import by.jrr.start.bean.Stock;

import java.util.Optional;

public class StockService implements StockServiceInterface {

    private Stock stock;

    public StockService(Stock stock) {
        this.stock = stock;
    }

    @Override
    public String getNameCompany() {
        return stock.getNameCompany();
    }

    @Override
    public void setNameCompany(String nameCompany) {
        this.stock.setNameCompany(nameCompany);
    }

    @Override
    public double getCurrentPrice() {
        return stock.getCurrentPrice();
    }

    @Override
    public void setCurrentPrice(double currentPrice) {
        this.stock.setCurrentPrice(currentPrice);
    }

    @Override
    public double getMinPrice() {
        return stock.getMinPrice();
    }

    @Override
    public void setMinPrice(double minPrice) {
        this.stock.setMinPrice(minPrice);
    }

    @Override
    public double getMaxPrice() {
        return stock.getMaxPrice();
    }

    @Override
    public void setMaxPrice(double maxPrice) {
        this.stock.setMaxPrice(maxPrice);
    }

    @Override
    public String printlnInformation() {
        if (stock.getMaxPrice() == null) {
            stock.setMaxPrice(0);
        }
        if (stock.getMinPrice() == null) {
            stock.setMinPrice(0);
        }
        return "Company = " + getNameCompany() +
                ", CurrentPrice = " + getCurrentPrice() +
                ", Max Price = " + getMaxPrice() +
                ", Min Price = " + getMinPrice();
    }

    @Override
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
