import java.util.*;
public class Conditional {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //if-else Statement
        int age = 16;
        if (age >= 18){
            System.out.println("Adult: Vote,Drive");
        }
        if (age> 13 && age < 18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Not Adult");
        }

        //Print the largest of 2
        System.out.print("Enter value of A: ");
        int A = sc.nextInt();
        System.out.print("Enter value of B: ");
        int B = sc.nextInt();
        if (A >= B){
            System.out.println(A + " is Largest");
        } else {
            System.out.println(B + " is Largest");
        }

        //Print if a number is Odd or Even
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        //else-if Statement
        if (age >= 18){
            System.out.println("Adult: Vote,Drive");
        }
        else if (age> 13 && age < 18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Not Adult");
        }

        //Income Tax Calculator
        System.out.print("Enter Your Income: ");
        long income = sc.nextLong();
        double tax ;
        if (income < 500000){
            tax = 0;
            System.out.println("Your Tax for this Year = "+tax);
        } else if (income >= 500000 && income < 1000000) {
            tax = income * (0.2f);
            System.out.println("Your Tax for this Year = "+tax);
        } else {
            tax = income * (0.3);
            System.out.println("Your Tax for this Year = "+tax);
        }
    }
}
