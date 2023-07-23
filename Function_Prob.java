import java.util.Scanner;

public class Function_Prob {
    //Function to find average
    public static float average(int a, int b, int c){
        float avg = (float)(a + b + c)/3;
        return avg;
    }

    //Function to check No. is even or not
    public static boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    //Function to find reverse
    public static int Reverse(int num){
        int rev = 0;
        while(num > 0){
            int lastD = num % 10;
            rev = rev * 10 + lastD;
            num /= 10;
        }
        return rev;
    }

    //Function to Check No. is Palindrome or not
    public static boolean Palindrome(int n){
        if(Reverse(n) == n){
            return true;
        } else {
            return false;
        }
    }

    //Function for Sum of Digits
    public static int SumOfDigits(int n){
        int sum = 0;
        while(n > 0) {
            int lastD = n % 10;
            sum += lastD;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Average of 3 no.
        /*
        System.out.print("Input the first number: ");
        int x = sc.nextInt();
        System.out.print("Input the second number: ");
        int y = sc.nextInt();
        System.out.print("Input the third number: ");
        int z = sc.nextInt();
        System.out.println("Average = " + average(x, y, z));
        */

        //Check whether even or odd
        /*
        int num;
        System.out.print("Enter an integer: ");
        num = sc.nextInt();
        if(isEven(num)) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
        */

        //Check Number is Palindrome or not
        /*
        System.out.print("Enter an Integer: ");
        int n = sc.nextInt();

        if (Palindrome(n)) {
            System.out.println("Number " + n + " is Palindrome");
        } else {
            System.out.println("Number " + n + " is not a Palindrome");
        }
        */

        //Sum of Digits
        /*
        System.out.print("Enter Number: ");
        int n1 = sc.nextInt();

        System.out.println("Sum of Digits of " + n1 + " = " + SumOfDigits(n1));
        */

        double x = 28;
        double y = 4;

        // return the maximum of two numbers
        System.out.println("Maximum number of x and y is: " +Math.max(x, y));

        // return the square root of y
        System.out.println("Square root of y is: " + Math.sqrt(y));

        //returns 28 power of 4 i.e. 28*28*28*28
        System.out.println("Power of x and y is: " + Math.pow(x, y));

        // return the logarithm of given value
        System.out.println("Logarithm of x is: " + Math.log(x));
        System.out.println("Logarithm of y is: " + Math.log(y));

        // return the logarithm of given value when base is 10
        System.out.println("log10 of x is: " + Math.log10(x));
        System.out.println("log10 of y is: " + Math.log10(y));

        // return the log of x + 1
        System.out.println("log1p of x is: " +Math.log1p(x));

        // return a power of 2
        System.out.println("exp of a is: " +Math.exp(x));

        // return (a power of 2)-1
        System.out.println("expm1 of a is: " +Math.expm1(x));
    }
}
