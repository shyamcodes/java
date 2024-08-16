class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

class CellPhone {
    public void ring() {
        System.out.println("Ringing...");
    }

    public void vibrate() {
        System.out.println("Vibrating...");
    }

    public void callFriend() {
        System.out.println("Calling...");
    }
}

class Square {
    int side;

    public int area() {
        return side * side;
    }

    public int perametre() {
        return 4 * side;
    }

}

class Tommy {
    public void hit() {
        System.out.println("Hitting the enemy");
    }

    public void run() {
        System.out.println("Running from the enemy");
    }

    public void fire() {
        System.out.println("Firing on the enemy");
    }
}

public class employee_detail {
    public static void main(String[] args) {
        /*
         * //Problem 1
         * Employee rahul = new Employee();
         * rahul.setName("CodeWithHarry");
         * rahul.salary = 233;
         * System.out.println(rahul.getSalary());
         * System.out.println(rahul.getName());
         * 
         * //problem 2
         * CellPhone asus = new CellPhone();
         * asus.callFriend();
         * asus.vibrate();
         * asus.ring();
         * 
         * 
         * // problem 3
         * Square sq = new Square();
         * sq.side = 3;
         * sq.area();
         * sq.perametre();
         * System.out.println(sq.area());
         * System.out.println(sq.perametre());
         */

        // problem 5
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();
    }
}
