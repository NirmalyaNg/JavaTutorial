package PracticeHackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Hackerrank_Substring_Comparisons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int k = sc.nextInt();

        String [] substrings = new String[word.length() - k + 1];
        if(k == 1){
            substrings = word.split("");
        }else{
            for(int i = 0;i <= word.length() - k;i++){
                String sub = word.substring(i,i+k);
                substrings[i] = sub;
            }
        }

        Arrays.sort(substrings);


       String smallest = substrings[0];
       String largest = substrings[substrings.length - 1];

       System.out.println(smallest);
       System.out.println(largest);

    }
}
