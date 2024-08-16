import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.LinkedList;

public class ps {
    public static void main(String[] args) {
        //ps Q1
        // ArrayList arr = new ArrayList();
        // arr.add("Stundent 1");
        // arr.add("Stundent 2");
        // arr.add("Stundent 3");
        // arr.add("Stundent 4");
        // arr.add("Stundent 5");
        // arr.add("Stundent 6");
        // arr.add("Stundent 7");
        // arr.add("Stundent 8");
        // arr.add("Stundent 9");
        // arr.add("Stundent 10");
        // arr.add(0,"rahul");
        // for(Object o:arr){
        //     System.out.println(o);
        // }
        //Q2
        // HashSet<Integer> s = new HashSet();
        // s.add(4);
        // s.add(46);
        // s.add(84);
        // s.add(486);
        // s.add(78);
        // System.out.println(s);

        //Q2
        // Date d = new Date();
        // System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

        //Q3 
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) +":"+ c.get(Calendar.MINUTE) +":"+ c.get(Calendar.SECOND));

        //Q4
        LocalDateTime dt = LocalDateTime.now(); // This is the date
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s"); // This is the format
        String myDate = dt.format(df); // Creating date string using date and format
        System.out.println(myDate);
}
    }
    

