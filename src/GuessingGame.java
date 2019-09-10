import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        Random rand = new Random();
        int answer = rand.nextInt(9) + 1;
        int input;
        boolean continueGame = true;

        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        while (continueGame) {
            input = key.nextInt();
            if (input == answer) {
                System.out.println("That's right! You're a good guesser.");
                continueGame = false;
            }
            else {
                System.out.println("That is incorrect. Guess again.");
            }
        }
    }
}
