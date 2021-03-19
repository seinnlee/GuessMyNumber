package game;

import user.User;

import java.util.Random;
import java.util.Scanner;

public class Guess {

    int secretNum;
    int upperBound;
    int trial; //number of trials the user gets
    Random randomNum = new Random(); //instantiates a Random class
    User player;

    int guess; //user's guess
    boolean correct = false; //initialize the answer to false

    public Guess(int level) {
        if (level == 1) {
            upperBound = 20;
            trial = 5;
            secretNum = randomNum.nextInt(upperBound)+1;
        } else if (level == 2) {
            upperBound = 100;
            trial = 5;
            secretNum = randomNum.nextInt(upperBound)+1;
        } else if (level == 3) {
            upperBound = 100;
            trial = 3;
            secretNum = randomNum.nextInt(upperBound)+1;
        } else {
            System.out.println("You have selected a mode that does not exist!");
        }
    }

    public void play(User user) {
        player = user;
        System.out.println("Welcome "+player.getName()+"!");
        System.out.println("You have selected "+player.getLevelString());
        System.out.println("");
        System.out.println("A random number has been generated between 0 and "+upperBound+".");
        System.out.println("");
        Scanner userInput = new Scanner(System.in);

        while (trial != 0) {
            System.out.println("Please enter your guess:");
            guess = userInput.nextInt();

            if (guess == secretNum) {
                System.out.println("You have guessed correctly!");
                System.out.println("You had "+trial+" guess(es) left!");
                break;
            } else if (guess < secretNum) {
                System.out.println("Guess Higher!");
            } else if (guess > secretNum) {
                System.out.println("Guess Lower!");
            }
            trial--;
            System.out.println("Remaining Guess(es): "+trial);
        }

        if (trial == 0) {
            System.out.println("You have used all your guesses.");
            System.out.println("The answer was: "+secretNum);
        } else {
            System.out.println("Thank you playing "+player.getName()+".");
        }
    }

}
