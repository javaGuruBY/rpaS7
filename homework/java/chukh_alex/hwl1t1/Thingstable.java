package chukh_alex.hwl1t1;

public class Thingstable {

    double weight;
    double price;


    Thingstable(double a, double b) {
        weight = a;
        price = b;
        System.out.println("Weight:  " + a);
        System.out.println("Price(uah): " + b);
    }

    public void position1() {
        System.out.println("Thing under table.");
    }
    public void position2() {
        System.out.println("Thing on the table.");
    }
    public void position3() {
        System.out.println("Thing on the monitor.");
    }
    public void technics() {
        System.out.println("This is for programming!");
    }
    public void device() {
        System.out.println("Manipulator to help with computer operation.");
    }
    public void communication() {
        System.out.println("For communication with team.");
    }
    public void printing() {
        System.out.println("For printing.");
    }
    public void sound() {
        System.out.println("To listen to lectures.");
    }
    public void music() {
        System.out.println("For listening music:)");
    }
    public void light() {
        System.out.println("Light up the dark.");
    }
    public void yummy() {
        System.out.println("On my table always have yummy!");
    }

}
