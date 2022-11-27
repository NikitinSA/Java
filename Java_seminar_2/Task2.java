package Java_seminar_2;

public class Task2 {
    public static void main(String[] args) {
        String w = "Милая";
        if(polindrom(w)) System.out.printf("Слово %s - полиндром", w);
        else System.out.printf("Слово %s - не полиндром", w);
    }

    public static boolean polindrom(String word){
        String str = word;
        String[] array = str.split("");
        for (int i = 0; i<array.length / 2; i++){
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        str = String.join("", array);

        if (str.equals(word)) return true;
        return false;
    }

    public static void print(String str){
        System.out.println(str);
    }
}
