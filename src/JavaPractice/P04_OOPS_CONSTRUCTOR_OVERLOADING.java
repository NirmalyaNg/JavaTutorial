package JavaPractice;

import java.util.Scanner;

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
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
}

public class P04_OOPS_CONSTRUCTOR_OVERLOADING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p;

        System.out.println("Enter the way you want to create your profile :");
        System.out.println("1.No name and no age");
        System.out.println("2.Name but no age");
        System.out.println("3.Name and age");

        int choice = sc.nextInt();
        if(choice == 1){
            p = new Person();
        }else if(choice == 2){
            System.out.println("Enter your name:");
            String name = sc.nextLine();
            p = new Person(name);
        }else if(choice == 3){
            System.out.println("Enter your name:");
            String name = sc.nextLine();
            System.out.println("Enter your age:");
            int age = sc.nextInt();
            p = new Person(name,age);
        }
    }
}
