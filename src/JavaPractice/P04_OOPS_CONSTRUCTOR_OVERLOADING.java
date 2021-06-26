package JavaPractice;

class Person{
    String name;
    int age;

    public Person(){
        this.name = "Anonymous";
        this.age = 0;
    }

    public Person(String name){
        this.name = name;
        this.age = 0;
    }
    public Person(int age){
        this.name = "Anonymous";
        this.age = age;
    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
    }
}


public class P04_OOPS_CONSTRUCTOR_OVERLOADING {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person(32);
        Person p3 = new Person("Sampriti");
        Person p4 = new Person("Nirmalya",22);

        p1.display();
        p2.display();
        p3.display();
        p4.display();

    }
}
