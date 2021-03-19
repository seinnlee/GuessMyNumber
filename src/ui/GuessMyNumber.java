package ui;

import user.User;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {

    public static void main(String[] args) {
        System.out.println("Please enter your name:");
        Scanner userInput = new Scanner(System.in);
        User user = new User (userInput.next());

        System.out.println("Please select your mode:");
        System.out.println(" 1. Easy Mode");
        System.out.println(" 2. Medium Mode");
        System.out.println(" 3. Hard Mode");

        int userLevel = userInput.nextInt();
        user.userLevel(userLevel);

    }
}
