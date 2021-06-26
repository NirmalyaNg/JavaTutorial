package JavaPractice;

class Employee1{
    String name;
    int empId;

    public Employee1(String name,int stdId){
        this.name = name;
        this.empId = stdId;
    }

    public void displayDetails(){
        System.out.println("The Employee Details are :- ");
        System.out.println("Employee name : " + this.name);
        System.out.println("Employee Id : " + this.empId);
    }

}

public class P02_OOPS_CONSTRUCTORS {
    public static void main(String[] args) {
        Employee1 emp1 = new Employee1("Sampriti",101);
        Employee1 emp2 = new Employee1("Motumalya",102);

        emp1.displayDetails();
        emp2.displayDetails();
    }
}
