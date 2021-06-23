package JavaTutorialOOPS;

// A java file can contain only one public class

class Employee{

    // Attributes
    String name;
    int std_id;

    // Methods
    public void showDetails(){
        System.out.println("Name of Employee : " + this.name);
        System.out.println("Id of Employee : " + this.std_id);
    }
}
public class ClassObject {
    public static void main(String [] args){

        // Create an object of the Employee class
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        System.out.println("Employee name : " + emp1.name); // Prints default value null
        System.out.println("Employee Id : " + emp1.std_id); // Prints default value 0

        // Setting attributes
        emp1.name = "Nirmalya";
        emp1.std_id = 10;

        emp2.name = "Sampriti";
        emp2.std_id = 12;

        // Invoking method
        emp1.showDetails();
        emp2.showDetails();
    }
}
