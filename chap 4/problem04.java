import java.util.Scanner;

public class problem04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year:");
        int yr = sc.nextInt();

        if(yr%100==0 && yr%400==0 && yr%4==0){
            System.out.println("leap year");
        }else{
            System.out.println("not leap year");
        }

    }
}