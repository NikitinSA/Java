
package Java_seminar_1;
import java.util.Scanner;

//Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
//Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Введите имя: ");
        try (Scanner iScanner = new Scanner(System.in)) {
            String name = iScanner.nextLine();
            System.out.printf("Привет, %s\n", name);
        }
    }
}
