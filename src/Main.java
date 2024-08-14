import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player("Raihan");
        AgainstComputer game = new AgainstComputer(3, player);
        game.playRound(scanner);
    }


}