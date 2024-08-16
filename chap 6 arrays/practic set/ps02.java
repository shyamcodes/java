import java.util.Scanner;

public class ps02 {
    public static void main(String[] args) {
        /*
         * int [][] mat1 = {{1, 2, 3}
         * ,{4, 5, 6}};
         * int [][] mat2 = {{1, 2, 3}
         * ,{4, 5, 6}};
         * int [][] result = {{0, 0, 0}
         * ,{0, 0, 0}};
         * 
         * for(int i = 0; i<mat1.length; i++){ //row no. of times
         * for(int j = 0; j<mat1[i].length; j++){ //column no. of times
         * result[i][j] = mat1[i][j] + mat2[i][j];
         * System.out.println(result[i][j] +" ");
         * }
         * System.out.println("");
         * }
         */

        // taking input from user

        int[][] matrix1 = new int[2][3];
        int[][] matrix2 = new int[2][3];
        int[][] sum = new int[2][3];

        Scanner input = new Scanner(System.in);

        // Get input for matrix1
        System.out.println("Enter the elements of matrix1:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }

        // Get input for matrix2
        System.out.println("Enter the elements of matrix2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }

        // Add the matrices together
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Display the sum
        System.out.println("The sum of the matrices is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
