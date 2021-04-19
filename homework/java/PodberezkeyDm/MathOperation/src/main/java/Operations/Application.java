package Operations;

import java.util.Scanner;

public class Application {

    int a;
    int b;
    private Scanner scanner= new Scanner(System.in);

    public void start(){
        System.out.println("Привет!)");
        run();
        System.out.println("Пока!)");
    }

    private void run(){
        while (true){
            showMenu();
            System.out.print ("Ваш выбор   ");
            int number = scanner.nextInt();
            if (number == 0){
                break;
            }
            Operation operation = getAction(number);
            System.out.print("Введите первое число   ");
            a = scanner.nextInt();
            System.out.print("Введите второе число    ");
            b = scanner.nextInt();
            operation.calculate(a,b);

        }
    }

    private  Operation getAction(int number){
        switch (number){
            case 1:
                return new Addition();
            case 2:
                return new Subtraction();
            case 3:
                return new Multiplication();
            case 4:
                return new Division();

        }
        return null;
    }

    private void showMenu(){
        System.out.println("Выберите операцию");
        System.out.println("1 - Сложение");
        System.out.println("2 - Вычитание");
        System.out.println("3 - Умножение");
        System.out.println("4 - Деление");
        System.out.println("0 - ВЫХОД");

    }
}