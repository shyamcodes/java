import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter math marks:");
        int math = sc.nextInt();
        System.out.println("Enter eng marks:");
        int eng = sc.nextInt();
        System.out.println("Enter phy marks:");
        int phy = sc.nextInt();
        System.out.println("Enter chem marks:");
        int chem = sc.nextInt();
        System.out.println("Enter hindi marks:");
        int hindi = sc.nextInt();

        int totalMarks = math + eng + phy + chem + hindi;
        float per = (float)totalMarks / 500 *100;
        System.out.println("per:\n" +per);
    }
}
