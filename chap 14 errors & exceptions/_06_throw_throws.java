class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius can't be negative";
    }

    @Override
    public String getMessage() {
        return "Radius can't be negative";
    }
}
public class _06_throw_throws{
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }
    public static int divide(int a, int b) throws ArithmeticException{
        //made by rahul
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        //viraj - uses divide () created  by rahul
        try {
            // int c = divide(5, 0);
            // System.out.println(c);
            double ar = area(-1);
            System.out.println(ar);
            
        } catch (Exception e) {
            System.out.println("Exception");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println(e);
        }


    

    }
}