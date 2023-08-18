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

    //Function to Print FLOYD'S Triangle
    public static void Floyd_Triangle(int n) {
        int counter = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    //Function to Print 0-1 Triangle
    public static void zero_one_Triangle(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if((i + j) % 2 == 0){
                    System.out.print("1 ");
                } else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    //Function to Print Butterfly Pattern
    public static void Butterfly_Pattern(int n){
        //first half
        for(int i = 1; i <= n; i++){
            //stars - i
            for(int j =1; j  <= i; j++){
                System.out.print("* ");
            }
            //spaces - 2*(n-i)
            for(int j = 1; j  <= 2*(n - i); j++){
                System.out.print("  ");
            }
            //stars - i
            for(int j =1; j  <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //second half
        for(int i = n; i >= 1; i--){
            //stars - i
            for(int j =1; j  <= i; j++){
                System.out.print("* ");
            }
            //spaces - 2*(n-i)
            for(int j = 1; j  <= 2*(n - i); j++){
                System.out.print("  ");
            }
            //stars - i
            for(int j =1; j  <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Function to Print SOLID RHOMBUS
    public static void Solid_Rhombus(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Funtion to Print Hollow RHOMBUS
    public static void Hollow_Rhombus(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n || j == 1 || j== n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    //Function to Print Diamond Pattern
    public static void Diamond_Pattern(int n){
        //first half
        for(int i = 1; i <= n; i++){
            //spaces - n-i
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            //stars - 2*i -1
            for(int j = 1; j <= 2*i - 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //second half
        for(int i = n; i >= 1; i--){
            //spaces - n-i
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            //stars - 2*i -1
            for(int j = 1; j <= 2*i - 1; j++){
                System.out.print("* ");
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

        //Function Call for Inverted & Half Rotated Pyramid
        /*
        System.out.print("Enter number of Row: ");
        int n = sc.nextInt();
        half_rotated_Pyramid(n);
        */

        //Function Call for Print Inverted Half-Pyramid with Numbers
        /*
        System.out.print("Enter Number of Row: ");
        int num = sc.nextInt();
        half_Pyramid_Num(num);
        */

        //Function Call for Printing FLOYD'S Triangle
        /*
        System.out.print("Enter Number of Row: ");
        int n1 = sc.nextInt();
        Floyd_Triangle(n1);
        */

        //Function Call for Printing 0-1 Triangle
        /*
        System.out.print("Enter Number of Row: ");
        int n2 = sc.nextInt();
        zero_one_Triangle(n2);
        */

        //Function Call for Printing Butterfly Patter
        /*
        System.out.print("Enter Number of Row: ");
        int n3 = sc.nextInt();
        Butterfly_Pattern(n3);
        */

        //Function Call for Printing SOLID RHOMBUS
        /*
        System.out.print("Enter Number of Row: ");
        int n4 = sc.nextInt();
        Solid_Rhombus(n4);
        */

        //Function Call for Printing Hollow RHOMBUS
        /*
        System.out.print("Enter Number of Row: ");
        int n5 = sc.nextInt();
        Hollow_Rhombus(n5);
        */

        //Function Call for Printing Diamond Patten
        System.out.print("Enter Number of Row: ");
        int n6 = sc.nextInt();
        Diamond_Pattern(n6);
    }

}
