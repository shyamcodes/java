import java.util.Scanner;

public class problem02 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     byte m1 , m2 , m3;

     System.out.println("Enter your marks maths");
     m1 = sc.nextByte();
     System.out.println("Enter your marks chem");
     m2 = sc.nextByte();
     System.out.println("Enter your marks phy");
     m3 = sc.nextByte();
     
    float avg = (m1+m2+m3)/3.0f;
    System.out.println("your overall percent" +avg);

    if(avg>=40 && m1>=30 && m2>=30 && m3>=30){
        System.out.println("your pass");
    }else{
        System.out.println("your are fail");
    }
        
    }
}