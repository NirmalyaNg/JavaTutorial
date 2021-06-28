package JavaPractice;

public class p10_OOPS_UDEMY_OVERLOADING {
    public static double calFeetAndInchesToCentimeters(double feet , double inches){
        if((feet < 0) || (inches < 0 || inches > 12)){
            return -1;
        }
        double centimeters = (feet * 12 * 2.54) + (inches * 2.54);
        System.out.println(feet + " feet and " + inches + " inches = " + centimeters + " cm." );
        return centimeters;
    }
    public static double calFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            return -1;
        }
        double feet = (int)(inches / 12);
        double remainingInches = inches - (feet * 12);

        return calFeetAndInchesToCentimeters(feet,remainingInches);
    }


    public static void main(String[] args) {
        double centimeters = calFeetAndInchesToCentimeters(6,11);
        if(centimeters == -1){
            System.out.println("Invalid feet or inches parameters");
        }
        double centimeters2 = calFeetAndInchesToCentimeters(142);
        if(centimeters2 == -1){
            System.out.println("Invalid feet or inches parameters");
        }
    }
}
