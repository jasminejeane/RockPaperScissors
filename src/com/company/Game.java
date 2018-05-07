package com.company;
import java.util.Scanner;


public class Game extends Items {
    private Player player1;
    private Player player2;
    private Computer computer;
    private Choices player1Choice;
    private Choices player2Choice;
    private Result result;
    private int playerType;
    private static int wins;
    private static int loses;
    private static int ties;

    public Game(){
        super();
        player1 = new Player();
        player2 = new Player();
        computer = new Computer();

    }

    public void play(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1 for playing against computer or Enter 2 for two player game");
//        Get Standard Input/Output with Java using a Scanner or use Processing to get mouse / keyboard / x input
        playerType = scan.nextInt();

        if(playerType == 1){
            player1Choice = player1.getChoice();
            player2Choice = computer.getChoice();
        }else if(playerType == 2){
            player1Choice = player1.getChoice();
            player2Choice = player2.getChoice();
        }

        result = getResults();
        displayResults();
        stats();

    }

    public void viewHistory(){
        System.out.println("Games: "+ (wins + loses + ties));
        System.out.println("Won: " + wins);
        System.out.println("Lost: " + loses);
        System.out.println("Ties:" + ties);
        System.out.println("Thanks for playing");

    }

    private void stats(){
        if(result == Result.WIN){
            wins++;
        }else if(result == Result.LOSE){
            loses++;
        }else {
            ties++;
        }
    }

    private void displayResults(){
        switch (result){
            case WIN:
                System.out.println("Player 1: " + player1Choice + " - Player 2: " + player2Choice + " .... Player 1 Wins");
                break;
            case LOSE:
                System.out.println("Player 1: " + player1Choice + " - Player 2: " + player2Choice + " ....Player 2 or Computer Wins");
                break;
            case TIE:
                System.out.println("Player 1: " + player1Choice + " - Player 2: " + player2Choice + " .... It's a TIE");
                break;
        }
    }

    private Result getResults(){
        if(player1Choice == player2Choice){
            return Result.TIE;

        }
        switch (player1Choice){
            case ROCK:
                return (player2Choice == Choices.SCISSORS ? Result.WIN : Result.LOSE);
            case PAPER:
                return (player2Choice == Choices.ROCK ? Result.WIN : Result.LOSE);
            case SCISSORS:
                return (player2Choice == Choices.PAPER ? Result.WIN : Result.LOSE);

        }

        return Result.LOSE;
    }

}
