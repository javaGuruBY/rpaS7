package Operations;

public class Addition implements Operation {


    public void calculate(int a, int b) {
        int add =  a + b;
        System.out.println("Сумма= " + add);
    }
}
