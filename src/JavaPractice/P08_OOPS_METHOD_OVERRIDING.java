package JavaPractice;

class Animal{
     void display(){
        System.out.println("I am an animal !!");
    }
}

class Tiger extends Animal{
    void display(){
        System.out.println("I am a Tiger");
    }
}


public class P08_OOPS_METHOD_OVERRIDING {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.display();
        Tiger t1 = new Tiger();
        t1.display();
    }
}
