package JavaTutorialOOPS;
abstract class PhoneModel{
    abstract public void switchOn();
    abstract public void switchOff();

    public void display(){
        System.out.println("This is a Phone !");
    }
}

class SamsungSmartPhone extends PhoneModel{
    @Override
    public void switchOn(){
        System.out.println("Switching on Samsung smartphone !");
    }

    @Override
    public void switchOff(){
        System.out.println("Switching off Samsung smartphone !");
    }
}

public class AbstractClass_and_AbstractMethod {
    public static void main(String[] args) {
        SamsungSmartPhone sm1 = new SamsungSmartPhone();
        sm1.switchOn();
        sm1.switchOff();
        sm1.display();
        // PhoneModel pm = new PhoneModel();  --> Abstract classes cannot be instantiated

        PhoneModel ph1 = new SamsungSmartPhone(); // Upcasting
        ph1.switchOn();
        ph1.switchOff();
        ph1.display();
    }
}

/*
    1. Abstract classes are those classes which cannot be instantiated.
    2. However we can create references of the abstract class.
    3. A class can be defined as abstract using the 'abstract' keyword.
    4. A class that contains one or more abstract methods must be declared as abstract.
    5. Apart from abstract methods, an abstract class can contain non-abstract methods also.
    6. An abstract class serves as a base class for other classes to derive.
    7. Classes that will derive the abstract class should implement all the abstract methods otherwise
       they will become abstract classes too.
 */
