import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //while Loop
        /*
        int counter = 1;
        while (counter <= 100) {
            System.out.println(counter+".Hello World! ");
            counter++;
        }
        */

        //Print number from 1 to 10
        /*
        int counter = 1;
        while (counter <= 10) {
            System.out.println(counter);
            counter++;
        }
        */

        //Print number from 1 to n
        /*
        System.out.print("Enter Value of n: ");
        int n = sc.nextInt();
        int counter2 = 1;
        while(counter2 <= n) {
            System.out.println(counter2);
            counter2++;
        }
        */

        //Sum of n Natural Numbers
        /*
        System.out.print("Enter Last Number: ");
        int n2 = sc.nextInt();
        int counter3 = 1;
        int sum = 0;
        while (counter3 <= n2 ) {
            sum += counter3;
            counter3++;
        }
        System.out.println("Sum of First " + n2 + "Natural No. = " + sum);
        */

        //for Loop
        /*
        for(int i = 1; i <= 10; i++) {
            System.out.println(i + ". Hello World!");
        }
        */

        //Print Square Pattern
        /*
        for (int i = 0; i < 4; i++) {
            System.out.println("*  *  *  *  ");
        }
        */

        //Print Reverse of a Number
        /*
        int num2 = 110283;
        int rev1 = 0;
        while (num2 > 0) {
            rev1 = rev1 * 10 + (num2 % 10);
            num2 /= 10;
        }
        System.out.println("Reversed Number = " + rev);
        */

        //Print Reverse of a Given Number
        /*
        System.out.print("Enter a Number: ");
        int num3 = sc.nextInt();
        int rev2 = 0;
        while (num3 > 0) {
            rev2 = rev2 * 10 + (num3 % 10);
            num3 /= 10;
        }
        System.out.println("Reversed Number = " + rev);
        */

        //do-while Loop
        /*
        int counter2 = 1;
        do {
            System.out.println(counter2+".Hello World! ");
            counter2++;
        } while (counter2 <= 100);
        */

        //Print all Number except multiple of 10
        /*
        do {
            System.out.print("Enter your Number: ");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                continue;
            }

            System.out.println("Number was: "+num);
        } while(true);
        */

    }
}
