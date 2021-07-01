package JavaTutorialOOPS;

import java.util.Scanner;

public class OOPS_22_Catching_specific_exceptions {
    public static void main(String[] args) {
        int [] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        try{
            System.out.println("Array element at index " + index + " is " + arr[index]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occured");
            System.out.println(e);
        }
    }
}
