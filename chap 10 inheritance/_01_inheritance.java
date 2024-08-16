
class Base {
    int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("i am setting x now");
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am constructor");
    }

}
class Derived extends Base{
    int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
    public int sum(){
        return x + y;
    }
}
public class _01_inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(5);
        System.out.println(b.getX());

        Derived d = new Derived();
        d.setX(5);
        System.out.println(d.getX());
        d.setY(12);
        System.out.println(d.getY());
        System.out.println(d.sum());
    }

    
}
