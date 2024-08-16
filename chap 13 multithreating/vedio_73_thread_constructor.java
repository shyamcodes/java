class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    // public void run() {
    //     int i = 0;
    //     while (i<20) {
    //         System.out.println("I am thread");
    //         i++;
    //     }
    // }
    public void run() {
        int i = 30;
       System.out.println("Thank you");
    }
}

public class vedio_73_thread_constructor {
    public static void main(String[] args) {
    MyThread t = new MyThread("Rahul");
    MyThread t1 = new MyThread("Ram ji");
    t.start();
    t1.start();
    System.out.println("The id of thread is t " + t.getId());
    System.out.println("The name of thread is  " + t.getName());
    System.out.println("The id of thread is t " + t1.getId());
    System.out.println("The name of thread is " + t1.getName());
    }

}
