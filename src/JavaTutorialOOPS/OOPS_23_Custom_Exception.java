package JavaTutorialOOPS;

import java.util.Scanner;
class NegativeBirthYearException extends Exception{
    @Override
    public String toString() {
        return "NegativeBirthYearException : Birth Year Can't be negative";
    }

    @Override
    public String getMessage() {
        return "Negative birth year not allowed";
    }
}

public class OOPS_23_Custom_Exception {
    public static void main(String[] args) {
        System.out.println("Enter your birth year :");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        try{
            if(year < 0){
                throw new NegativeBirthYearException();
            }else{
                System.out.println("Your age is : " + (2021 - year) + " years");
            }
        }catch(NegativeBirthYearException e){
            System.out.println("Exception occured");
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}
