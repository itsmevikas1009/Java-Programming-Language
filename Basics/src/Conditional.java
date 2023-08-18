import java.util.*;
public class Conditional {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //if-else Statement
        /*
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
        */

        //Print the largest of 2
        /*
        System.out.print("Enter value of A: ");
        int A = sc.nextInt();
        System.out.print("Enter value of B: ");
        int B = sc.nextInt();
        if (A >= B){
            System.out.println(A + " is Largest");
        } else {
            System.out.println(B + " is Largest");
        }
        */
        //Print if a number is Odd or Even
        /*
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        */

        //else-if Statement
        /*
        if (age >= 18){
            System.out.println("Adult: Vote,Drive");
        }
        else if (age> 13 && age < 18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Not Adult");
        }
        */

        //Income Tax Calculator
        /*
        System.out.print("Enter Your Income: ");
        long income = sc.nextLong();
        double tax ;
        if (income < 500000){
            tax = 0;
            System.out.println("Your Tax for this Year = "+tax);
        } else if (income < 1000000) {
            tax = income * (0.2f);
            System.out.println("Your Tax for this Year = "+tax);
        } else {
            tax = income * (0.3);
            System.out.println("Your Tax for this Year = "+tax);
        }
        */

        //Print the Largest of 3
        /*
        System.out.println("Enter 3 Numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if (n1>=n2 && n1>=n3){
            System.out.println(n1 + " is Largest");
        } else if (n2>=n3){
            System.out.println(n2 + " is Largest");
        } else {
            System.out.println(n3 + " is Largest");
        }
        */

        //Ternary Operator
        /*
        String Largest = (A>=B)?A+" is Largest.":B+" is Largest.";
        System.out.println(Largest);

        System.out.print("Enter Marks ");
        int marks = sc.nextInt();
        String Status = (marks>=33)?"PASS":"FAIL";
        System.out.println(Status);
        */
        //Switch Statement
        /*
        int variable = sc.nextInt();
        switch (variable) {
            case 1 -> System.out.println("Samosa");
            case 2 -> System.out.println("Burger");
            case 3 -> System.out.println("Mango Shake");
            default -> System.out.println("We wake up");
        }
        */

        //Calculator
        System.out.println("Enter two Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.print("Enter Operator: ");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+' -> System.out.println(num1+num2);
            case '-' -> System.out.println(num1-num2);
            case '*' -> System.out.println(num1*num2);
            case '/' -> System.out.println(num1/num2);
            case '%' -> System.out.println(num1%num2);
            default -> System.out.println("Our Calculator is not that Advanced.");
        }
    }
}
