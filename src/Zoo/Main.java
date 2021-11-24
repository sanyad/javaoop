package Zoo;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    private static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        setList();
        System.out.println("ArrayList before remove:");
        System.out.println(list);
        updateList();
    }

    private static void setList() {
        list.add("Wolf");
        list.add("Chicken");
        list.add("Rabbit");
        list.add("Pow");
        list.add("Tiger");
        list.add("Lion");
        list.add("Monkey");
        list.add("Fox");
        list.add("Elephant");
        list.add("Snake");
    }

    private static void updateList() {
        int[] numbers = {3, 5, 7};
        ListIterator<String> litr = list.listIterator();
        for (int i = 0; i < numbers.length; i++) {
            if (litr.hasNext()) {
                list.remove(numbers[i]);
            }
        }
        System.out.println("ArrayList After remove:");
        System.out.println(list);
    }
}
