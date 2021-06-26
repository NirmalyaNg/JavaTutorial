package JavaTutorialOOPS;
class Phone{
    public void displayDate(){
        System.out.println("Today is 25th June,2021");
    }

    public void displayMessageOnStart(){
        System.out.println("Hi ! I am a Phone");
    }
}

class SmartPhone extends Phone{
    public void takeASelfie(){
        System.out.println("Taking a selfie using front camera");
    }
    @Override
    public void displayMessageOnStart(){
        System.out.println("Hi ! I am a SmartPhone");
    }
}

public class OOPS_13_DynamicMethodDispatch {
    public static void main(String[] args) {
        // Dynamic method dispatch
        // We will create an object of child class and store it in a reference of parent class
        // This is called upcasting
        Phone p = new SmartPhone();
        p.displayMessageOnStart();
        // Since we are creating an object of child class and storing it in the reference of
        // parent class that is why the child classes' implementation of the method
        // will be invoked
        p.displayDate();

        // However we cannot call the other child class methods using object p


    }
}
