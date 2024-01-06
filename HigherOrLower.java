package Games;

import java.util.Random;
import java.util.Scanner;

public class HigherOrLower extends GameSuperclass {
    private int targetNumber;
    private int guesses;

    public HigherOrLower() {
        super("Higher or Lower");
        Random random = new Random();
        this.targetNumber = random.nextInt(101);
        this.guesses = 0;
    }

    @Override
    public void printGameIntro() {
        System.out.println("Welcome to " + gameName);
        System.out.println("I'm thinking of a number between 0 and 100 (inclusive)");
        System.out.println("Please input your first guess:");
    }

    @Override
    public boolean processInput(Scanner scanner) {
        int guess = scanner.nextInt();
        guesses++;

        if (guess < targetNumber) {
            System.out.println("Sorry, my number is HIGHER than that! Guess again:");
        } else if (guess > targetNumber) {
            System.out.println("Sorry, my number is LOWER than that! Guess again:");
        } else {
            System.out.println("Correct! My number was: " + targetNumber);
            System.out.println("You got it right in " + guesses + " guesses!");
            return false;
        }
        return true;
    }
}
