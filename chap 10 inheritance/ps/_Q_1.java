
class Circle {
    public int radius;
    Circle(){
        System.out.println("i am non parametre of circle");
    }
    Circle(int r) {
        System.out.println("I am circle parametarised constructor");
        this.radius = r;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder extends Circle {
    public int height;
    Cylinder(int r, int h){
        super(r);
        System.out.println("I am cylinder parametarised constructor");
        this.height = h;
    }

    public double volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}

public class _Q_1 {
    public static void main(String[] args) {
        //Circle obj1 = new Circle(12);
        //Circle a = new Cylinder(1, 5);
        Cylinder obj = new Cylinder(4,12);
       
    }

}
