package Numbers;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list_numbers = new ArrayList<>();
        ArrayList<Integer> new_list_numbers = new ArrayList<>();
        list_numbers.add(5);
        list_numbers.add(2);
        list_numbers.add(55);
        list_numbers.add(37);
        list_numbers.add(61);
        list_numbers.add(234);
        list_numbers.add(2);
        System.out.printf("Before %s", list_numbers);
        System.out.println();
        for (ListIterator<Integer> iter = list_numbers.listIterator(); iter.hasNext(); ) {
            new_list_numbers.add(iter.next() + 1);
        }
        System.out.printf("After %s", new_list_numbers);
    }
}
