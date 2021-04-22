package src.java.Operations;

public class Addition implements Operation{

    @Override
    public void calculate(int a, int b) {
       int add = a + b;
        System.out.println("Сумма " + add);
    }
}
