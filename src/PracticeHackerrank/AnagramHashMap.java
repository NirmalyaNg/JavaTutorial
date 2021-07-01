package PracticeHackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramHashMap {
    public static void main(String[] args) {
        HashMap<Character,Integer> my_map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        String word1 = sc.next().toLowerCase();
        String word2 = sc.next().toLowerCase();

        boolean isAnagram = true;
        for(int i = 0;i < word1.length();i++){
            char ch = word1.charAt(i);
            if(my_map.containsKey(ch)){
                int value = my_map.get(ch);
                my_map.put(ch,value + 1);
            }else{
                my_map.put(ch,1);
            }
        }

        for(int i = 0;i < word2.length();i++){
            char ch = word2.charAt(i);
            if(!my_map.containsKey(ch)){
                isAnagram = false;
                break;
            }

            int value = my_map.get(ch);
            my_map.put(ch,value - 1);
        }

        if(!isAnagram){
            System.out.println("Not Anagrams");
        }else{
            for(Map.Entry keyValue:my_map.entrySet()){
                char key = (char)keyValue.getKey();
                int value = (int)keyValue.getValue();

                if(value != 0){
                    isAnagram = false;
                    break;
                }
            }
            if(isAnagram){
                System.out.println("Anagrams");
            }else{
                System.out.println("Not Anagrams");
            }
        }


    }
}
