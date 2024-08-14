import java.util.Random;
import java.util.Scanner;

public class AgainstComputer extends Game implements GameEngine{
    private int compPoints;

    public AgainstComputer(int pointsGoal, Player player){
        super(pointsGoal, player);
        this.compPoints=0;
    }
    public void playGame(Scanner input){

        do{

        }while(!goalReached());


    }

    public void playRound(Scanner input){
        int choiceNum;
        String result = null;
        System.out.println("Rock, Paper, Scissors Game");
        System.out.println("1. Rock\n2. Paper\n3. Scissors");

        System.out.print("Enter your choice: ");

        choiceNum = input.nextInt();

        String compChoice = computerPlays();

        System.out.println("Computer plays " + compChoice);

        switch (choiceNum) {
            case 1:
                result = playRock(compChoice);
                break;
            case 2:
                result = playPaper(compChoice);
                break;
            case 3:
                result = playScissors(compChoice);
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid choice please try again.");
                break;
        }
        showResult(result);

    }

    public String computerPlays(){
        // Generate random object
        Random rand = new Random();

        // Get length of rps for maximum
        int max = rps.length;

        // Get random choice from rps
        String compChoice = rps[rand.nextInt(max)];

        return compChoice;
    }

    // Computer wins round then add 1 point to compPoints
    public void compWinsRound(){
        compPoints++;
    }

    public boolean goalReached(){
        boolean playerReachesGoal = getPlayer().getNumberOfPoints() == getPointsGoal();
        boolean computerReachesGoal = compPoints == getPointsGoal();
        return (playerReachesGoal || computerReachesGoal);
    }
}
