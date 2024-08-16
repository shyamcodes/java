
public class ps03 {
    public static void main(String[] args){
        //reverde array
        
        int [] arr = {1,2,3,4,5};
        int l = arr.length;
        int temp;
        int n = Math.floorDiv(l, 2);
       
        for(int i = 0; i<n; i++){
            //swap arr[i] amd arr[l-1-i]
            // a    b    temp
            //|4|  |3|    | |

            temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp;
        }
        for (int element : arr) {
            System.out.print(element + " ");
            
        }
    }
}