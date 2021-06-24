package JavaTutorialOOPS;

import java.util.Scanner;

class Game{
    int correctNumber;
    int guess;
    int number_of_guesses;
    boolean isCorrect;

    public Game(){
        System.out.println("Starting the guessing game ...");
        this.correctNumber = (int) Math.abs(Math.random() * 20 + 1);
        this.isCorrect = false;
        this.number_of_guesses = 0;
    }

    public void takeUserInput(int n){
        this.guess = n;
    }

    public void isCorrectNumber(){
        this.number_of_guesses++;
        if(this.correctNumber == this.guess){
            System.out.println("Correct Guess !!");
            System.out.println("Number of guesses : " + this.number_of_guesses);
            this.isCorrect = true;
        }
        if(this.guess > this.correctNumber){
            System.out.println("Please guess a smaller number");

        }
        if(this.guess < this.correctNumber){
            System.out.println("Please guess a larger number");
        }
    }

}

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game g = new Game();

        while(!g.isCorrect){
            System.out.println("Please guess a number between 1 and 20(inclusive) : ");
            int input = sc.nextInt();

            if(input <= 0 || input > 20){
                System.out.println("Wrong Input !!");
                continue;
            }
            g.takeUserInput(input);
            g.isCorrectNumber();
        }
    }
}
