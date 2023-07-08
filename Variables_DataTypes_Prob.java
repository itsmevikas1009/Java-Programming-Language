import java.util.*;
public class Variables_DataTypes_Prob {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Average of Three Numbers
        System.out.println("Enter Three Numbers: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        float Sum = A + B + C;
        float Avg = Sum / 3;
        System.out.println("Average of A , B & C = "+Avg);

        //Area of Square
        System.out.print("Enter side of Square: ");
        int side = sc.nextInt();
        int Ar_Square = side*side;
        System.out.println("Area of Square = "+Ar_Square);

        //Bill Payment
        System.out.print("Enter price of Pencil: ");
        float pencil = sc.nextFloat();
        System.out.print("Enter price of Pen: ");
        float pen = sc.nextFloat();
        System.out.print("Enter price of Eraser: ");
        float eraser = sc.nextFloat();

        float Total = pencil + pen + eraser;

        System.out.println("Total Price = " + Total);

        //Add on - with 18% GST
        float newTotal = Total + (0.18f * Total);

        System.out.println("Total Price after 18% GST = " + newTotal);
    }
}
