public class ps05 {
    public static void main(String[] args) {
        boolean isSorted = true;
        int[] arr = { 1, 2, 3, 345,45,67};
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }else{
            System.out.println("The Array is not sorted");
        }
    }
}
