package Games;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman extends GameSuperclass {
    private String targetWord;
    private ArrayList<Character> guessedLetters;

    public Hangman() {
        super("Hangman");
        this.guessedLetters = new ArrayList<>();
        loadWordsFromFile();
        selectRandomWord();
    }

    @Override
    public void printGameIntro() {
        System.out.println("Welcome to " + gameName);
        System.out.println("I'm thinking of a word!");
        System.out.println("Please input your first guess at a letter:");
    }

    @Override
    public boolean processInput(Scanner scanner) {
        char guess = scanner.next().charAt(0);

        if (guessedLetters.contains(guess)) {
            System.out.println("You already guessed that letter. Pick a different one!");
            return true;
        }

        guessedLetters.add(guess);
        if (targetWord.contains(String.valueOf(guess))) {
            updateGuessedWord();
            if (targetWord.equals(getCurrentState())) {
                System.out.println("You've guessed my word! It was: " + targetWord);
                System.out.println("You needed to guess " + getUniqueGuessesCount() + " unique letters.");
                return false;
            }
            System.out.println("Yes, my word does have that letter!");
            System.out.println("The word now looks like this: " + getCurrentState());
        } else {
            System.out.println("Sorry, the word I'm thinking of doesn't have that letter!");
            System.out.println("The word now looks like this: " + getCurrentState());
        }
        System.out.println("Please guess another letter:");
        return true;
    }

    private void loadWordsFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("wordList.txt"))) {
            String line = reader.readLine();
            String[] words = line.split(",");
            targetWord = words[new Random().nextInt(words.length)];
        } catch (IOException e) {
            System.out.println("Error reading word list file: " + e.getMessage());
        }
    }

    private void selectRandomWord() {
        guessedLetters.clear();
    }

    private String getCurrentState() {
        StringBuilder currentState = new StringBuilder();
        for (char letter : targetWord.toCharArray()) {
            if (guessedLetters.contains(letter)) {
                currentState.append(letter);
            } else {
                currentState.append("_");
            }
        }
        return currentState.toString();
    }

    private void updateGuessedWord() {
        // Update the guessed word with the guessed letters
    }

    private int getUniqueGuessesCount() {
        ArrayList<Character> uniqueGuesses = new ArrayList<>();
        for (char letter : guessedLetters) {
            if (!uniqueGuesses.contains(letter)) {
                uniqueGuesses.add(letter);
            }
        }
        return uniqueGuesses.size();
    }
}
