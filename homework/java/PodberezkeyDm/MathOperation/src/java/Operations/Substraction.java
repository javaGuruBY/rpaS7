package src.java.Operations;

public class Substraction implements Operation{
    @Override
    public void calculate(int a, int b) {
        int sub = a - b;
        System.out.println("Разность " + sub);
    }
}
