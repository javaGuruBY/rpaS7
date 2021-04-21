package by.jrr.start.bean;

import java.util.Objects;

public class Stock {

    private String nameCompany;
    private Double currentPrice;
    private Double minPrice;
    private Double maxPrice;
    private String countryCode;

    public Stock() {
    }

    public Stock(String nameCompany, double currentPrice) {
        this.nameCompany = nameCompany;
        this.currentPrice = currentPrice;
    }

    public Stock(String nameCompany, Double currentPrice, String countryCode) {
        this.nameCompany = nameCompany;
        this.currentPrice = currentPrice;
        this.countryCode = countryCode;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public Double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return Objects.equals(nameCompany, stock.nameCompany) &&
                Objects.equals(currentPrice, stock.currentPrice) &&
                Objects.equals(minPrice, stock.minPrice) &&
                Objects.equals(maxPrice, stock.maxPrice) &&
                Objects.equals(countryCode, stock.countryCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameCompany, currentPrice, minPrice, maxPrice, countryCode);
    }

    @Override
    public String toString() {
        return "Stock{" +
                "nameCompany='" + nameCompany + '\'' +
                ", currentPrice=" + currentPrice +
                ", minPrice=" + minPrice +
                ", maxPrice=" + maxPrice +
                ", countryCode='" + countryCode + '\'' +
                '}';
    }
}
