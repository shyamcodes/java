import java.util.Scanner;

public class problem01 {
    public static void main(String[] args){
        int i,j;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number :");
        int n = sc.nextInt();

        // for(i=n; i>0; i--){
        //     for(j=0; j<i; j++){
        //         System.out.print("\t*");
        //     }
        //     System.out.print("\n");
        // }
        for(i=1; i<n; i++){
            for(j=1; j<i; j++){
                System.out.print("\t*");
            }
            System.out.print("\n");
        }
    }
    
}
