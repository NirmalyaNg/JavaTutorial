package JavaTutorialOOPS;
class Bike{
    public void run(){
        System.out.println("Running ...");
    }
}

class Splendor extends Bike{
    public void run(){
        System.out.println("Running with a safe speed ...");
    }
}

public class DynamicMethodDispatch2 {
    public static void main(String[] args) {
        Bike b = new Splendor(); // Upcasting
        // When reference variable of parent class refers to object of child class,it is
        // known as Upcasting.
        b.run();
    }
}

/*
1. Here there are two classes Bike and Splendor;
2. The Splendor class extends or inherits from the Bike class.
3. Inside the Splendor class, the run method overrides the run method of the Bike class.
4. Inside the main method , we have used a reference of the parent class(Bike) and it refers
   to an object of the child class(Splendor);
5. This is called Upcasting.
6. We have invoked the run method using the reference variable b which is a reference of type Bike
   but it is pointing to an object of Splendor class.
7. Since the child class method overrides the parent class method so the implementation of the
   child class method will be invoked.
8. This is determined during runtime and not compile time and that is why Dynamic Method Dispatch is an
   example of Runtime Polymorphism.





 */