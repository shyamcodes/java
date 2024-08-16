public class method_03_overloading {
    static void foo() {
        System.out.println("Good moring");
    }

    static void foo(int a) {
        System.out.println("Good moring " + a + " Bro ");
    }

    static void foo(int a, int b) {
        System.out.println("Good moring " + a + " Bro ");
        System.out.println("Good moring " + b + " Bro ");
    }

    public static void main(String[] args) {
        foo();
        foo(3000); // argument are the actual values
        foo(3000, 4000);

    }
}
