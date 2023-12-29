import java.util.Random;
import java.util.Scanner;

class Game {
    private int randomNumber, guessNumber, noOfGuesses;

    public Game() {
        System.out.println("\nNow You are Playing - Guess the Number :");
        Random rand = new Random();
        randomNumber = rand.nextInt(100) + 1;
    }

    public void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\tEnter your Guess :  ");
        guessNumber = sc.nextInt();
    }

    public boolean isCorrectNumber() {
        if (randomNumber == guessNumber) {
            return true;
        } else if (randomNumber < guessNumber) {
            System.out.println("  Greater :(");
        } else if (randomNumber > guessNumber) {
            System.out.println("  Smaller :(");
        }
        System.out.println("\tTry Again...");
        return false;
    }

    public void setNoOfGuesses(int n) {
        noOfGuesses = n;
    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }
}

public class exercise_03 {
    public static void main(String[] args) {
        Game gm = new Game();
        int guess = 1;
        do {
            gm.setNoOfGuesses(guess);
            System.out.println("\nAttempt - " + gm.getNoOfGuesses());
            gm.takeUserInput();
            guess++;
        } while (!gm.isCorrectNumber());
        System.out.println("\nCongratulations!!! Number Matched :)");
        System.out.println("\tYour Score is :  " + (100 - gm.getNoOfGuesses() + 1));
    }
}
