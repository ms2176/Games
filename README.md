# Java Games Lounge

This is a collection of simple games written in Java as a course project.

## Games

The project contains the following games:

- Dice Roller - Rolls a chosen number of dice
- Higher or Lower - Guess a random number between 0-100
- Hangman - Classic hangman game

## Usage

The MainClass contains the main method to run the program. It will prompt the user to choose one of the games, then instantiate the chosen game class and run it.

Each game extends the abstract GameSuperclass, which enforces implementing a printGameIntro() and processInput() method. 

The games use Scanner to get user input and process it each round until the game ends.

## What I Learned

- Implementing reusable parent/child class relationships in Java
- Basics of reading user input and processing it each round
- Separating core game logic from the main runner class
- Random number generation
- File I/O to load word list (Hangman)

This project was a good exercise in Java OOP concepts and building simple playable games. I expanded my skills in inheritance, polymorphism, abstraction, and code organization.