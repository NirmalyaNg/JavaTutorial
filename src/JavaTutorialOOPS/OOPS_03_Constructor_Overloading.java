package JavaTutorialOOPS;

class Teacher{
    String name;
    int salary;

    public Teacher(){
        System.out.println("Inside no-parameter constructor");
        this.name = "Anonymous";
        this.salary = 10000;
    }

    public Teacher(String name){
        System.out.println("Inside parameterized constructor with 1 parameter");
        this.name = name;
        this.salary = 10000;
    }

    public Teacher(String name,int salary){
        System.out.println("Inside parameterized constructor with 2 parameters");
        this.name = name;
        this.salary = salary;
    }

    public void display(){
        System.out.println("Teacher name : " + this.name);
        System.out.println("Teacher salary : " + this.salary);
    }
}


public class OOPS_03_Constructor_Overloading {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.display();

        Teacher t2 = new Teacher("Nirmalya");
        t2.display();

        Teacher t3 = new Teacher("SKD",0);
        t3.display();
    }
}
