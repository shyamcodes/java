import java.util.Scanner;


public class problem02 {
    public static void main(String[] args){
        int i, sum=0,n,m;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ente number:");
        n = sc.nextInt();

        for(i=0; i<n; i++){
            m = 2*i;
            System.out.println(m);
            sum = sum + (2*i);
        }
        System.out.println("sum of n even number :" +sum);
    }
    
}
