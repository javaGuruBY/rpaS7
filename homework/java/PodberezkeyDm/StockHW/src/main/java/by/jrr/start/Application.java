package by.jrr.start;

public class Application {

    public static void main(String[] args) {

        Stock google = new Stock("GOOG", 10);

        google.printlnInformation();

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        google.printlnInformation();

    }
}
