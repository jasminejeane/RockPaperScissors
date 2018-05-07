package com.company;

import java.util.Scanner;


public class Player extends Items {
    Scanner scan;

    public Player(){
        super();

        scan = new Scanner(System.in);
    }


    public CHOICES getChoice(){
        System.out.println("ENTER: R= Rock, P=Paper, S=Scissors");
        char playerChoice = scan.nextLine().toUpperCase().charAt(0);


        switch (playerChoice){
            case 'R' :
                return CHOICES.ROCK;
            case 'P' :
                return CHOICES.PAPER;
            case 'S':
                return CHOICES.SCISSORS;
            }

        System.out.println("Invalid Input");
        return getChoice();
        }
    }



