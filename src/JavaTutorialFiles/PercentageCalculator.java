package JavaTutorialFiles;

import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args){
        short total_marks = 500;
        int sub1,sub2,sub3,sub4,sub5;
        System.out.println("Enter the marks of five subjects :- ");
        Scanner sc = new Scanner(System.in);

        sub1 = sc.nextInt();
        sub2 = sc.nextInt();
        sub3 = sc.nextInt();
        sub4 = sc.nextInt();
        sub5 = sc.nextInt();
        int sum = sub1 + sub2 + sub3 + sub4 + sub5;

        float percentage = (float)sum / total_marks * 100;

        System.out.println("The percentage is :- " + percentage);
    }
}
