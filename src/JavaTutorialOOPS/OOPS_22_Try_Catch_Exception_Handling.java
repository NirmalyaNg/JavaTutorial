package JavaTutorialOOPS;

import java.util.Scanner;

public class OOPS_22_Try_Catch_Exception_Handling {
    public static void main(String[] args) {
        int [] arr = new int[3];
        arr[0] = 100;
        arr[1] = 90;
        arr[2] = 88;

        System.out.println("Enter index : ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        try{
            System.out.println("Array element at index " + index + " is " + arr[index]);
        }catch(Exception e){
            System.out.println("An exception occured");
            System.out.println(e);
        }
    }
}
