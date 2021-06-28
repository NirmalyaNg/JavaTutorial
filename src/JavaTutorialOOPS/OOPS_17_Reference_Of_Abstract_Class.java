package JavaTutorialOOPS;
abstract class Car{
    int number_of_wheels = 4;
    public abstract void startCar(); // Abstract method
    public abstract void stopCar();  // Abstract method
    public void display(){  // Non-abstract method
        System.out.println("I am a car !");
    }
}
class ALTO800 extends Car{
    // Implementations of abstract methods of parent class
    public void startCar(){
        System.out.println("Starting Maruti Suzuki Alto 800");
    }
    public void stopCar(){
        System.out.println("Stopping Maruti Suzuki Alto 800");
    }
}


public class OOPS_17_Reference_Of_Abstract_Class {
    public static void main(String[] args) {
        Car c1; // Reference of abstract class
        c1 = new ALTO800(); // Upcasting
        c1.startCar();
        c1.stopCar();
        c1.display();
        c1.number_of_wheels = 3;
        System.out.println(c1.number_of_wheels);
    }
}
