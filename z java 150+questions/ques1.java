// How to Print an Integer entered by an user

import java.util.Scanner;
public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("-->"+num);
    }
}