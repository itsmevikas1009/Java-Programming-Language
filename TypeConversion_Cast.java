import java.util.*;

public class TypeConversion_Cast {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Type Conversion
        int a = 10;
        float b = a;
        System.out.println(b);
        int c = 200;
        long d= c;
        System.out.println(d);
        float e = sc.nextInt();
        System.out.println(e);


        char ch = 'A';
        int number = ch;
        System.out.println(number);

        //Type Casting
        float n1 = 25.12F;
        int n2 = (int) n1;
        System.out.println(n2);

        //Type Promotion in Expression
        char ch1 = 'a';
        char ch2 = 'b';
        System.out.println((int)(ch2));
        System.out.println((int)(ch1));
        System.out.println(ch2-ch1);

        short sh = 5;
        byte by= 25;
        char ch3 = 'c';
        byte bt = (byte) (sh + by + ch3);
        System.out.println(bt);

        int n4 = 10;
        float f1 = 20.23F;
        long ln = 25;
        double db = 30;
        System.out.println(n4+f1+ln+db);
    }
}
