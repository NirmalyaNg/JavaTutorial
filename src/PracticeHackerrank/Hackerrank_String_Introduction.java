package PracticeHackerrank;

import java.util.Scanner;

public class Hackerrank_String_Introduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        System.out.println(word1.length() + word2.length());
        boolean isLexicographicallyGreater = word1.charAt(0) > word2.charAt(0);

        if(isLexicographicallyGreater){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        char word1_first_char = (char)(word1.charAt(0) - 32);
        char word2_first_char = (char)(word2.charAt(0) - 32);

        System.out.println(word1_first_char + word1.substring(1));
        System.out.println(word2_first_char + word2.substring(1));

    }
}
