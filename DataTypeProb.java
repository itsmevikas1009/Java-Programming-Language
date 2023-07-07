import java.util.*;
public class DataTypeProb {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Sum of a&b By taking Input
        System.out.print("Enter first Number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second Number: ");
        int n2 = sc.nextInt();
        int Sum = n1 + n2;
        System.out.println("Sum of a&b" + " = " + Sum);

        //Product of a&b By taking Input
        System.out.print("Enter first Number: ");
        int a = sc.nextInt();
        System.out.print("Enter second Number: ");
        int b = sc.nextInt();
        int mul = a*b;
        System.out.println(mul);

        //Area of Circle
        System.out.print("Enter radius of Circle: ");
        int r = sc.nextInt();
        float pi = 3.14F;
        float Ar_Circle = pi*r*r;
        System.out.println("Area of Circle = "+Ar_Circle);
    }
}
