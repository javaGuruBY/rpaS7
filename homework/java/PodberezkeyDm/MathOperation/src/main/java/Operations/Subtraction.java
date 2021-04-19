package Operations;

public class Subtraction implements Operation {
    @Override
    public void calculate(int a, int b) {
        int sub = a - b;
        System.out.println("Разность= " + sub);
    }
}
