package Java_seminar_2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Character c1 = 'a';
        Character c2 = 'b';
        try(Scanner sc = new Scanner(System.in)){
        int n = sc.nextInt();
    
        StringBuilder builder = new StringBuilder();
    
        for (int i = 0; i < n; i++){
            if(i % 2 == 0){
                builder.append(c1);
            }
    
            else{
                builder.append(c2);
            }
        }
        System.out.println(builder.toString());
    }
}        
}

    
