/*
*  Program makes rock paper scissor
*
* @author  Peter Gemmell
* @version 1.0
* @since 2022-9-16
*/

/*
* Runs the guess the number game
*/

import java.util.Scanner;
/**
* Class Guess.
*/

final class Guess {
    /**
    * Constant for magic number 1.
    */
    public static final int NUMBER_ONE = 1;

    /**
    * Constant for magic number 6.
    */
    public static final int NUMBER_SIX = 6;

    /**
    * Constant for magic number 0.
    */
    public static final int NUMBER_ZERO = 0;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Guess() {
        throw new IllegalStateException("Cannot be instantiated");
    }
    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {
        // Generating random number
        final int min = NUMBER_ONE;
        final int max = NUMBER_SIX;

        // From:
        // https://www.educative.io/edpresso
        // /how-to-generate-random-numbers-in-java

        final int randomNumber = (int) Math.floor(Math.random() * (
            max - min + 1) + min);
        // Input and scanner
        final Scanner myObj = new Scanner(System.in);
        int loopCounter = NUMBER_ZERO;
        while (true) {
            try {
                System.out.println("Guess a number from 1-6:");
                final int guess = myObj.nextInt();
                // Process
                loopCounter++;
                if (guess == randomNumber) {
                    System.out.println("You guessed correctly!");
                    System.out.println("It took " + loopCounter + " tries");
                    break;
                } else {
                    // Output
                    System.out.println("Guess was incorrect");
                    if (guess > randomNumber) {
                        System.out.println("That number is too high, "
                                        + "guess lower.");
                    } else if (guess < randomNumber) {
                        System.out.println("That number is too low, "
                                        + "guess higher.");
                    }
                }
            } catch (java.util.InputMismatchException error) {
                System.out.println("Invalid number");
                break;
            }
        }
    }
}
