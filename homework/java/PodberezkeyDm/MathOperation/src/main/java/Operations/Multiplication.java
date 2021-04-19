package Operations;

public class Multiplication implements Operation {
    @Override
    public void calculate(int a, int b) {
        int mult = a*b;
        System.out.println("Произведение= " + mult );
    }
}
