package by.jrr.start.rysard_poplavskij.stock;

import java.util.Objects;

public class Stock {

    private String name;
    private double price;
    private double minPrice;
    private double maxPrice;

    public Stock() {
    }

    public Stock(String name, double price, double minPrice, double maxPrice) {
        this.name = name;
        this.price = price;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return Double.compare(stock.price, price) == 0 &&
                Double.compare(stock.minPrice, minPrice) == 0 &&
                Double.compare(stock.maxPrice, maxPrice) == 0 &&
                Objects.equals(name, stock.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, minPrice, maxPrice);
    }

    public void updatePrice(double newPrice, double maxPrice, double minPrice) {
        this.price = newPrice;
        this.maxPrice = maxPrice;
        this.minPrice = minPrice;
    }

    public String printInformation(Stock stock) {
        return "Company = \"" + stock.name + "\", Current Price = " + stock.price + " , Min Price = " +
                stock.minPrice + "10, Max Price = " + stock.maxPrice;

    }

}
