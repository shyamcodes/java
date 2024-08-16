class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i<50) {
            System.out.println("My cooking thread1 is running");
            System.out.println("I am happy..");
            i++;
        }
    }
}
class MyThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i<50) {
            System.out.println("Thread 2 chatting with her");
            System.out.println("I am said ");
            i++;
        }
    }
}

public class vedio_70 {
    public static void main(String[] args) {
    MyThread1 t1 = new MyThread1();
    MyThread2 t2 = new MyThread2();
    t1.start();
    t2.start();
    }
}
