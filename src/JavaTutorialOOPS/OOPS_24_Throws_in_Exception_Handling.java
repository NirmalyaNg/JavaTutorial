package JavaTutorialOOPS;

import java.util.Scanner;

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "NegativeRadiusException: Radius can't be negative";
    }

    @Override
    public String getMessage() {
        return "Please provide a positive value of radius";
    }
}

public class OOPS_24_Throws_in_Exception_Handling {
    public static double getArea(int radius) throws NegativeRadiusException{
        if(radius < 0) throw new NegativeRadiusException();
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        int radius = sc.nextInt();
        try{
            double area = getArea(radius);
            System.out.println("Area is " + area);
        }catch(NegativeRadiusException e){
            System.out.println("Exception occured");
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}
