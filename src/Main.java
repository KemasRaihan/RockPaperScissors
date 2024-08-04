import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // List to choose rock, paper or scissors
        String[] rps = {"Rock", "Paper", "Scissors"};

        // Initialise scanner object
        Scanner input = new Scanner(System.in);
        int choiceNum = 0;

        // Generate random object
        Random rand = new Random();

        // Get length of rps for maximum
        int max = rps.length;

        // Get random choice from rps
        String compChoice = rps[rand.nextInt(max)];

        String result = null;


        do {
            System.out.println("Rock, Paper, Scissors Game");
            System.out.println("1. Rock\n2. Paper\n3. Scissors\n0. To Quit");

            System.out.print("Enter your choice: ");

            choiceNum = input.nextInt();

            switch (choiceNum) {
                case 1:
                    result = playRock(compChoice);
                    showResult(result);
                    break;
                case 2:
                    result = playPaper(compChoice);
                    showResult(result);
                    break;
                case 3:
                    result = playScissors(compChoice);
                    showResult(result);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice please try again.");
                    break;
            }
        }while(choiceNum!=0);


    }

    public static String playRock(String compChoice){
        System.out.println("User plays Rock");
        System.out.println("Computer plays " + compChoice);

        String result = null;

        switch (compChoice) {
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

        return result;
    }

    public static String playPaper(String compChoice){
        System.out.println("User plays Paper");
        System.out.println("Computer plays " + compChoice);
        String result = null;

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
        return result;
    }

    public static String playScissors(String compChoice){
        System.out.println("User plays Scissors");
        System.out.println("Computer plays " + compChoice);
        String result = null;

        switch (compChoice) {
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

        return result;
    }

    public static void showResult(String result){
        // Print result
        if (result.equals("Win"))
            System.out.println("You win the game!\n");
        else if (result.equals("Lose"))
            System.out.println("You lost the game!\n");
        else
            System.out.println("It's a draw\n");
    }

}