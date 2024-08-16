interface Bycycle {
    int a = 45;
    void applyBreak(int decreament);
    void speedUp(int increament);
}
interface HornBycycle {
    int x = 56;    // we can over only these properties in classes only not main section.
    void blowHornK3g();
    void blowHornMhn();
}

class AvonCycle implements Bycycle, HornBycycle{

    void blowHorn() {
        System.out.println("pee pee pee");
    }

    public void applyBreak(int decreament) {
        System.out.println("Applying Break");
    }

    public void speedUp(int increament) {
        System.out.println("Applying Speed up");
    }

    public void blowHornK3g(){
        System.out.println("kabhi kushi kabhi gum...");
    }
    public void blowHornMhn(){
        System.out.println("me hu na...");
    }
}

public class _02_interfaces {
    public static void main(String[] args) {
        AvonCycle cycle = new AvonCycle();
        cycle.applyBreak(1);
        // you can create properties in interfaces.
        System.out.println(cycle.a);
        System.out.println(cycle.x);

        //cycle.a = 400;  /shows erorr.
        // you can cannot modify the properties of interaces as they are final.
        


        cycle.blowHornK3g();
        cycle.blowHornMhn();
    }
}
