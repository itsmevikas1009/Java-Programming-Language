import java.util.Scanner;

public class Pattern_Part_II {
    //Function to Print Hollow Rectangle
    public static void Hollow_Rec(int row, int col){
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= col; j++){
                if(i == 1 || j == 1 || i == row || j == col){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    //FUnction to print Inverted & Half Rotated Pyramid
    public static void half_rotated_Pyramid(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Function to Inverted Half-Pyramid with Numbers
    public static void half_Pyramid_Num(int num) {
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= num - i + 1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Function Call for Hollow Rectange
        /*
        System.out.print("Enter Number of Row: ");
        int row = sc.nextInt();
        System.out.print("Enter Number of Column: ");
        int col = sc.nextInt();
        Hollow_Rec(row,col);
        */

        //Function call for Inverted & Half Rotated Pyramid
        /*
        System.out.print("Enter number of Row: ");
        int n = sc.nextInt();
        half_rotated_Pyramid(n);
        */

        //Function call for Print Inverted Half-Pyramid with Numbers
        System.out.print("Enter Number of Row: ");
        int num = sc.nextInt();
        half_Pyramid_Num(num);


    }

}
