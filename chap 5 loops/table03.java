import java.util.Scanner;

public class table03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // table
        int n, i;
        System.out.println("Enter a number :");
        n = sc.nextInt();
        
        // for (i = 1; i <= 10; i++) {
        //     System.out.printf("%d x %d = %d\n", n, i, n * i);
        // }

       

        // // revers table
        // System.out.println("Enter a number :");
        // n = sc.nextInt();

        // for (i = 10; i >= 1; i--) {
        //     System.out.printf("%d x %d = %d\n", n, i, n * i);
        // }

        //factorial
        int fact = 1;

        for(i=1; i<=n; i++){
            fact = fact*i;
            System.out.println("factorial : " +fact);
        }
    }

}
