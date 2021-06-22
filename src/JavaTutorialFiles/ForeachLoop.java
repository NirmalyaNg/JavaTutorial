package JavaTutorialFiles;

import java.util.Scanner;

public class ForeachLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] names = new String[5];


        System.out.println("Enter the number of elements in the array :- ");
        short n = sc.nextShort();

        // Scanning array elements
        for(short i=0;i < n;i++){
            names[i] = sc.next();
        }

        // Displaying array elements
        for(String s:names){
            System.out.println(s);
        }
    }
}
