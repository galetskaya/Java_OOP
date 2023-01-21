package HW12_2;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ImmutableList lst = new ImmutableList(new LinkedList<>(Arrays.asList(1, 3, 5, 6 ,8)));
        MutableList lst2 = new MutableList(new LinkedList<>(Arrays.asList(0, 0, 3, 4, 5, 6)));

        lst.get(2);
        lst.getSize();

        System.out.println();

        lst2.get(4);
        lst2.set(1,2);
        lst2.remove(0);
    }
}
