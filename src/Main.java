import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu(scanner);
    }

    public static void Menu(Scanner input){
        System.out.println("Rock, Paper, Scissors Game");
        System.out.println("1. Versus Computer\n2. Two Player Game\n0. Quit");
        String choice = input.next();
        Game game;
        Player player = new Player("Raihan");
        switch(choice){
            case "1":
                game = new AgainstComputer(3,player);
                break;
            case "2":
                break;
            case "0":
                break;
            default:
                System.out.println("Invalid input. Please try again.");
                break;

        }



    }


}