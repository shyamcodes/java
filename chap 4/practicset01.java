import java.util.Scanner;

public class practicset01 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        //  System.out.println("Enter your age:");
        //  int age = sc.nextInt();
        
        // if(age>=18){
        //     System.out.println("they derive");
        // }else{
        //     System.out.println("they can't derive");
        // }

        // System.out.println("Enter yopur age :");
        // int age = sc.nextInt();

        //inhance switch case.
        String var = "rahul";

        switch(var){
            case "rahul"->
            System.out.println("you are rahul");
            
            case "ram"->
            System.out.println("you are god");
            
            case "ravi"->
            System.out.println("you are old men");
             
            default->
            System.out.println("enjoy your life");
        }
    }
}
