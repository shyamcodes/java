package folder.folder1.folder2.folder3;

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

public class prob2 {
    protected int proInt = 4;
    int defInt = 41;
    public static void main(String[] args) {
        System.out.println("hellow ...");
    }

}
