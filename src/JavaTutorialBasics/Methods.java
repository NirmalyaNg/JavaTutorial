package JavaTutorialBasics;

import java.util.Scanner;

public class Methods {

     static int getFactorial(int n){
        int fact = 1;
        if(n == 0){
            return 1;
        }

        for(int i = 1;i <= n;i++){
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int temp = num,rem,sum = 0;

        while(temp > 0){
            rem = temp % 10;
            sum += getFactorial(rem);
            temp /= 10;
        }

        if(sum == num){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not a Strong Number");
        }
    }
}
