
public class ps02 {
    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    static void pattern2(int n1) {
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        pattern(5);
        System.out.println(" ");
        pattern2(5);

    }
}