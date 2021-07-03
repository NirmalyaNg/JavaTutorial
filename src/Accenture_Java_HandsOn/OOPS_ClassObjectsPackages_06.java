package Accenture_Java_HandsOn;

import java.util.Scanner;

class VolumeCalculator{
    double calculateVolume(double radius,double height){
        return 3.14 * radius * radius * height;

    }
    double calculateVolume(int length,int breadth,int height){
        return  length * breadth * height;
    }
}

public class OOPS_ClassObjectsPackages_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VolumeCalculator v = new VolumeCalculator();

        System.out.println("Enter the choice");
        System.out.println("1.Find Volume For Cylinder");
        System.out.println("2.Find Volume For Cuboid");

        int choice = sc.nextInt();
        double volume;
        if(choice == 1){
            System.out.println("Enter the radius");
            double radius = sc.nextDouble();

            System.out.println("Enter the height");
            double height = sc.nextDouble();

            volume = v.calculateVolume(radius,height);
            System.out.printf("Volume of the Cylinder is %.2f",volume);

        }else if(choice == 2){
            System.out.println("Enter the length");
            int length = sc.nextInt();

            System.out.println("Enter the breadth");
            int breadth = sc.nextInt();

            System.out.println("Enter the height");
            int height = sc.nextInt();

            volume = v.calculateVolume(length,breadth,height);
            System.out.printf("Volume of the Cuboid is %.2f",volume);
        }
    }
}
