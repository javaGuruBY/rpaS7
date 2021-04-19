package src.java.Operations;

public class Division implements Operation{
    @Override
    public void calculate(int a, int b) {
        if (b != 0) {
            int div = a / b;
            System.out.println("Частное " + div);
        }
        System.out.println("Ошибка!!!");
    }
}
