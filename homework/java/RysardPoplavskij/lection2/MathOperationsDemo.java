package RysardPoplavskij.lection2;

public class MathOperationsDemo {

    private static int carWheelCount = 4;
    private static int puncturedWheelCount = 0;

    private static double soundVolume = 25.0;



    public static void main(String[] args) {


        puncturedWheelCount = 0;
        Subtraction subtraction = new Subtraction(carWheelCount, puncturedWheelCount);
        carWheelCount = subtraction.calculate();

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
        Division division = new Division(piecesOfPizza,numberOfHungry);
       double piecesPerPerson = division.calculate();
        String piecesPerPersonRounded = String.format("%.3f", piecesPerPerson);
        if (piecesOfPizza % numberOfHungry == 0) {
            System.out.println("equally! everyone got " + piecesPerPerson + "pieces");
        } else {
            System.out.println("not equally " + piecesPerPersonRounded);
        }

        System.out.println();

        int accountBalance = 10;
        int monthMarchSalary = 250;
        System.out.println("account Balance: " + accountBalance);
        System.out.println("march salary: " + monthMarchSalary);
        Addition addition = new Addition(accountBalance,monthMarchSalary);
        accountBalance = addition.calculate();

        System.out.println("account Balance after march salary: " + accountBalance);

        System.out.println();
        System.out.println("Multiplication ");
        int hourInDay = 24;
        int daysInMarch = 30;
        Multiplication multiplication = new Multiplication(hourInDay,daysInMarch);
        int hoursInMarch = multiplication.calculate();
        System.out.println("hours in march: " + hoursInMarch);

    }
}
