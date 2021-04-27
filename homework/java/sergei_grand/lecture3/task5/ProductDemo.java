package io.github.grandckay.lecture3.task5;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Milk");
        product.setRegularPrice(0.8);
        product.setDiscount(20);

        System.out.println("product.actualPrice() = " + product.actualPrice());
        product.printInformation();
    }
}
