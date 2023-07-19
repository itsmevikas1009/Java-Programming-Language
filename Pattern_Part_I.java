public class Pattern_Part_I {
    public static void main(String[] args){
        //Nested Loops

        //Print STAR pattern
        /*
        for(int line = 1;line <= 4;line++){
            for(int star = 1;star <= line;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
        */

        //Print INVERTED pattern
        /*
        int n1 = 5;
        for(int i = 1;i <= n1;i++){
            for(int j = 1;j <= (n1 - i + 1);j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        */

        //Print HALF-PYRAMID pattern
        /*
        int n2 = 5;
        for(int i = 1;i <= n2;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        */

        //Print CHARACTER pattern
        /*
        int n3 = 5;
        char ch = 'A';
        for(int i = 1;i <= n3;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        */

        //
    }
}
