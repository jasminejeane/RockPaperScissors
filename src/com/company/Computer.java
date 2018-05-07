package com.company;

public class Computer extends Items{

    public Computer(){
        super();
    }

    public Choices getChoice(){
        int choice = (int)(3*Math.random() + 1);

        switch (choice){
            case 1:
                return Choices.ROCK;
            case 2:
                return Choices.PAPER;
        }
        return Choices.SCISSORS;

    }

}

