
class Cylinder {
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * 3.142 * radius * radius + 2 * 3.142 * radius * height;
    }

    public double volume() {
        // we can use Math.PI in place of 3.142 for more acurate value.
        return 3.142 * radius * radius * height;
    }
}

class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    public int rectArea(){
        return length * breadth;
    }
}

public class _Q_01 {
    public static void main(String[] args) {
        /*
         * //Cylinder myCylinder = new Cylinder();
         * Cylinder myCylinder = new Cylinder(12,9);
         * // Problem 1
         * //myCylinder.setHeight(12);
         * System.out.println(myCylinder.getHeight());
         * //myCylinder.setRadius(9);
         * System.out.println(myCylinder.getRadius());
         * 
         * //problem 2
         * System.out.println(myCylinder.surfaceArea());
         * System.out.println(myCylinder.volume());
         * }
         */
        
        // problem 4
        Rectangle r = new Rectangle();
        //Rectangle r = new Rectangle(12,48);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
        System.out.println(r.rectArea());
    }

}
