package JavaTutorialBasics;

import java.util.Scanner;

public class RaggedArray_Revision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr;
        arr = new int [4][];


        for(int i=0;i<4;i++){
            int cols = sc.nextInt();
            arr[i] = new int[cols];

            for(int j = 0;j < cols;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0;i < 4;i++){
            for(int j = 0;j < arr[i].length ;j++){
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

    }
}
