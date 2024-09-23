import java.util.Scanner;

public class TeaTime {
    public static void announceTeaTime() {
        System.out.println("Waiting for tea time...");
        System.out.println("Type in a random word and press Enter");
        Scanner input = new Scanner(System.in);
        input.nextLine();
        System.out.println("It's tea time!");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to your new job");
        announceTeaTime();
        System.out.println("Write code");
        System.out.println("Review code");
        System.out.println("Learn stuff");
        announceTeaTime();
        System.out.println("Get promoted");
    }
}
