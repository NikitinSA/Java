//Вывести все простые числа от 1 до 1000

public class Task2
{
    static boolean isPrime(int digit)
    {
        for(int i=2;i<digit;i++)
            if ((digit%i)==0) return false;
        return true;
    }

    public static void main(String[] args)
    {
        for (int i = 2; i <= 1000; i++)
            if(isPrime(i)) System.out.print(i+", ");

    }
}