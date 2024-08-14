import java.util.Scanner;

public interface GameEngine {
    public void playRound(Scanner input);
    public boolean goalReached();
}
