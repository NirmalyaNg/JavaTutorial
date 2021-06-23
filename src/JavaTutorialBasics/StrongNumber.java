package JavaTutorialBasics;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        // 145  = 1! + 4! + 5!
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int sum = 0,temp = num,rem;

        while(temp > 0){
            rem = temp % 10;

            // Find factorial of each digit
            int fact = 1,i;
            for(i=1;i<=rem;i++){
                fact *= i;
            }
            sum += fact;
            temp /= 10;
        }
        if(sum == num){
            System.out.println("Strong number");
        }else{
            System.out.println("Not a strong number");
        }
    }
}
