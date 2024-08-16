import java.util.HashSet;

public class _04_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6,0.5f);
        myHashSet.add(5);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(9);
        myHashSet.add(2);
        System.out.println(myHashSet);
        myHashSet.clear();
    }
    
}
