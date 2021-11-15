package Computer;

import java.util.Arrays;

public class Computer {
    public static void main(String[] args) {
        run();
    }

    static void run() {
        Computer[] array = new Computer[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Computer();
        }
        System.out.println(Arrays.deepToString(array));
    }
}
