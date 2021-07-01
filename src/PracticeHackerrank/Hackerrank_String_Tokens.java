package PracticeHackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class Hackerrank_String_Tokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tokensList = new ArrayList<String>();
        String s = sc.nextLine();
        int i = 0;

        String token = "";
        while(i < s.length()){
            if(i == s.length() - 1 && (  (  (int)s.charAt(i) >= 97 && (int)s.charAt(i) <= 122 ) || ( (int)s.charAt(i) >= 65 && (int)s.charAt(i) <= 90 ) )){
                token += s.charAt(i);
                tokensList.add(token);
                break;
            }
            if(isAlphabet(s.charAt(i))){
                i++;
                if (!token.isEmpty()) {
                    tokensList.add(token);
                }
                token = "";
                continue;
            }

            token += s.charAt(i);
            i++;
        }

        for(String t:tokensList){
            System.out.println(t);
        }

    }
    public static boolean isAlphabet(char c){
        return c == ' ' || c == '@' || c == '!' || c == ',' || c == '.' || c == '_' || c == '?' || c == '\'';
    }
}
