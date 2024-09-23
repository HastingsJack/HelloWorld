import java.util.Scanner;

public class Pizzamenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a pizza from the menu");
        Pizzamenu2.values();
        int number = 1;
        for(Pizzamenu2 menu : Pizzamenu2.values()) {
            System.out.println(number + ":" + menu);
            number++;
        }
        int user = input.nextInt();
        String result = "";
        result = switch (user) {
            case 1 -> "You have chosen Margherita";
            case 2 -> "You have chosen Vesuvio";
            case 3 -> "You have chosen Hawaii";
            case 4 -> "You have chosen Pepperoni";
            default -> "You have not chosen a pizza from the menu.";
        };
        System.out.println(result);
    }
}
