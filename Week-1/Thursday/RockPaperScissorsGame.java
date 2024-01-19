import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Rock, Paper, Scissors Game!");
        System.out.println("Enter your choice: Rock, Paper, or Scissors");

        String userChoice = sc.nextLine();
        userChoice = userChoice.toLowerCase();

        String[] choices = {"rock", "paper", "scissors"};
        int randomIndex = random.nextInt(choices.length);
        String computerChoice = choices[randomIndex];

        System.out.println("Computer chose: " + computerChoice);

        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                   (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        sc.close();
    }
}
