import java.util.Scanner;

public class Loops_Prob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Print the Sum of Odd and Even Integers given by User
        /*
        int number;
        int choice;
        int oddSum = 0;
        int evenSum = 0;

        do {
            System.out.print("Enter Number: ");
            number = sc.nextInt();

            if(number % 2 == 0){
                evenSum += number;
            } else {
                oddSum += number;
            }

            System.out.print("Do you want to continue? Press 1 for yes or 0 for no : ");
            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("Sum of even Numbers = " + evenSum);
        System.out.println("Sum of Odd Numbers = " + oddSum);
        */

        //Factorial of Number
        /*
        int fact = 1;
        System.out.print("Enter the positive Interger: ");
        int num = sc.nextInt();
        for(int i = 2;i <= num;i++) {
            fact *= i;
        }
        System.out.println(fact);
         */

        //Print table of a Given Number
        System.out.print("Enter the Number: ");
        int num2 = sc.nextInt();
        for(int i = 1;i <= 10;i++){
            System.out.println(num2 + " x " + i + " = " + (num2*i));
        }
    }
}
