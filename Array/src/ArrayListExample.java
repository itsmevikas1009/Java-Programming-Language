import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        // list.add(12);
        // list.add(43);
        // list.add(66);
        // list.add(34);
        // list.add(87);
        // list.add(67);
        // list.add(19);

        // System.out.println(list.contains(43));
        // System.out.println(list);
        //
        // list.set(0,99);
        //
        // list.remove(2);
        //
        // System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println(list);
        in.close();
    }
}
