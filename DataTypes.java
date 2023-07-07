import java.util.*;

public class DataTypes {
    public static void main(String[] args){
        // DataTypes and there Size
        byte by = 8; //1byte
        System.out.println(by);
        char ch = 'a'; //2bytes
        System.out.println(ch);
        boolean bol = false; //1byte
        float price = 10.5F; //4bytes
        int number = 25; //4bytes
        //long 8bytes
        //double 8bytes
        short n = 240; //2bytes

        // CODE TO CALCULATE SUM
        int a = 10;
        int b = 5;
        int sum = a + b;
        System.out.println(a+" + "+b+" = "+sum);

        //Input in Java
        Scanner sc = new Scanner(System.in);
        /*
        String input = sc.next();
        System.out.println(input);
        */
        /*
        String name = sc.nextLine();
        System.out.println(name);
        */
        /*
        int n1 = sc.nextInt();
        System.out.println(n1);

        float n2 = sc.nextFloat();
        System.out.println(n2);
        */
        //Sum of a&b By taking Input
        System.out.print("Enter first Number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second Number: ");
        int n2 = sc.nextInt();
        int Sum = n1 + n2;
        System.out.println("Sum of a&b" + " = " + Sum);
    }
}