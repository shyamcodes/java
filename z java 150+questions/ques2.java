// Program to Add Two Integers by taking user input

import java.util.*;

public class ques2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Enter num1: ");
        int num1 = num.nextInt();

        System.out.println("Enter num2: ");
        int num2 = num.nextInt();

        int sum = num1 + num2;

        System.out.println("sum of " +num1+ " + " +num2+ " = " +sum);


        //multiply two floating values
        
        float first = 1.5f;
        float second = 2.0f;

        float product = first * second;

        System.out.println("The product is: " + product);

        //Compute Quotient and Remainder
        int dividend = 25, divisor = 4;

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
    
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}