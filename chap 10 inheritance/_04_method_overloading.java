//method over ride.

class A {
    public int a;

    public int rahul() {
        return 4;
    }

    public void meth2() {
        System.out.println("I am method 2 of class a");
    }
}

class B extends A {
    @Override  // this no tation tells function over ride or not if you don't use it dificlult to find error.
    public void meth2() {
        System.out.println("I am method 2 of class b");
    }

    public void meth3() {
        System.out.println("i am method 3 of class B");
    }
}

public class _04_method_overloading {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
    }

}
