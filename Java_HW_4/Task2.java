// Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - 
// помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди 
// и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

package Java_HW_4;

import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {
    public static void main (String[] args) {
        LinkedList <String> ll = new LinkedList<>();
        // добавляем элементы в ll в порядке очереди
        for (int i = 0; i < 5; i++) {
            Enqueue(ll);
        }
        System.out.println(ll);
        // показываем первый элемент и удаляем его
        Dequeue(ll);
        System.out.println(ll);
        // просто показываем первый элемент
        First(ll);
        System.out.println(ll);
    }

    public static LinkedList <String> Enqueue (LinkedList <String> ll) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = sc.nextLine();
        ll.add(str);
        return ll;
    }

    public static LinkedList <String> Dequeue (LinkedList <String> ll) {
        String first = ll.get(0);
        System.out.println(first);
        ll.remove(0);
        return ll;
    }

    public static LinkedList <String> First (LinkedList <String> ll) {
        String first = ll.get(0);
        System.out.println(first);
        return ll;
    }
}