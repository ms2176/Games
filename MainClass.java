package Games;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Game Lounge! Please pick your game:");
        System.out.println("1. Dice Roller\n2. Higher or Lower\n3. Hangman");

        int choice = getIntInput(scanner);

        GameSuperclass game = null;

        switch (choice) {
            case 1:
                game = new DiceRoller();
                break;
            case 2:
                game = new HigherOrLower();
                break;
            case 3:
                game = new Hangman();
                break;
            default:
                System.out.println("Invalid choice. Goodbye!");
                System.exit(0);
        }

        if (game != null) {
            game.printGameIntro();
            while (true) {
                if (!game.processInput(scanner)) {
                    break;
                }
            }
            System.out.println("Thank you for playing, goodbye!");
        }
        scanner.close();
    }

    // Helper method to check if the input is an integer
    private static int getIntInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid integer choice.");
            scanner.next(); // Clear the invalid input
        }
        return scanner.nextInt();
    }
}