package Games;

import java.util.Random;
import java.util.Scanner;

public class DiceRoller extends GameSuperclass {

    public DiceRoller() {
        super("Dice Roller");
    }

    @Override
    public void printGameIntro() {
        System.out.println("Welcome to " + gameName);
        System.out.println("Please input how many D6s you want to roll:");
    }

    @Override
    public boolean processInput(Scanner scanner) {
        int numDice = scanner.nextInt();
        if (numDice < 1 || numDice > 6) {
            System.out.println("Please enter a number between 1 and 6.");
            return true;
        }

        System.out.println("Dice rolled:");
        Random random = new Random();
        for (int i = 0; i < numDice; i++) {
            int result = random.nextInt(6) + 1;
            System.out.print("Die " + (i + 1) + " rolled " + result);
            if (i < numDice - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println("\nAll dice rolled!");
        return false;
    }
}
