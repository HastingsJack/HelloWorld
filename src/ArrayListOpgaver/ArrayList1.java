package ArrayListOpgaver;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers - a -1 input ends.");
        while(scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if(number == -1) {
                break;
            }
            input.add(number);
        }
        System.out.println("Which number would you like to search for?");
        int search = scanner.nextInt();
        boolean found = false;
        for(int i = 0; i < input.size(); i++) {
            if(input.get(i) == search) {
                found = true;
                System.out.println("Found at position " + i);
            }
        }
        if(!found) {
            System.out.println("No such number");
        }
    }
}
