import java.util.*;
public class Conditional_Prob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Positive or Not
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        if(num>=0){
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
        //Fever or not
        double temp = 103.5;
        if (temp > 100.0) {
            System.out.println("You have Fever. ");
        } else {
            System.out.println("You don't have Fever. ");
        }

        //input week number(1-7) and print day of week name
        System.out.print("Enter week number(1-7): ");
        int week = sc.nextInt();
        switch (week) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("This day doesn't exist. ");
        }

        //Leap Year or Not
        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));
        if (x && (y || z)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
