package ryszardp.lection2;

public class MathOperationsDemo {

    private static int carWheelCount = 4;
    private static int puncturedWheelCount = 0;

    private static double soundVolume = 25.0;



    public static void main(String[] args) {
        puncturedWheelCount = 0;
        carWheelCount = carWheelCount - puncturedWheelCount;
        if (puncturedWheelCount == 1) {
            System.out.println("today punctured " + puncturedWheelCount + " wheel in my car, left " + carWheelCount);
        } else if (puncturedWheelCount > 1) {

            System.out.println("today punctured " + puncturedWheelCount + " wheels in my car, left " + carWheelCount);
        } else {
            System.out.println("wonderful day i can go, wheels in my car " + carWheelCount);
        }

        System.out.println();
        double piecesOfPizza = 8;
        double numberOfHungry = 3;
        System.out.println("pieces of pizza " + piecesOfPizza);
        System.out.println("number of person " + numberOfHungry);
        double piecesPerPerson = piecesOfPizza / numberOfHungry;
        String piecesPerPersonRounded = String.format("%.3f", piecesPerPerson);
        if (piecesOfPizza % numberOfHungry == 0) {
            System.out.println("equally! everyone got " + piecesPerPerson + "pieces");
        } else {
            System.out.println("not equally " + piecesPerPersonRounded);
        }

        double accountBalance = 10;
        double monthMarchSalary = 250;
        System.out.println("account Balance: " + accountBalance);
        System.out.println("march salary: " + monthMarchSalary);
        accountBalance = accountBalance + monthMarchSalary;
        System.out.println("account Balance after march salary: " + accountBalance);


        int secondsInMinutes = 60;
        int minutesInHour = 60;
        int hourInDay = 24;
        int daysInMarch = 30;
        int secondsInMarch = secondsInMinutes * minutesInHour * hourInDay * daysInMarch;
        System.out.println("seconds in march: " + secondsInMarch);

    }
}
