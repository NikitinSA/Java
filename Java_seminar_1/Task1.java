//Настроить проект, вывести в консоль “Hello world!”. 
//Вывести в консоль системные дату и время.

package Java_seminar_1;

import java.time.LocalDateTime;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        LocalDateTime nowTime = LocalDateTime.now();
        System.out.println(nowTime);
}
}
