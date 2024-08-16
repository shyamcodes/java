
class EkClass {
    int a;

    public int getA() {
        return a;
    }

    EkClass(int a) {
        this.a = a;
    }

    public int returnone() {
        return 1;
    }
}

class DoClass extends EkClass {
    DoClass(int c) {
        super(c);
        System.out.println("i am construcctor of do class");
    }
}

public class _03_this_class {
    public static void main(String[] args) {
        EkClass e = new EkClass(65);
        DoClass d = new DoClass(5);
        System.out.println(e.getA());
    }
}