import java.util.Scanner;

public class Arrays {

    //Passing Array as Arguments
    public static void Update_Marks(int marks[]){
        for(int i = 0; i < marks.length; i++){
            marks[i] += 1;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Creating an Array
        int marks[] = new int[0];

        System.out.print("Enter Marks of Physics: ");
        marks[0] = sc.nextInt();
        System.out.print("Enter Marks of Chemistry: ");
        marks[1] = sc.nextInt();
        System.out.print("Enter Marks of Maths: ");
        marks[2] = sc.nextInt();

        System.out.println("Phy : " + marks[0]);
        System.out.println("Chem : " + marks[1]);
        System.out.println("Maths : " + marks[2]);

        Update_Marks(marks);
        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        // declares an Array of integers.
        int[] arr;

        // allocating memory for 5 integers.
        arr = new int[5];

        // initialize the first elements of the array
        arr[0] = 10;

        // initialize the second elements of the array
        arr[1] = 20;

        // so on...
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + " : " + arr[i]);
        }

        
    }
}
