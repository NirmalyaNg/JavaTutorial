package JavaTutorialOOPS;
class BikeClass{
    int speedLimit = 60;

    public void run(){
        System.out.println("Running...");
    }
}
class HondaClass extends BikeClass{
    int speedLimit = 150;

    public void run(){
        System.out.println("Running with a safe speed...");
    }
}


public class DynamicMethodDispatch4 {
    public static void main(String[] args) {
        BikeClass b1;
        b1 = new HondaClass();

        b1.run(); // The overridden method definition of the child class will be executed during runtime
        System.out.println("Speed limit : " + b1.speedLimit);
        // The speedLimit attribute of the parent
        // class will be fetched since attributes are not overridden;

    }
}
