import javax.swing.text.AbstractDocument.BranchElement;

public class _07_finally {
    public static int greet() {
        try {
            int a = 50;
            int b = 2;
            int c = a / b;
            return c;

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println(" Cleanup resureses... This is end of program");
        }
        return 0;
    }

    public static void main(String[] args) {
        
    //  int k = greet();
    //  System.out.println(k);
    
        try{
            System.out.println(5/0);
        }
        finally{
            System.out.println("this is finally");
        }int k = greet();
        System.out.println(k);

        int a = 7;
        int b = 9;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("I am finally for value " + b);
            }
            b--;
        }
    }

}
