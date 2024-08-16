public class func_02_overloading {
    static void tellJOke() {
        System.out.println("In invented a new word !\n" + "plagiarism");
    }

    static void change(int a) {
        a = 98;
    }
    static void change2(int [] arr) {
        arr[0] = 98;
    }
    public static void main(String[] args) {
        tellJOke();
        // changing the integer.
        // int x = 45;
        // change(x);
        // System.out.println("The value of x after change is: " + x);
         
        //changing the array.
        int[] marks = { 84, 65, 98, 45, 75, 94 };
        change2(marks);
        System.out.println("The value of 1st element changing array " +marks[0] );
    }
}
