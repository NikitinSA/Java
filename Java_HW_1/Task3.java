//Реализовать простой калькулятор
import java.util.Scanner;
public class Task3 {

    public static void main(String[] args)
    {
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

        System.out.print("Результат: ");
        switch (op)
        {
            case '/':System.out.println(a/b);break;
            case '*':System.out.println(a*b);break;
            case '-':System.out.println(a-b);break;
            case '+':System.out.println(a+b);break;
        }
    }
}