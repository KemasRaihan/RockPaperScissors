import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Rock, Paper, Scissors Game");

        // List to choose rock, paper or scissors
        String[] rps = {"Rock", "Paper", "Scissors"};

        // Initialise scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("1. Rock\n2. Paper\n3. Scissors\n0. To Quit");

        System.out.print("Enter your choice: ");

        int choiceNum = input.nextInt();

        String userChoice = rps[choiceNum-1];

        System.out.println("User choice: " + userChoice);

        // Generate random object
        Random rand = new Random();

        // Get length of rps for maximum
        int max= rps.length;

        // Get random choice from rps
        String compChoice = rps[rand.nextInt(max)];

        System.out.println("Computer choice: " + compChoice);

        String result = null;

        if(userChoice.equals("Rock")){ // User chooses Rock
            switch(compChoice){
                case "Scissors":
                    result = "Win";
                    break;
                case "Paper":
                    result = "Lose";
                    break;
                default:
                    result = "Draw";
                    break;
            }
        }else if(userChoice.equals("Paper")) { // User chooses Paper
            switch (compChoice) {
                case "Rock":
                    result = "Win";
                    break;
                case "Scissors":
                    result = "Lose";
                    break;
                default:
                    result = "Draw";
                    break;
            }
        }else{
            switch (compChoice) { // User chooses Scissors
                case "Paper":
                    result = "Win";
                    break;
                case "Rock":
                    result = "Lose";
                    break;
                default:
                    result = "Draw";
                    break;
            }
        }

        if(result.equals("Win"))
            System.out.println("You win the game!");
        else if(result.equals("Lose"))
            System.out.println("You lost the game!");
        else
            System.out.println("It's a draw");



    }
}