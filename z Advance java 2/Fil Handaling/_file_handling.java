import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class _file_handling {
    public static void main(String[] args) {
        // code to create a new file.
        /*
         * File myFile = new File("CWH_file1.txt");
         * try {
         * myFile.createNewFile();
         * } catch (IOException e) {
         * System.out.println("Unable to create this file");
         * e.printStackTrace();
         * }
         */

        // code to right to a file.
        /* 
        try {
            FileWriter myFileWriter = new FileWriter("CWH_file1.txt");
            myFileWriter.write("hellow , this is first java file.\n okay now bye.");
            myFileWriter.close();
        } catch (IOException e) {
           e.getStackTrace();
        }
        */

        //Reading a file.
        /* 
        File myFile = new File("this.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
        */

        // Delete file
        File myFile = new File("CWH_file1.txt");
        if(myFile.delete()){
            System.out.println("I have deleted" + myFile.getName());
        }else{
            System.out.println("Some error occoured while deleting tghe file");
        }
    }

}
