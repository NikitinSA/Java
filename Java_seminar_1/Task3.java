package Java_seminar_1;

import java.time.LocalTime;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Введи имя: ");
        try (Scanner iScanner = new Scanner(System.in)) {
            String name = iScanner.nextLine();
            int nowTime = LocalTime.now().getHour();

            if(nowTime >= 5 && nowTime <12){System.out.printf("Доброе утро, %s", name);}
            if(nowTime >= 12 && nowTime <16){System.out.printf("Добрый день, %s", name);}
            if(nowTime > 16 && nowTime <23){System.out.printf("Добрый вечер, %s", name);}
            if(nowTime >= 23 && nowTime <5){System.out.printf("Доброй ночи, %s", name);}
        }
    }
    
}
