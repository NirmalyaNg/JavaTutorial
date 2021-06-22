package JavaTutorialFiles;

import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int [][] arr;

        arr = new int[3][3];

        Scanner sc = new Scanner(System.in);

        // Initializing 2-D array
        for(short i=0;i<arr.length;i++){
            for(short j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // Printing a 2-D array
        for(short i=0;i< arr.length;i++){
            for(short j=0;j< arr[i].length;j++){
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
