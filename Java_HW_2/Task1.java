//Реализуйте алгоритм сортировки пузырьком числового массива,результат после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Task1 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Task1.class.getName());
        FileHandler fh = new FileHandler("logTask1.txt", true);
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        int[] mas = {11, 3, 14, 16, 7, 11, 1};

        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
                logger.log(Level.INFO, String.valueOf(mas[i]) + " " + Arrays.toString(mas));
            }
        }
    }
}