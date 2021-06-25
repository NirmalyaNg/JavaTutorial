package JavaTutorialOOPS;
class Animal{
    public void sayHello(){
        System.out.println("Hello from an animal");
    }
}

class Dog extends Animal{
    @Override // Annotation
    public void sayHello(){
        System.out.println("Hello from a dog");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();

        a.sayHello();
        d.sayHello(); // This will invoke the overridden method in the child class


    }
}
