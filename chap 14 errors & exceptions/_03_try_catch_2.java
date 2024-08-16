import java.util.Scanner;

public class _03_try_catch_2 {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 78;
        marks[1] = 79;
        marks[2] = 80;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index 1 :");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want divide the value with ");
        int number = sc.nextInt();

        try {
            System.out.println("The value at array index entered is " + marks[ind]);
            System.out.println("The value of array-value/number is " + marks[ind] / number);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occoured");
            System.out.println(e);
        }
         catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occoured");
            System.out.println(e);
        }
         catch (Exception e) {
            System.out.println("Some other exception occoured");
            System.out.println(e);
        }

    }

}
