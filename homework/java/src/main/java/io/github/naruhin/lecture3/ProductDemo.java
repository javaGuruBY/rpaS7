package io.github.naruhin.lecture3;

import io.github.naruhin.lecture3.classes.Product;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Milk");
        product.setRegularPrice(0.8);
        product.setDiscount(123);
        System.out.println(product);


    }
}
