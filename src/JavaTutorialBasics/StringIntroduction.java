package JavaTutorialBasics;

import java.util.Scanner;

public class StringIntroduction {
    public static void main(String[] args) {
        // Count number of vowels in a String

        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        short count = 0;

        for(short i=0; i<sentence.length();i++){
            char c = sentence.toLowerCase().charAt(i);

            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' ||c == 'u'){
                count++;
            }
        }

        System.out.println("Number of vowels are :- " + count);
    }
}
