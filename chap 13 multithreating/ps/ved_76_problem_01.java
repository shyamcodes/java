class chapter1 extends Thread {
    public void run() {
        int i = 0;
        //while (i < 20) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Good Moring");
           // i++;
        //}
    }
}

class chapter2 extends Thread {
    public void run() {
        int i = 0;
       // while (i < 20) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Welcome");
          //  i++;
       // }
    }
}

public class ved_76_problem_01 {
    public static void main(String[] args) {
        chapter1 p1 = new chapter1();
        chapter2 p2 = new chapter2();
        p1.setPriority(5);
        p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
        p1.start();
        p2.start();
    }
}
