package Accenture_Java_HandsOn;

import java.util.Scanner;

class Employee{
    private int employeeId;
    private String employeeName;
    private double salary;
    private double netSalary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

    public void calculateNetSalary(int pfpercentage){
        double pfAmount = (pfpercentage * salary) / 100;   // double / int  = double , double * int = double
        this.netSalary = this.salary - pfAmount;
    }
}


public class OOPS_ClassObjectsPackages_02 {
    public static void main(String[] args) {
        Employee emp = getEmployeeDetails();

        int pfpercentage = getPFPercentage();
        emp.calculateNetSalary(pfpercentage);


        System.out.println("Id : " + emp.getEmployeeId());
        System.out.println("Name : " + emp.getEmployeeName());
        System.out.println("Salary : " + emp.getSalary());
        System.out.println("Net Salary : " + emp.getNetSalary());
    }

    public static Employee getEmployeeDetails(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Id:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter salary:");
        double salary = sc.nextDouble();



        Employee emp = new Employee();
        emp.setEmployeeId(id);
        emp.setEmployeeName(name);
        emp.setSalary(salary);

        return emp;
    }

    public static int getPFPercentage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PF percentage:");
        int pfpercentage = sc.nextInt();
        return pfpercentage;
    }
}
