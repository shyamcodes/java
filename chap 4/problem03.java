import java.util.Scanner;

public class problem03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day number:");
        int day = sc.nextInt();

        switch(day){
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tue");
            case 3 -> System.out.println("wed");
            case 4 -> System.out.println("thu");
            case 5 -> System.out.println("fri");
            case 6 -> System.out.println("sat");
            case 7 -> System.out.println("sun");
            default -> System.out.println("wrong input");

        // switch(day){
        //     case 1: 
        //     System.out.println("monday");
        //     break;
        //     case 2: 
        //     System.out.println("tue");
        //     break;
        //     case 3: 
        //     System.out.println("wed");
        //     break;
        //     case 4: 
        //     System.out.println("thu");
        //     break;
        //     case 5: 
        //     System.out.println("fri");
        //     break;
        //     case 6: 
        //     System.out.println("sat");
        //     break;
        //     case 7: 
        //     System.out.println("sun");
        //     break;
        //     default: 
        //     System.out.println("wrong input");
        }
    }
    
}
