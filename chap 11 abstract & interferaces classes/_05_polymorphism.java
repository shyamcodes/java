interface myCameara {
    void takeSnap();

    void recordVedio();

    private void greet() {
        System.out.println("Good Morining");
    }

    default void recod4kVedio() {
        greet();
        System.out.println("Recoring in 4k vedio");
    }
}

interface myWiFi {
    String[] getNetwork();

    void connectToNetwork(String networkName);
}

class myCellPhone {
    void callNumber(int number) {
        System.out.println("calling..." + number);
    }

    void pickCall() {
        System.out.println("Connecting..");
    }
}

class mySmartPhone extends myCellPhone implements myCameara, myWiFi {
    public void takeSnap() {
        System.out.println("Taking Snaps...");
    }

    public void recordVedio() {
        System.out.println("Recording..");
    }

    // public void recod4kVedio(){
    // System.out.println(" taking snap & recoring in 4k vedio");
    // }
    public String[] getNetwork() {
        System.out.println("getting Nework list");
        String[] networkList = { "rahul", "Sikha", "Kripto", "Airtel" };
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}

public class _05_polymorphism {
    public static void main(String[] args) {
        myCameara cam = new mySmartPhone();
        // cam.getNetwork(); //Not allowed.
        cam.takeSnap();
    }
}