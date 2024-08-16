public class ps {

    // sum(n) = 1 + 2 + 3... + n
    // sum(n) = 1 + 2 + 3... + n-1 + n
    // sum(n) = sum(n-1) + n
    // sum(3) = 3 + sum(2)
    // sum(3) = 3 + 2 + sum(1)
    // sum(3) = 3 + 2 + 1
    static int sumRec(int n){
        //Base condition
        if(n==1){
            return 1;
        }else{
            return n + sumRec(n-1);
        }
    }
    public static void main(String[] args){
        int c = sumRec(5);
        System.out.println(c);
        
    }
}
