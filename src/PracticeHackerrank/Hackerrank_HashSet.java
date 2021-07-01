package PracticeHackerrank;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hackerrank_HashSet {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0;i < n;i++){
            String s = sc.nextLine();
            mySet.add(s);
            System.out.println(mySet.size());
        }
        sc.close();
    }
}
