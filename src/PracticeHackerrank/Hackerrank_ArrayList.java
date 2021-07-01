package PracticeHackerrank;

import java.util.Scanner;

public class Hackerrank_ArrayList {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int [][] arr = new int[n][];
            for(int i = 0;i < n;i++){
                int d = sc.nextInt();
                arr[i] = new int[d];
                for(int j = 0;j < d;j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            int q = sc.nextInt();
            for(int i = 0;i < q;i++){
                int x,y;
                x = sc.nextInt();
                y = sc.nextInt();

                try{
                    System.out.println(arr[x-1][y-1]);
                }catch(Exception e){
                    System.out.println("ERROR!");
                }
            }



        }
    }

