public class VersusComputerGame implements Game{
    private int numberOfRounds;
    public VersusComputerGame(int numberOfRounds){
        this.numberOfRounds=numberOfRounds;
    }

    public void playRound(){

    }



    public String playRock(String choice){
        System.out.println("User plays Paper");
        System.out.println("Computer plays " + choice);
        String result = null;

        switch (choice) {
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
    };

    public String playPaper(String choice){
        System.out.println("User plays Paper");
        System.out.println("Computer plays " + choice);
        String result = null;

        switch (choice) {
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

    public String playScissors(String choice){
        System.out.println("User plays Scissors");
        System.out.println("Computer plays " + choice);
        String result = null;

        switch (choice) {
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
