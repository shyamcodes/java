

@FunctionalInterface
interface myFuntionalInterface{
    void method1();
    //void method2();
}
class Phone{
    public void showTime(){
        System.out.println("this is  8 pm");
    }
    public int sum(int a, int b){
       return a+b;
    }
}
class NewPhone extends Phone{
    @Override
    public void showTime(){
        System.out.println("no this is 9pm");
    }

    @Deprecated
    public int sum(int a, int b) {
        return super.sum(a, b);
    }
}
public class _01_annotation{
    @SuppressWarnings("Deprecated")
    public static void main(String[] args) {
        Phone ph = new NewPhone();
        ph.showTime();
        ph.sum(4,6);


    }
}
