import java.util.Scanner;

public class HighLow {

    public static void GuessingGame() {

        int random = (int)(Math.random() * 100 + 1);

        System.out.println("Guess a number between 1 and 100.");

        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();

        int count = 1;

        while (true) {

            if (count > 10) {

                System.out.println("I know that you'll be baaacck!");

                break;

            }


            if (userInput < 1 || userInput > 100) {

                System.out.println("Please enter a number between 1 and 100.");

            } else if (userInput > random) {

                System.out.println("Choose a lower number");

            } else if (userInput < random) {

                System.out.println("Choose a higher number");
            }


            userInput = scanner.nextInt();

            count++;

            if (userInput == random) {

                System.out.println("Correct!!");

                System.out.printf("So far, you've guessed %d times!\n", count);

                break;
            }
        }
    }


    public static void main(String[] args) {

        GuessingGame();
    }
}