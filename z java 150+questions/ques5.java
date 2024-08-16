// : Check whether a number is even or odd using if...else statement
import java.util.Scanner;
public class ques5{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter any number to check even or odd: ");
        int n = num.nextInt();

        if(n%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}