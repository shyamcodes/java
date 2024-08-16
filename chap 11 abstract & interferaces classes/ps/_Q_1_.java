
abstract class Pen {
    abstract void write();

    abstract void refil();
}

class fountainPan extends Pen {
    void write() {
        System.out.println("Writing");
    }

    void refil() {
        System.out.println("refil your pen");
    }

    void changeNib() {
        System.out.println("change a nib");
    }
}

class Monkey {
    void jump() {
        System.out.println("jumping...");
    }

    void bite() {
        System.out.println("Biting...");
    }
}

interface basicAnimal {
    void eat();

    void sleep();
}

class Human extends Monkey implements basicAnimal {
    void speak() {
        System.out.println("hello sir ! ");
    }

    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}

public class _Q_1_ {
    public static void main(String[] args) {
        // Q 1 or 2
        fountainPan pen = new fountainPan();
        pen.changeNib();

        // Q 2
        Human h = new Human();
        h.eat();
        h.sleep();

        // Q 5
        Monkey m1 = new Human();
        m1.jump();
        m1.bite();
        // m1.speak(); --> Cannot use speak method because the reference is monkey which
        // does not have speak method

        basicAnimal rahul = new Human();
        rahul.eat();
        rahul.sleep();
        // rahul.speak(); //-->error

    }

}
