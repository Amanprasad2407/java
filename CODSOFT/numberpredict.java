import java.util.Random;
import java.util.Scanner;

public class numberpredict {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // Number between 1 and 100
        int numberOfTries = 0;
        boolean BuddyhasGuessedCorrectly = false;
        
        System.out.println(" HEY BUDDY! Guess a number between 1 and 100:");
        
        while (!BuddyhasGuessedCorrectly) {
            int userGuess = scanner.nextInt();
            numberOfTries++;
            
            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Invalid guess. Try a number between 1 and 100.");
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low, try again:");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high, try again:");
            } else {
                BuddyhasGuessedCorrectly = true;
                System.out.println("Correct! You've guessed the right number in " + numberOfTries + " tries.");
            }
        }
        
        scanner.close();
    }
}