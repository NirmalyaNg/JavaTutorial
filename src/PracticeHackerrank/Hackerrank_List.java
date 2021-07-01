package PracticeHackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hackerrank_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> myList = new ArrayList<Integer>();
        for(int i = 0;i < n;i++){
            myList.add(sc.nextInt());
        }
        int q = sc.nextInt();
        for(int i = 0;i < q;i++){
            String s = sc.nextLine();
            if(s.equals("Insert")){
                int x = sc.nextInt();
                int y = sc.nextInt();

                myList.add(x,y);
                continue;
            }
            if(s.equals("Delete")){
                int index = sc.nextInt();

                myList.remove(index);
            }

        }
        for (Integer integer : myList) {
            System.out.println(integer + " ");
        }
    }
}
