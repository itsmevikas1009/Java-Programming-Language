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

        int num2 = 110283;
        int lastDigit;
        int rev1 = 0;
        while (num2 > 0) {
            lastDigit = num2 % 10;
            System.out.print(lastDigit);
            num2 /= 10;
        }
        System.out.println();


        //Print Reverse of a Given Number

        System.out.print("Enter a Number: ");
        int num3 = sc.nextInt();
        int lastDigit1;
        int rev = 0;
        while (num3 > 0) {
            lastDigit1 = num3 % 10;
            rev = rev * 10 + lastDigit1;
            num3 /= 10;
        }
        System.out.println("Reversed Number = " + rev);


        //do-while Loop
        /*
        int counter2 = 1;
        do {
            System.out.println(counter2+".Hello World! ");
            counter2++;
        } while (counter2 <= 100);
        */


        //Break Statement
        /*
        for (int i = 1;i <= 5;i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("You are out of Loop");
        */

        //Keep entering the number till user enters a multiple of 10
        /*
        do {
            System.out.print("Enter Number: ");
            int num4 = sc.nextInt();
            if(num4 % 10 == 0) {
                break;
            }
            System.out.println(num4);
        } while (true);
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

        //Prime or Not Prime
        System.out.print("Enter Number: ");
        int num5 = sc.nextInt();
        boolean check = true;
        for(int i = 2;i < Math.sqrt(num5);i++) {
            if(num5 % i == 0) {
                check = false;
                break;
            }
        }
        if(check) {
            System.out.println(num5 + " is a Prime Number");
        } else {
            System.out.println(num5 + " is not a Prime Number");
        }

    }
}
