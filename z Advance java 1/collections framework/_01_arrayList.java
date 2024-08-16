import java.util.*;

public class _01_arrayList{
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(15);
        l2.add(18);
        l2.add(20);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(4);
        l1.add(0,5);
        l1.add(0,1);
        //l1.addAll(l2);
        l1.addAll(0,l2);
        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(7));
        System.out.println(l1.lastIndexOf(8));
        //l1.clear();
        l1.set(1,566);
        for(int i = 0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}