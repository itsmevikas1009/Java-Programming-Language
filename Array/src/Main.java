import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Syntax
        // datatype[] variable_name = new datatype[size];
        // Store 5 Roll No
        int[] rollno = new int[5];
        // or
        int[] rollno2 = { 12, 32, 43, 65, 23 };

        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[10]; // initialization: actual here object is being created in the memor(heap)

        System.out.println(Arrays.toString(rollno));
        System.out.println(Arrays.toString(rollno2));
        System.out.println(Arrays.toString(ros));
    }
}