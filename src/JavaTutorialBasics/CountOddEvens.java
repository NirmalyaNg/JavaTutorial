package JavaTutorialBasics;

import java.util.Scanner;

public class CountOddEvens {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in the array :- ");
        int n = sc.nextInt();

        // Declaring array
        int[] arr = new int[n];

        int i,odd_count=0,even_count=0;

        // Scan element from user and store it in the array
        System.out.println("Enter the elements in the array :- ");

        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(i=0;i<n;i++){
            if(arr[i] % 2 == 0){
                even_count++;
            }else{
                odd_count++;
            }
        }

        System.out.println("Odds " + odd_count);
        System.out.println("Evens " + even_count);

    }
}
