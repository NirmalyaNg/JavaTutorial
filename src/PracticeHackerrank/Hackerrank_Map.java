package PracticeHackerrank;
import java.util.*;

public class Hackerrank_Map {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Map<String,Long> phoneBook = new HashMap<String,Long>();
        List<String> queries = new ArrayList<String>();

        for(int i = 0;i < n;i++){
            String name = sc.nextLine();
            Long number = sc.nextLong();

            phoneBook.put(name,number);
            sc.nextLine();
        }
        for(int i = 0;i < 3;i++){
            String query_name = sc.nextLine();
            queries.add(query_name);
        }

        for(String s:queries){
            String q = s;
            String[] fullname = s.split(" ");
            if(fullname.length == 0){
                q = fullname[0];
            }
            if(phoneBook.containsKey(q)){
                System.out.println(q + "=" + phoneBook.get(q));
            }else{
                System.out.println("Not found");
            }
        }




    }
}
