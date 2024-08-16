package calc;

class Calculator {
    public void calculate(int a, int b) {
        System.out.println("your result is " + a + b);
    }

    public void scCalculate(int a, int b) {
        System.out.println("your result is " + Math.sin(a + b));
    }

    public void hyCalculate(int a, int b) {
        System.out.println("your result is " + a + b);
        System.out.println("your result is " + Math.sin(a + b));
    }
}

public class problem1 {
    public static void main(String[] args) {
        System.out.println("i m main method");
    }

}
