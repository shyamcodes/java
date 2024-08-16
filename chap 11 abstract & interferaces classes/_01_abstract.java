
abstract class Parent {
    public Parent() {
        System.out.println("i am constructor of class 1");
    }

    public void sayHello() {
        System.out.println("Hellow");
    }

    abstract public void greet();

    abstract public void greet1();
}

class Child extends Parent {
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }

    @Override
    public void greet1() {
        System.out.println("Good Afternoon");
    }
}

abstract class Child1 extends Parent {
    public void th() {
        System.out.println(" i am good ");
    }
}

public class _01_abstract {
    public static void main(String[] args) {
        // Parent p = new Parent(); -- error
        Child c = new Child();
        // Child1 c3 = new Child1(); -- error
    }
}
