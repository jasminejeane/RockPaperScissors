package com.company;

public class Game extends GameItems {
    private Player player;
    private Computer computer;
    private CHOICES playerChoice;
    private CHOICES computerChoice;
    private RESULT result;

    public Game(){
        super();
        player = new Player();
        computer = new Computer();

    }

    public void play(){
        playerChoice = player.getChoice();
        computerChoice = computer.getChoice();

    }

    public RESULT getResult(){
        if(playerChoice == computerChoice){
            return RESULT.TIE;

            switch (playerChoice){
                case ROCK:
                    return (computerChoice == CHOICES.SCISSORS ? RESULT.WIN : RESULT.LOSE);
                case PAPER:
                    return (computerChoice == CHOICES.ROCK ? RESULT.WIN : RESULT.LOSE);
                case SCISSORS:
                    return (computerChoice == CHOICES.PAPER ? RESULT.WIN : RESULT.LOSE);

            }
        }
        return RESULT.LOSE;
    }

}
