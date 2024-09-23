import javax.swing.*;
import java.util.Random;

public class Terningkast {
    public static void main(String[] args) {
        Random rand = new Random();
        int firstDice = 0;
        int secondDice = 0;
        int sum = 0;
        int count = 0;

        while(firstDice + secondDice != 7) {
            firstDice= rand.nextInt(6) + 1;
            secondDice = rand.nextInt(6) + 1;
            sum += firstDice + secondDice;
            System.out.println(firstDice + " + " + secondDice + " = " + sum);
            sum = 0;
            count++;
        }
        System.out.println(count);
    }
}
