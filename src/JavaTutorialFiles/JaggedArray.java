package JavaTutorialFiles;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // A jagged array or ragged array is an array of arrays where each member array is of different sizes

        System.out.println("Enter number of rows : ");
        short rows = sc.nextShort();

        int [][] arr = new int [rows][];

        for(short i = 0;i < arr.length;i++){
            System.out.printf("Enter the number of columns in row %d : ",i);
            short cols = sc.nextShort();

            arr[i] = new int[cols];

            for(short j=0;j< arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // Displaying the array

        for(short i=0;i< arr.length;i++){
            for(short j=0;j< arr[i].length;j++){
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }


}
