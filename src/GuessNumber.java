import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int numberToGuess = rand.nextInt(10)+1;
        int usersGuess = -1;
        int count = 0;
        System.out.println("Welcome to the ultimate guessing game!");
        while(numberToGuess != usersGuess) {
            System.out.println("Please guess a number between 1 and 10");
            usersGuess = input.nextInt();
            if(usersGuess < numberToGuess) {
                System.out.println("Your guess is too low, try again");
            }
            if(usersGuess > numberToGuess) {
                System.out.println("Your guess is too high, try again");
            }
            count++;
        }
        System.out.println("Well done - you guessed the number " + numberToGuess + "!");
        System.out.println("It took you " + count + " tries to pick a number between 1 and 10");

    }
}
