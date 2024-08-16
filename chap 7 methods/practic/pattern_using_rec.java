public class pattern_using_rec {
    static void pattern(int n) {
        if (n > 0) {
            pattern(n - 1);
            for (int i = 1; i <= n; i++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }

    }

    public static void main(String[] artgs) {
        pattern(5);
    }

}
