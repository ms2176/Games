# Java Game Lounge

## Overview
This project implements a collection of 3 simple games in Java as a course assignment. Each game demonstrates fundamental Java OOP concepts such as inheritance, polymorphism, abstraction, and code organization.

## Games

| Game              | Description                                                          | Key Features                                                                                  |
|-------------------|----------------------------------------------------------------------|----------------------------------------------------------------------------------------------|
| 🎲 Dice Roller    | Rolls a chosen number of dice.                                       | 🎲 Choose number of dice<br>🔄 Random dice rolls                                              |
| 🔢 Higher or Lower| Guess a random number between 0-100.                                 | ❓ Guess a number<br>🔢 Random number generation                                               |
| 🔤 Hangman        | Classic hangman word guessing game.                                  | 📜 Load word list from file<br>❌ Incorrect guesses count<br>💡 Clue reveal with each guess    |

## Usage

The `MainClass` contains the main method to run the program. It prompts the user to pick a game, then instantiates the chosen game class and runs it.

Each game extends the abstract `GameSuperclass`, enforcing the implementation of `printGameIntro()` and `processInput()` methods. The games use `Scanner` to get user input each round until the game ends.

## What I Learned

- Implementing reusable parent/child class relationships in Java
- Basics of reading user input and processing it each round
- Separating core game logic from the main runner class
- Random number generation
- File I/O to load word list (Hangman)

This project was a good exercise in Java OOP concepts like inheritance, polymorphism, abstraction, and code organization. I got hands-on experience building simple playable games in Java.

## Credits

This project was created as part of the F27SA course in Year 1 Semester 1.
