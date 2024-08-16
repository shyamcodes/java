//  Find Largest Among three numbers using if..else statement

import java.util.Scanner;

public class ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int n1 = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int n2 = sc.nextInt();
        System.out.println("Enter number 3 : ");
        int n3 = sc.nextInt();

        if ( n1 >= n2 && n1 >= n3 ) {
            System.out.println(n1+ " is greatest");
        }else if( n2>=n1 && n2>=n3 ){
            System.out.println(n2+ " is greatest");
        }else{
            System.out.println(n3+ " is greatest");
        }
    }

}
