import java.util.Random;
import java.util.Scanner;

public class StenSaksPapir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userBestOfThree = 0;
        int computerBestOfThree = 0;

        System.out.println("Welcome to -- Rock, Paper, or Scissors!");
        System.out.println("Best two out of three -- Good luck!");

        while (!(userBestOfThree == 2) && !(computerBestOfThree == 2)) {
            System.out.println();
            System.out.println("Rock, Paper, or Scissors?");
            String choice = input.nextLine();
            String computerChoice = computerChoice();
            if (computerChoice.equalsIgnoreCase(choice)) {
                System.out.println("Both picked " + computerChoice.toUpperCase()  + " so it was a tie!");
            } else {
                if (compare(choice, computerChoice)) {
                    System.out.println("Computer is the winner with " + computerChoice.toUpperCase() + "!" );
                    computerBestOfThree++;
                } else {
                    System.out.println("You've won with " + choice.toUpperCase() + "!");
                    userBestOfThree++;
                }
                System.out.println("Computer wins: " + computerBestOfThree);
                System.out.println("User wins: " + userBestOfThree);
            }
        }
        if(userBestOfThree == 2){
            System.out.println("Congratulations, you win!");
        } else {
            System.out.println("You lost!");
        }
    }

    public static String computerChoice() {
        Random rand = new Random();
        int choice = rand.nextInt(3) + 1;
        String result = "";
        if (choice == 1) {
            result = "Rock";
        }
        if (choice == 2) {
            result = "Paper";
        }
        if (choice == 3) {
            result = "Scissors";
        }
        return result;
    }

    public static boolean compare(String user, String computer) {
        boolean winnerComputer = false;
        if (computer.equals("Rock")) {
            if (user.equalsIgnoreCase("Scissors")) {
                winnerComputer = true;
            }
            if (user.equalsIgnoreCase("Paper")) {
                winnerComputer = false;
            }
        }
        if (computer.equals("Scissors")) {
            if (user.equalsIgnoreCase("Paper")) {
                winnerComputer = true;
            }
            if (user.equalsIgnoreCase("Rock")) {
                winnerComputer = false;
            }
        }
        if (computer.equals("Paper")) {
            if (user.equalsIgnoreCase("Scissors")) {
                winnerComputer = false;
            }
            if (user.equalsIgnoreCase("Rock")) {
                winnerComputer = true;
            }
        }
        return winnerComputer;
    }
}