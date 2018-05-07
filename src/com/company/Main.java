package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        Game game = new Game();
        char quit = ' ';
        System.out.println("Welcome to Rock Paper Scissors!");
        try {
            while (quit != 'N') {
                game.play();
                System.out.println("Press any key Play again or press 'N' to quit");
                quit = scan.nextLine().toUpperCase().charAt(0);

            }
            scan.close();
            game.viewHistory();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}

//tutorial help https://www.youtube.com/watch?v=RmgrorF6O_w
