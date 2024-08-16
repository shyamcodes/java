import java.util.Scanner;

public class fib03 {
    static int fib(int n) {
        // if (n == 1) {
        //     return 0;
        // } else if (n == 2) {
        //     return 1;
        // } else {
        //     return fib(n - 1) + fib(n - 2);
        // }

        //short method 
        if(n==1 || n==2){
            return n-1;
        }else{
            return fib(n-1) + fib(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        int result = fib(n);
        System.out.println(result);
    }
}
