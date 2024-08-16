@FunctionalInterface
interface DemoAno {
   void meth1(int a);

   // void meth2();
}

// class RahulFunc implements DemoAno {
// public void meth1() {
// System.out.println("this is meth 1");
// }
// }

// class AnonyDemo implements DemoAno {
// public void display() {
// System.out.println("hello");
// }

// @Override
// public void meth1() {
// System.out.println("i am meth 1");
// }

// @Override
// public void meth2() {
// System.out.println("i am meth 2");
// }
// }

public class _02_annonomous_class {

   public static void main(String[] args) {
      // DemoAno obj = new AnonyDemo();
      // obj.meth1();

      // Anonomous class
      // DemoAno obj = new DemoAno() {
      //    @Override
      //    public void meth1() {
      //       System.out.println("i am meth 1");
      //    }

      //    @Override
      //    public void meth2() {
      //       System.out.println("i am meth 2");
      //    }
      // };
      // obj.meth1();


      //Lamda Expretion.
   //   DemoAno obj = new RahulFunc();
   //   obj.meth1();

   DemoAno obj = (a) ->{System.out.println("im meth 1 from this lamda"+ a);};
   obj.meth1(6);
   }
}
