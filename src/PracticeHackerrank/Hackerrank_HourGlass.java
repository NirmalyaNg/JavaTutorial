package PracticeHackerrank;

import java.util.Scanner;

public class Hackerrank_HourGlass {
    public static void main(String[] args) {
        int [][] arr = new int[6][6];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < 6;i++){
            for(int j = 0;j < 6;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int sum,max_sum = Integer.MIN_VALUE;
        for(int i = 0;i <= 3;i++){
            for(int j = 0;j <= 3;j++){
                sum = 0;
                sum = sum +  arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j+1] + arr[i+2][j] + arr[i+2][j+2];
                if(sum > max_sum){
                    max_sum = sum;
                }
            }
        }
        System.out.println(max_sum);

    }
}
