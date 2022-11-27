//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;
public class Task1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n треугольного числа: ");
        int n = sc.nextInt();
        System.out.print(n*(n+1)/2);
    }
}