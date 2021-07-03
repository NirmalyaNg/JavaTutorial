package Accenture_Java_HandsOn;

import java.util.Scanner;

class Account{
    private int accountId;
    private String accountType;
    private int balance;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean withdraw(int amount){
        if(this.balance >= amount){
            this.balance -= amount;
            System.out.println("Balance amount after withdraw:" + this.balance);
            return true;
        }
        System.out.println("Sorry!!! No enough balance");
        return false;
    }
}

public class OOPS_ClassObjectsPackages_07 {
    public static void main(String[] args) {
        Account a = getAccountDetails();
        int withdrawAmount = getWithDrawAmount();
        a.withdraw(withdrawAmount);
    }
    public static Account getAccountDetails(){
        Account a = new Account();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account id:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter account type:");
        String accountType = sc.nextLine();

        System.out.println("Enter balance:");
        int balance = sc.nextInt();

        while(balance <= 0){
            System.out.println("Balance should be positive");
            System.out.println("Enter balance:");
            balance = sc.nextInt();
        }
        a.setAccountId(id);
        a.setAccountType(accountType);
        a.setBalance(balance);

        return a;
    }

    public static int getWithDrawAmount(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount to be withdrawn:");
        int amount = sc.nextInt();

        while(amount <= 0){
            System.out.println("Amount should be positive");
            System.out.println("Enter amount to be withdrawn:");
            amount = sc.nextInt();
        }
        return amount;
    }
}
