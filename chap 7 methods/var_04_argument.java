public class var_04_argument {
    // static int sum(int a, int b){
    //     return a+b;
    // }
    // static int sum(int a, int b, int c){
    //     return a+b+c;
    // }
    // static int sum(int a, int b, int c, int d){
    //     return a+b+c+d;
    static int sum(int x, int ...arr){ 
        //Available as int[] arr.
        int result = 0;
        for(int a : arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println("The sum of integers: " + sum(4,5));
        System.out.println("The sum of integers: " + sum(4,5,5));
        System.out.println("The sum of integers: " + sum(4,5,5,3));
        System.out.println("The sum of integers: " + sum(4,5,5,7,8));
        System.out.println("THe sum of nothing is : " +sum(2));
    }
    
}
