// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет 
// “перевернутый” список.

package Java_HW_4;

import java.util.Arrays;
import java.util.LinkedList;

public class Task1 {
    public static void main (String[] args) {
        String[] list = {"one", "two", "three", "four", "five"};
        LinkedList <String> ll = new LinkedList<>(Arrays.asList(list));
        System.out.println("Исходный список: ");
        System.out.println(ll);
        System.out.println("Перевернутый список: ");
        ll = ReversList(ll);
        System.out.println(ll);
    }

    public static LinkedList <String> ReversList (LinkedList <String> ll) {
        LinkedList <String> reversLinkedList = new LinkedList<>();
        for (int i = 0; i < ll.size(); i++) {
            reversLinkedList.add(ll.get(ll.size()- 1 - i));
        }
        return reversLinkedList;
    }
}