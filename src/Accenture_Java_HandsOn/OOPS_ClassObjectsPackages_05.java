package Accenture_Java_HandsOn;

import java.util.Scanner;

class Student{
    private int studentId;
    private String studentName;
    private String studentAddress;
    private String collegeName;

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public Student(int studentId,String studentName,String studentAddress){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = "NIT";
    }
    public Student(int studentId,String studentName,String studentAddress,String collegeName){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = collegeName;
    }
}

public class OOPS_ClassObjectsPackages_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student st; // Creating a reference of Student class

        System.out.println("Enter Student's Id:");
        int studentId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Student's Name:");
        String studentName = sc.nextLine();

        System.out.println("Enter Student's Address");
        String studentAddress = sc.nextLine();

        System.out.println("Whether the student is from NIT(Yes/No):");
        String response = sc.nextLine();

        while(!response.equals("YES") && !response.equals("yes") && !response.equals("NO") && !response.equals("no")){
            System.out.println("Wrong Input");
            System.out.println("Whether the student is from NIT(Yes/No):");
            response = sc.nextLine();
        }

        if(response.equals("YES") || response.equals("yes")){
            st = new Student(studentId,studentName,studentAddress);
        }else{
            System.out.println("Enter the college name:");
            String collegeName = sc.nextLine();
            st = new Student(studentId,studentName,studentAddress,collegeName);
        }

        System.out.println("Student id:" + st.getStudentId());
        System.out.println("Student name:" + st.getStudentName());
        System.out.println("Address:" + st.getStudentAddress());
        System.out.println("College name:" + st.getCollegeName());
    }
}
