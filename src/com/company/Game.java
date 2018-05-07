package com.company;

public class Game extends GameItems {
    private Player player;
    private Computer computer;
    private CHOICES playerChoice;
    private CHOICES computerChoice;
    private RESULT result;
    private static int wins;
    private static int loses;
    private static int ties;

    public Game(){
        super();
        player = new Player();
        computer = new Computer();

    }

    public void play(){
        playerChoice = player.getChoice();
        computerChoice = computer.getChoice();
        result = getResults();
        displayResults();
        stats();

    }

    public void displayStats(){
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
                System.out.println(playerChoice + " beats " + computerChoice + ". Player Wins");
                break;
            case LOSE:
                System.out.println(playerChoice + " loses to " + computerChoice + ". Computer Wins");
                break;
            case TIE:
                System.out.println(playerChoice + " equal to " + computerChoice + ". It's a TIE");
                break;
        }
    }

    private RESULT getResults(){
        if(playerChoice == computerChoice){
            return RESULT.TIE;

        }
            switch (playerChoice){
                case ROCK:
                    return (computerChoice == CHOICES.SCISSORS ? RESULT.WIN : RESULT.LOSE);
                case PAPER:
                    return (computerChoice == CHOICES.ROCK ? RESULT.WIN : RESULT.LOSE);
                case SCISSORS:
                    return (computerChoice == CHOICES.PAPER ? RESULT.WIN : RESULT.LOSE);

            }

        return RESULT.LOSE;
    }

}
