package by.jrr.start.service;

public interface StockServiceInterface {
    String getNameCompany();

    void setNameCompany(String nameCompany);

    double getCurrentPrice();

    void setCurrentPrice(double currentPrice);

    double getMinPrice();

    void setMinPrice(double minPrice);

    double getMaxPrice();

    void setMaxPrice(double maxPrice);

    String printlnInformation();

    void updatePrice(double newPrice);
}
