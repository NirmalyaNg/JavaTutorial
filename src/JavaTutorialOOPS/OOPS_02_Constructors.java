package JavaTutorialOOPS;

class Student{
    String name;
    int std_id;

    // Constructor should not be made private otherwise we will not be able to instantiate the class.
    // However private constructors are possible if we don't want the class to be instantiated.
    public Student(String name,int std_id){
        this.name = name;
        this.std_id = std_id;
    }

    public void display(){
        System.out.println("Student Name :- " + this.name);
        System.out.println("Student ID :- " + this.std_id);
    }
}

public class OOPS_02_Constructors {
    public static void main(String[] args) {
        Student std1 = new Student("nirmalya",145);
        std1.display();
    }
}
