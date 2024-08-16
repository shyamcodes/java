//  Swap two numbers using temporary variable
public class ques4 {
    public static void main(String[] args){
        int n1=5,n2=6;
         System.out.println("before swapping n1 is: " +n1);         
         System.out.println("before swapping n2 is: " +n2);

         int temp = n1;
         n1=n2;
         n2=temp;

         System.out.println("After swapping n1 and n2 is " +n1+n2);

    }
}
