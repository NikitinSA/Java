//Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

package Java_seminar_1;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(0, 2);
            System.out.print(array[i]);
        }

        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1)
                count++;
            else {
                if (maxCount < count) {maxCount = count;}
                count = 0;
            }
                System.out.println("\n" + maxCount);
        }
    }
}
