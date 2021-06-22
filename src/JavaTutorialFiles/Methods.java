package JavaTutorialFiles;

import java.util.Scanner;

public class Methods {

     static int getSumOfDigits(int num){
        int rem,sum = 0;
        while(num > 0){
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = getSumOfDigits(n);
        System.out.println("The sum of the digits are : " + s);
    }
}
