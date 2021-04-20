package io.github.naruhin.lecture3.classes;

public class Product {
    private String name;
    private double regularPrice;
    private double discount;

    public Product() {

    }

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public double getDiscount() {
        return discount;
    }


    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        if(discount >= 0 && discount <= 100){
            this.discount = discount;
        }else{
            System.out.println("Discount can be only in range from 0% to 100%");
        }

    }

    public double actualPrice(){
        return this.regularPrice-(this.regularPrice * this.discount) / 100;
    }


    @Override
    public String toString() {
        return "Product: " +
                "Name ='" + this.name + '\'' +
                ", regular price = " + this.regularPrice +
                " EUR, discount = " + this.discount +
                " %, actualPrice = " + actualPrice() + " EUR";
    }
}
