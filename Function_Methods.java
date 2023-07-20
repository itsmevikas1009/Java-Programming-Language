import java.util.Scanner;

public class Function_Methods {
    //Function Creation and Declaration
    public static void printHelloWorld(){
        System.out.println("Hello World!");
    }

    //Function for Sum of two Numbers
    public static int calculateSum(int num1,int num2){ //Parameters or formal Parameters
        int sum = num1 + num2;
        return sum;
    }

    //Functions for Swapping
    public static void Swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }

    //Function for Multiplication
    public static int Multiply(int a, int b){
        int multiply = a * b;
        return multiply;
    }
    //Function of Factorial
    public static int Factorial(int num){
        int fact = 1;
        for(int i = 2; i <= num; i++){
            fact *= i;
        }
        return fact;
    }

    //Function for Binomial Coefficient
    public static int binCoeff(int n, int r){
        int n_fact = Factorial(n);
        int r_fact = Factorial(r);
        int nmr_fact = Factorial((n-r));

        int nCr = n_fact / (r_fact * nmr_fact);
        return nCr;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
        printHelloWorld(); //Function Call

        System.out.print("Enter two Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(calculateSum(num1,num2)); //Arguments or Actual Parameters
        */

        //Swap - Value Exchange
        /*
        int a = 10;
        int b = 5;
        Swap(a,b);
        */

        //Product of A & B
        /*
        int num1 = 10;
        int num2 = 20;
        int mul = Multiply(num1,num2);
        System.out.println("Product of a & b = " + mul);
        */

        //Factorial of given Number
        /*
        System.out.print("Enter a Number: ");
        int num3 = sc.nextInt();
        int fact = Factorial(num3);
        System.out.println("Factorial of " + num3 + " = " + fact);
        */

        //Binomial Coefficient
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter value of r : ");
        int r = sc.nextInt();
        int nCr = binCoeff(n,r);
        System.out.println("Binomial Coefficient of given value = " + nCr);
    }
}
