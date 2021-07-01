package Accenture_Java_HandsOn;

import java.util.Scanner;

class Person{
    private String name;
    private char gender;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class BusTicket{
    private int ticketNo;
    private float ticketPrice;
    private float totalAmount;
    private Person person;  // has-A relationship one class contains another class's object as attribute

    public int getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(int ticketNo) {
        this.ticketNo = ticketNo;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void calculateTotal(){
        int discount = 0;
        if(this.person.getAge() < 16){
            discount = 50;
        }else if(this.person.getAge() >= 60){
            discount = 25;
        }else if(this.person.getGender() == 'F' || this.person.getGender() == 'f'){
            discount += 10;
        }
        this.totalAmount = this.ticketPrice - (discount  * this.ticketPrice / 100);
    }
}

public class OOPS_ClassObjectsPackages_03 {
    public static void main(String[] args) {
        BusTicket bt = getTicketDetails();
        bt.calculateTotal();

        System.out.println("Ticket no:" + bt.getTicketNo());
        System.out.println("Passenger name:" + bt.getPerson().getName());
        System.out.println("Price of a ticket:" + bt.getTicketPrice());
        System.out.println("Total Amount:" + bt.getTotalAmount());
    }

    public static BusTicket getTicketDetails(){
        Scanner sc = new Scanner(System.in);
        BusTicket bt = new BusTicket();
        Person p = new Person();

        // Taking the inputs from user
        System.out.println("Enter the passenger name:");
        String name = sc.nextLine();


        System.out.println("Enter the gender(M or F / m or f):");
        char gender = sc.next().charAt(0);

        System.out.println("Enter the age:");
        int age = sc.nextInt();

        System.out.println("Enter the ticket no:");
        int ticketNo = sc.nextInt();

        System.out.println("Enter the ticket price:");
        float price = sc.nextFloat();

        bt.setTicketNo(ticketNo);
        bt.setTicketPrice(price);

        p.setName(name);
        p.setGender(gender);
        p.setAge(age);

        bt.setPerson(p);
        return bt;
    }
}
