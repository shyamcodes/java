// Check whether an alphabet is vowel or consonant using if..else statement
import java.util.*;
public class ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Letters to check vowel  or constant: ");
        char c = sc.next.charAt(0);

        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            System.out.println("Vowel");
        }else{
            System.out.println("constant");
        }
    }
    
}
