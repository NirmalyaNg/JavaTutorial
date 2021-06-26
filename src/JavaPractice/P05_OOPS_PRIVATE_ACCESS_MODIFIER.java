package JavaPractice;

class Customer{
    String name;
    private int balance;

    public Customer(String name,int balance){
        this.name = name;
        this.balance = balance;
    }

    public void display(){
        System.out.println("Customer name : " + this.name);
        System.out.println("Customer balance : " + this.balance);
    }

    // Setters
    public void setBalance(int balance){
        this.balance = balance;
    }
}


public class P05_OOPS_PRIVATE_ACCESS_MODIFIER {
    public static void main(String[] args) {
        Customer c1 = new Customer("Tubu",30000);
        c1.display();
        // c1.balance = 30000000;  --> Error since balance is private attribute
        c1.setBalance(150000);
        c1.display();


    }
}
