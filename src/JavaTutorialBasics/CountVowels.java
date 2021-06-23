package JavaTutorialBasics;
import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        // Scanner object

        Scanner sc = new Scanner(System.in);

        // Taking a line as input from stdin

        String sentence = sc.nextLine();

        short i,count = 0;

        for(i=0;i<sentence.length();i++){

            char ch = sentence.toLowerCase().charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }

        }

        System.out.println("Number of vowels " + count);

    }
}
