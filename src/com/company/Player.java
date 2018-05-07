package com.company;

import java.util.Scanner;


public class Player extends Items {
    Scanner scan;

    public Player(){
//        super() calls the parent constructor with no arguments.
        super();
//        Get Standard Input/Output with Java using a Scanner or use Processing to get mouse / keyboard / x input
        scan = new Scanner(System.in);
    }


    public CHOICES getChoice(){
        System.out.println("ENTER: R= Rock, P=Paper, S=Scissors");
//        Handle incorrect capitalization of otherwise valid user input (rock, Rock, RoCk, ROCK, etc.)
        char playerChoice = scan.nextLine().toUpperCase().charAt(0);


        switch (playerChoice){
            case 'R' :
                return CHOICES.ROCK;
            case 'P' :
                return CHOICES.PAPER;
            case 'S':
                return CHOICES.SCISSORS;
            }
//Handle invalid user input
        System.out.println("Invalid Input");
        return getChoice();
        }
    }



