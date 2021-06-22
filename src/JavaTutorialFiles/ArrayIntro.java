package JavaTutorialFiles;

import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
        // Scanner object creation

        Scanner sc = new Scanner(System.in);

        // Declaring arrays

        int [] arr;  // Declaration
        arr = new int[5];  // Memory allocation

        int [] arr1 = new int[5];  // Declaration and memory allocation

        int [] arr2 = {10,20,30,40,50}; // Declaration, memory allocation with initialization

        // Scanning array elements
        for(short i=0; i < 5;i++){
            arr[i] = sc.nextInt();
        }

        // Printing array elements
        for(short i=0;i<5;i++){
            System.out.println(arr[i]);
        }

    }
}
