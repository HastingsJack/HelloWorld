import java.sql.SQLOutput;
import java.util.Scanner;

public class Forberedelse {
    public static void main(String[] args) {
        System.out.println("Enter the number of items you would like to scan:");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        double total = 0;

        for(int i = 0; i < quantity; i++) {
            System.out.println("Enter the cost of the item");
            double price = scanner.nextDouble();
            total += price;
        }

        System.out.println("Your total is $" + total);
    }
}
