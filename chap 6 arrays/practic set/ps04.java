public class ps04 {
  public static void main(String[] args) {
    int[] arr = { 2, 3, 345, -576, 13, 44 };
    int max = Integer.MIN_VALUE;
    for (int e : arr) {
      if (e > max) {
        max = e;
      }
    }
    System.out.println("The maximum value of this array is:  " + max);
    //problem Q1.
    System.out.println(Integer.MIN_VALUE);
    System.out.println(Integer.MAX_VALUE);
  }
}
