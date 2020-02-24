package repetitions;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    Random random = new Random();
    int lowDifficultyNumber = random.nextInt(10) + 1;
    int mediumDifficultyNumber = random.nextInt(100) + 1;
    int hardDifficultyNumber = random.nextInt(1000) + 1;
    int guessesItTook;

    public void playGame() {
        // this method checks user input and calls appropriate method
        int decision = decision();

        if (decision == 1) {
            lowDifficulty();
        } else if (decision == 2) {
            mediumDifficulty();
        } else if (decision == 3) {
            hardDifficulty();
        } else {
            System.out.println("You can only choose from these options.");
            playGame();
        }
    }

    public void validateResponse() {
        // this method validates the response given by the user.
        // if the response is valid, it acts accordingly. If not, it asks for input again.
        String playAgain = askForAnotherRound();
        if (playAgain.equalsIgnoreCase("Y")
                || playAgain.equalsIgnoreCase("Yes")) {
            guessesItTook = 0;
            playGame();
        } else if ((playAgain.equalsIgnoreCase("N")
                || playAgain.equalsIgnoreCase("No"))) {
            System.out.println("Goodbye.");
        } else {
            System.out.println("Wrong input. Choose yes/y or no/n!");
            validateResponse();
        }
    }

    public void lowDifficulty() {
        // this method plays the game on low difficulty (1 to 10)
        int userInput = userInput();
        if (userInput > lowDifficultyNumber) {
            System.out.println("Too high. Guess again: ");
            guessesItTook++;
            lowDifficulty();
        } else if (userInput < lowDifficultyNumber) {
            System.out.println("Too low. Guess again: ");
            guessesItTook++;
            lowDifficulty();
        }
        if (userInput == lowDifficultyNumber) {
            System.out.println("You got it in " + guessesItTook + " guesses.");
            validateResponse();
        }
    }

    public void mediumDifficulty() {
        // this method plays the game on medium difficulty (1 to 100)
        int userInput = userInput();
        if (userInput > mediumDifficultyNumber) {
            System.out.println("Too high. Guess again: ");
            guessesItTook++;
            mediumDifficulty();
        } else if (userInput < mediumDifficultyNumber) {
            System.out.println("Too low. Guess again: ");
            guessesItTook++;
            mediumDifficulty();
        }
        if (userInput == mediumDifficultyNumber) {
            System.out.println("You got it in " + guessesItTook + " guesses.");
            validateResponse();
        }
    }

    public void hardDifficulty() {
        // this method plays the game on hard difficulty (1 to 1000)
        int userInput = userInput();
        if (userInput > hardDifficultyNumber) {
            System.out.println("Too high. Guess again: ");
            guessesItTook++;
            hardDifficulty();
        } else if (userInput < hardDifficultyNumber) {
            System.out.println("Too low. Guess again: ");
            guessesItTook++;
            hardDifficulty();
        }
        if (userInput == hardDifficultyNumber) {
            System.out.println("You got it in " + guessesItTook + " guesses.");
            validateResponse();
        }
    }

    public String askForAnotherRound() {
        System.out.println("Play again?");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public int decision() {
        // this asks the user for input on the difficulty level
        System.out.println("Pick a difficulty level (1, 2, or 3):");
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You can only pick a number.");
            return decision();
        }
    }

    public int userInput() {
        System.out.println("Try to guess the number.");
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You can only guess numbers.");
            return decision();
        }
    }

    public static void main(String[] args) {
        GuessTheNumberGame guessTheNumberGame = new GuessTheNumberGame();
        System.out.println("Let's play Guess the Number!");
        guessTheNumberGame.playGame();
    }
}
