import java.io.FileWriter;

class MyDeprecated {
    @Deprecated
    public void meth1() {
        System.out.println("hellow i meth1");
    }
}

interface MyInt {
    void display();
}

public class practice_set {
    @SuppressWarnings("Deprecated")
    public static void main(String[] args) {
        // MyDeprecated d = new MyDeprecated();
        // d.meth1();

        // lamda expression or anonomous class
        /*
         * MyInt i = () ->{
         * System.out.println("display");
         * };
         * i.display();
         * 
         * MyInt i = new MyInt(){
         * 
         * @Override
         * public void display(){
         * System.out.println("display");
         * }
         * };
         * i.display();
         */


         int a=5,i;
         String table= "";
         for(i=0; i<10; i++){
            table += a + "X" + (i+1) + "=" + a*(i+1);
            table +="\n";
         }
        try {
            FileWriter fileWriter = new FileWriter("mulplicarionTable.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (Exception e) {
            e.getStackTrace();
        }

    }
}
