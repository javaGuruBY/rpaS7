package io.github.grandckay.lecture3.task5;

public class Product {
    private String name;
    private double regularPrice;
    private double discount;

    public Product(String name) {
        this.name = name;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double actualPrice() {
        double savings = regularPrice / 100 * discount;
        return regularPrice - savings;
    }

    public void printInformation() {
        double actualPriceDouble = actualPrice();

        String productInfo = "Product : name = \"" + name + "\", regular price = "
                + regularPrice + " EUR, discount = " + (int) discount + "%, actual price = "
                + actualPriceDouble + " EUR";

        System.out.println(productInfo);
    }

}
