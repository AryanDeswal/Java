import java.util.Random;
import java.util.Scanner;

public class Game {
    private int randomNumber;
    private int userGuess;

    public Game() {
        Random rand = new Random();
        this.randomNumber = rand.nextInt(100) + 1; // Assuming the random number is between 1 and 100
    }

    public void takeUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        this.userGuess = scanner.nextInt();
        scanner.close();
    }

    public boolean isCorrectNumber() {
        return this.userGuess == this.randomNumber;
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.takeUserInput();
        if (game.isCorrectNumber()) {
            System.out.println("Congratulations! You guessed the correct number.");
        } else {
            System.out.println("Try again!");
        }
    }
}
