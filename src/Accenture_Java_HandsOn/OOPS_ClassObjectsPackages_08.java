package Accenture_Java_HandsOn;

import java.util.Scanner;

class Movie{
    private String movieName;
    private String movieCategory;
    private int ticketCost;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieCategory() {
        return movieCategory;
    }

    public void setMovieCategory(String movieCategory) {
        this.movieCategory = movieCategory;
    }

    public int getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(int ticketCost) {
        this.ticketCost = ticketCost;
    }

    public int calculateTicketCost(String circle){
        if(!(circle.equalsIgnoreCase("GOLD") || circle.equalsIgnoreCase("SILVER")) && !(this.movieCategory.equalsIgnoreCase("2D") || this.movieCategory.equalsIgnoreCase("3D"))){
            return -3;
        }

        if(!this.movieCategory.equalsIgnoreCase("2D") && !this.movieCategory.equalsIgnoreCase("3D")){
            return -1;
        }
        if(!circle.equalsIgnoreCase("GOLD") && !circle.equalsIgnoreCase("SILVER")){
            return -2;
        }

        if(circle.equalsIgnoreCase("GOLD")){
            if(this.movieCategory.equalsIgnoreCase("2D")) {
                this.ticketCost = 300;
            }else{
                this.ticketCost = 500;
            }
        }else{
            if(this.movieCategory.equalsIgnoreCase("2D")){
                this.ticketCost = 250;
            }else{
                this.ticketCost = 450;
            }
        }
        return 0;
    }
}


public class OOPS_ClassObjectsPackages_08 {
    public static void main(String[] args) {
        Movie mv = getMovieDetails();
        String circle = getCircle();

        System.out.println("Movie name = " + mv.getMovieName());
        System.out.println("Movie category = " + mv.getMovieCategory());

        int returnValue = mv.calculateTicketCost(circle);

        if(returnValue == -1){
            System.out.println("Sorry there is no " + mv.getMovieCategory() + " type of category in theater.");
        } else if (returnValue == -2) {
            System.out.println("Sorry!!! Circle is Invalid.");
        }else if(returnValue == -3){
            System.out.println("Sorry!!! Both circle and category are Invalid.");
        }else{
            System.out.println("The ticket cost is = " + mv.getTicketCost());
        }
    }

    public static Movie getMovieDetails(){
        Scanner sc = new Scanner(System.in);
        Movie mv = new Movie();

        System.out.println("Enter the movie name:");
        String name = sc.nextLine();

        System.out.println("Enter the movie category:");
        String movieCategory = sc.nextLine();

        mv.setMovieName(name);
        mv.setMovieCategory(movieCategory);

        return mv;
    }
    public static String getCircle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the circle:");
        String circle = sc.nextLine();

        return circle;
    }

}
