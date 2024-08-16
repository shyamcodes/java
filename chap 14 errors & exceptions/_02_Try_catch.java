
//How to handle exceptions.
public class _02_Try_catch {
    public static void main(String[] args) {
        int a = 6000, b = 0;

        //without try
        int c = a/b;
        System.out.println("the result is " + c);

        //with try
        // try{
        //     int c = a/b;
        //     System.out.println("the result is " +c);
        // }catch(Exception e){
        //     System.out.println("failed to devide. reasion: ");
        //     System.out.println(e);
        // }
        System.out.println("End of the program");
    }
}
