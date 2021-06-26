package JavaTutorialOOPS;

class MyEmployee {
    private String name;
    private int salary;

    public String getName(){
        return this.name;
    }
    public int getSalary(){
        return this.salary;
    }

    public void setName(String s){
        this.name = s;
    }

    public void setSalary(int sal){
        this.salary = sal;
    }
}


public class OOPS_04_Private_Access_Modifier {
    public static void main(String[] args) {
        MyEmployee emp1 = new MyEmployee();
        MyEmployee emp2 = new MyEmployee();

        emp1.setName("Nirmalya");
        emp1.setSalary(28000);

        emp2.setName("Sampriti");
        emp2.setSalary(28000);

        // emp1.name = "Tubai";  --> Will give error since name has private access modifier
        System.out.println(emp1.getName());
        System.out.println(emp1.getSalary());

        System.out.println(emp2.getName());
        System.out.println(emp2.getSalary());
    }
}
