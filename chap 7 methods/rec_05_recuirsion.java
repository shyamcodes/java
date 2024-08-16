import java.util.Scanner;

public class rec_05_recuirsion {
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = input.nextInt();
        System.out.printf("Factorial of %d  is = %d " ,n,factorial(n));
         
    }
}

