package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        Game game = new Game();
        char quit = ' ';

        while (quit != 'N'){
            game.play();
            System.out.println("Press any key Play again or press 'N' to quit");
            quit = scan.nextLine().toUpperCase().charAt(0);

        }
        scan.close();
        game.displayStats();
    }
}
