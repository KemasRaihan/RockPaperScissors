import java.util.Random;
import java.util.Scanner;

public class Game{
    // List to choose rock, paper or scissors
    String[] rps = {"Rock", "Paper", "Scissors"};
    private int pointsGoal;
    private Player player;
    public Game (int pointsGoal, Player player){
        this.pointsGoal=pointsGoal;
        this.player=player;
    }

    public void setPlayer(Player player){
        this.player=player;
    }

    public void setPointsGoal(int pointsGoal){
        this.pointsGoal=pointsGoal;
    }
    public Player getPlayer(){return player;}

    public int getPointsGoal(){return pointsGoal;}

    public static void showResult(String result){
        // Print result
        if (result.equals("Win"))
            System.out.println("You win the game!\n");
        else if (result.equals("Lose"))
            System.out.println("You lost the game!\n");
        else
            System.out.println("It's a draw\n");
    }




    public String playRock(String opponentChoice){
        String result = null;

        switch (opponentChoice) {
            case "Rock":
                result = "Draw";
                break;
            case "Scissors":
                result = "Win";
                break;
            default:
                result = "Lose";
                break;
        }
        return result;
    };

    public String playPaper(String opponentChoice){
        String result = null;

        switch (opponentChoice) {
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

    public String playScissors(String opponentChoice){
        String result = null;

        switch (opponentChoice) {
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
}
