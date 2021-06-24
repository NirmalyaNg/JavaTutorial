package JavaTutorialBasics;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    static int max_score = 0;
    static int user_score = 0;
    static int comp_score = 0;


    static String printChoice(int c){
        String choice = "";
        if(c == 0){
            choice = "Rock";
        }
        if(c == 1){
            choice = "Paper";
        }
        if(c == 2){
            choice = "Scissor";
        }
        return choice;
    }
    static void checkWinLossDraw(int u,int c){
        if(u == c){
            System.out.println("Its a Draw !");
            return;
        }
        if ((u == 0 && c == 2) || (u == 1 && c == 0) || (u == 2 && c == 1)){
            System.out.println("You win !");
            user_score++;
            return;
        }
        System.out.println("Computer wins !");
        comp_score++;

    }

    static void declareWinner(){
        if(user_score == max_score){
            System.out.println("User has won the game !!");
        }else if(comp_score == max_score){
            System.out.println("Computer has won the game !!");
        }
    }

    public static void main(String[] args) {
        // 0 --> Rock  1 --> Paper 2 --> Scissor
        Scanner sc = new Scanner(System.in);

        // Take max score as input from the user
        System.out.println("Enter max score : ");
        max_score = sc.nextInt();

        while(user_score != max_score && comp_score != max_score){
            System.out.println("0 -> Rock  || 1 -> Paper || 2 -> Scissor || 3 -> Exit Game");
            System.out.println("Enter your choice :- ");
            int choice = sc.nextInt();

            // Validate user choice
            if(choice == 3){
                System.out.println("Game Ended");
                break;
            }else{
                if(choice < 0 || choice > 3){
                    System.out.println("Wrong Choice");
                    continue;
                }
                // Generate computer choice
                Random rand = new Random();
                int comp_choice = rand.nextInt(3);

                // Print Choices
                System.out.println("You chose " + printChoice(choice));
                System.out.println("Computer chose " + printChoice(comp_choice));

                // Check Win , Loss or Draw
                checkWinLossDraw(choice,comp_choice);

            }
        }
        declareWinner();
    }
}
