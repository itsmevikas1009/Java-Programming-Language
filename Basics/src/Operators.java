public class Operators {
    public static void main(String[] args){
        int A = 10;
        int B = 5;
        int C = 3;

        //BINARY OPERATOR
        System.out.println("Addition = "+(A+B));
        System.out.println("Subtraction = "+(A-B));
        System.out.println("Multiplication = "+(A*B));
        System.out.println("Division = "+(A/B));
        System.out.println("Remainder = "+(A%C));

        //UNARY OPERATOR
        System.out.println(A++); //Post Increment
        System.out.println(++A); //Pre Increment
        System.out.println(B--); //Post Decrement
        System.out.println(--B); //Pre Decrement

        //Relation Operator
        System.out.println(A==B);
        System.out.println(A!=B);
        System.out.println(A>B);
        System.out.println(A>=B);
        System.out.println(A<B);
        System.out.println(A<=B);

        //Logical Operators
        System.out.println( (3>2) && (5>0) ); //Logical AND
        System.out.println( (3<2) && (5>0) );
        System.out.println( (3<2) || (5>0) ); //Logical OR
        System.out.println( (3>2) || (5<0) );
        System.out.println( !(3<2) ); //Logical NOT
        System.out.println( !(3>2) );

        //Assignment Operator
        A = B;
        System.out.println(A);
        A += 10; // A = A + 10
        System.out.println(A);
        A -= 5;  // A = A - 5
        System.out.println(A);
        B *= 2;  // B = B * 2
        System.out.println(B);
        B /= 2;  // B = B / 2
        System.out.println(B);
    }
}
