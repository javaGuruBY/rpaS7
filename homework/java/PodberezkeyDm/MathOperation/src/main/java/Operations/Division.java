package Operations;

public class Division implements Operation {
    @Override
    public void calculate(int a, int b) {
        if (b != 0) {
            int div = a / b;
            System.out.println("Частное= " + div);
        } else System.out.println("Ошибка!!!Деление на ноль");

    }
}
