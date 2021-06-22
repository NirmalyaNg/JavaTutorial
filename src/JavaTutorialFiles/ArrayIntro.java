package JavaTutorialFiles;

import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[];
        short i;

        arr = new int[5];

        for(i = 0;i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The array elements are :- ");
        for(i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
