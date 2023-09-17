import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
            1 2 3
            2 4 7
            3 9 8
        */

//        int[][] arr = new int[3][];

        Scanner in = new Scanner(System.in);

        int[][] arr2D = {
                {1, 2 ,3}, //0th index
                {2, 4}, //1st index
                {3, 9, 8, 10} //2nd index -> arr2D[2] = {3, 9, 8, 10}
        };

        int[][] arr = new int[3][3];
        System.out.println(arr.length); //no of rows

        //input
        for(int row = 0; row < arr.length; row++) {
            //for each column in every row
            for(int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        //output

//        for(int row = 0; row < arr.length; row++) {
//            //for each column in every row
//            for(int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        //Another way to print Output

//        for(int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }

        //Enhanced for loop
        for(int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
