package Accenture_Java_HandsOn;

import java.util.Scanner;

class Ticket{
    private int ticketid;
    private int price;
    private static int availableTickets;

    public int getTicketid() {
        return ticketid;
    }

    public void setTicketid(int ticketid) {
        this.ticketid = ticketid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getAvailableTickets() {
        return availableTickets;
    }

    public static void setAvailableTickets(int availableTickets) {
        if(availableTickets > 0){
            Ticket.availableTickets = availableTickets;
        }
    }

    public int calculateTicketCost(int nooftickets){
        int totalAmount = 0;
        if(Ticket.availableTickets > nooftickets){
            Ticket.availableTickets -= nooftickets;
            totalAmount = nooftickets * this.price;
            return totalAmount;
        }else{
            return -1;
        }

    }
}

public class OOPS_ClassObjectsPackages_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of bookings:");
        int bookings = sc.nextInt();

        System.out.println("Enter the available tickets:");
        int availableTickets = sc.nextInt();
        Ticket.setAvailableTickets(availableTickets);

        for(int i = 0;i < bookings;i++){
            Ticket t = new Ticket();

            System.out.println("Enter the ticketid:");
            int ticketid = sc.nextInt();

            System.out.println("Enter the price:");
            int price = sc.nextInt();

            System.out.println("Enter the no of tickets:");
            int numberOfTickets = sc.nextInt();

            t.setTicketid(ticketid);
            t.setPrice(price);

            int oldNumberOfTickets = Ticket.getAvailableTickets();
            int result = t.calculateTicketCost(numberOfTickets);

            if(result == -1){
                System.out.println("Tickets not sufficient / available");
            }else{
                System.out.println("Available tickets:" + oldNumberOfTickets);
                System.out.println("Total amount:" + result);
                System.out.println("Available tickets after booking:" + Ticket.getAvailableTickets());
            }

        }
    }
}
