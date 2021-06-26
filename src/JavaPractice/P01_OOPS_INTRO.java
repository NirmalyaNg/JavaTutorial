package JavaPractice;

class Employee{
     String emp_name;
     int emp_id;
}

public class P01_OOPS_INTRO {
    public static void main(String[] args) {

        /*
        System.out.println(emp1.emp_id); // Default values
        System.out.println(emp1.emp_name);
         */
        Employee emp1 = new Employee(); // Syntax for creating object
        emp1.emp_name = "Nirmalya";
        emp1.emp_id = 101;
        System.out.println(emp1.emp_name);
        System.out.println(emp1.emp_id);

        Employee emp2 = new Employee();
        emp2.emp_name = "Sampriti";
        emp2.emp_id = 102;
        System.out.println(emp2.emp_name);
        System.out.println(emp2.emp_id);

    }
}
