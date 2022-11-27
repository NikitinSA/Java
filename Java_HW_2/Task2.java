//К калькулятору из предыдущего дз добавить логирование.

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Task2.class.getName());
        FileHandler fh = new FileHandler("logTask2.txt", true);
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        double resultat = 0;

        Scanner data = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double a = data.nextInt();
        System.out.println("Введите операцию: /,*,-,+");
        char op = data.next().charAt(0);
        double b=0;
        do{
            System.out.println("Введите второе число:");
            b = data.nextInt();
            if (op=='/'&& b==0)System.out.println("Нельзя делить на ноль");
        }while(op=='/'&& b==0);

        if (op == '+') {
            resultat = a + b;
        } else if (op == '-') {
            resultat = a - b;
        } else if (op == '*') {
            resultat = a * b;
        } else if (op == '/') {
            try {
                resultat = (double) a / b;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        logger.log(Level.INFO, String.valueOf(a) + " " + String.valueOf(op) + " "
                + String.valueOf(b) + " = " + String.valueOf(resultat));
    }
}
