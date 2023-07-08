public class Operators_Prob {
    public static void main(String[] args){
        //Que 1
        int x = 2, y = 5;
        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));
        System.out.print(exp1 + " , ");
        System.out.println(exp2);
        //Output - 5 , 4

        //Que 2
        int x1 = 200, y1 = 50, z = 100;
        if(x1 > y1 && y1 > z){
            System.out.println("Hello");
        }
        if(z > y1 && z < x1){
            System.out.println("Java");
        }
        if((y1+200) < x1 && (y1+150) < z){
            System.out.println("Hello Java");
        }
        //Output - Java

        //Que 3
        int x2, y2, z2;
        x2 = y2 = z2 = 2;
        x2 += y2;
        y2 -= z2;
        z2 /= (x2 + y2);
        System.out.println(x2 + " " + y2 + " " + z2);
        //Output - 4 0 0

        //Que 4
        int x3 = 9, y3 = 12;
        int a = 2, b = 4, c = 6;
        int exp = 4/3 * (x3 + 34) + 9 * (a + b * c) + (3 + y3 * (2 + a)) / (a + b*y3);
        System.out.println(exp);
        //Output - 278

        //Que 5
        int x4 = 10, y4 = 5;
        int exp4 = (y4 * (x4 / y4 + x4 / y4));
        int exp5 = (y4 * x4 / y4 + y4 * x4 / y4);
        System.out.println(exp4);
        System.out.println(exp5);
        //Output - 20 20


    }
}
