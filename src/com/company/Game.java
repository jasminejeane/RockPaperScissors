package com.company;
import java.util.Scanner;


public class Game extends GameItems {
    private Player player1;
    private Player player2;
    private Computer computer;
    private CHOICES player1Choice;
    private CHOICES player2Choice;
    private CHOICES computerChoice;
    private RESULT result;
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
//        System.out.println("Enter 1 for playing against computer or Enter 2 for two player game");
        System.out.println("Enter 1 for playing against computer or Enter 2 for two player game");

        playerType = scan.nextInt();


        if(playerType == 1){
            player1Choice = player1.getChoice();player2Choice = computer.getChoice();
        }else if(playerType == 2) {
            player1Choice = player1.getChoice();
        } else{
            System.out.println("Please enter 1 or 2");
            play();
        }

        result = getResults();
        displayResults();
        stats();

    }

    public void viewHistory(){
        System.out.println("You have played "+ (wins + loses + ties));
        System.out.println("You have won " + wins + " times");
        System.out.println("You have lost " + loses + " times");
        System.out.println("There were " + ties + " ties ..... Thanks for playing!");

    }

    private void stats(){
        if(result == RESULT.WIN){
            wins++;
        }else if(result == RESULT.LOSE){
            loses++;
        }else {
            ties++;
        }
    }

    private void displayResults(){
        switch (result){
            case WIN:
                System.out.println(player1Choice + " beats " + player2Choice + ". Player 1 Wins");
                break;
            case LOSE:
                System.out.println(player1Choice + " loses to " + player2Choice + ". Player 2 or Computer Wins");
                break;
            case TIE:
                System.out.println(player1Choice + " equal to " + player2Choice + ". It's a TIE");
                break;
        }
    }

    private RESULT getResults(){
        if(player1Choice == player2Choice){
            return RESULT.TIE;

        }
            switch (player1Choice){
                case ROCK:
                    return (player2Choice == CHOICES.SCISSORS ? RESULT.WIN : RESULT.LOSE);
                case PAPER:
                    return (player2Choice == CHOICES.ROCK ? RESULT.WIN : RESULT.LOSE);
                case SCISSORS:
                    return (player2Choice == CHOICES.PAPER ? RESULT.WIN : RESULT.LOSE);

            }

        return RESULT.LOSE;
    }

}
