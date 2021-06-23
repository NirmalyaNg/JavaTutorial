package JavaTutorialOOPS;

// A java file can contain only one public class

class Employee{
    String name;
    int std_id;
}
public class ClassObject {
    public static void main(String [] args){
        // Create an object of the Employee class

        Employee emp1 = new Employee();
        System.out.println("Employee name : " + emp1.name); // Prints default value null
        System.out.println("Employee Id : " + emp1.std_id); // Prints default value 0

        emp1.name = "Nirmalya";
        emp1.std_id = 10;

        System.out.println("Employee name : " + emp1.name);
        System.out.println("Employee Id : " + emp1.std_id);
    }
}
