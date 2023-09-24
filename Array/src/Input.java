import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Array of primitives
        int[] arr = new int[5];
        arr[0] = 212;
        arr[1] = 54;
        arr[2] = 76;
        arr[3] = 56;
        arr[4] = 98;
        // [212, 54, 76, 56, 98]
        System.out.println(arr[3]);

        // Input using for loops
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // for (int num : arr) { //for every element in array, print the element
        // System.out.print(num + " "); //here num represents element of the array
        // }

        // System.out.println(arr[5]); //Index out of bound of error

        System.out.println(Arrays.toString(arr));

        // Array of Objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        // Output

        // for(String S : str){
        // System.out.println(S);
        // }
        // Output

        System.out.println(Arrays.toString(str));

        // Modify
        str[3] = "Devil";

        System.out.println(Arrays.toString(str));

        in.close();
    }
}
