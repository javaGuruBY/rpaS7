package by.jrr.start;

import java.util.Objects;

public class Stock {

    private String nameCompany;
    private double currentPrice;
    private double minPrice;
    private double maxPrice;

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Stock(String nameCompany, double currentPrice) {
        this.nameCompany = nameCompany;
        this.currentPrice = currentPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return Double.compare(stock.currentPrice, currentPrice) == 0 && Double.compare(stock.minPrice, minPrice) == 0 && Double.compare(stock.maxPrice, maxPrice) == 0 && Objects.equals(nameCompany, stock.nameCompany);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameCompany, currentPrice, minPrice, maxPrice);
    }

    public String printlnInformation() {
        return "Company = " + nameCompany + ", CurrentPrice = " + currentPrice + ", Max Price = " + maxPrice + ", Min Price = " + minPrice;
    }

    public void updatePrice(double newPrice){
        if (currentPrice <= newPrice){
            this.minPrice = currentPrice;
        }else if(currentPrice >= newPrice){
            this.maxPrice = currentPrice;
        }
        this.currentPrice = newPrice;
    }

}
