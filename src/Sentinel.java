import java.util.Scanner;

public class Sentinel {
    public static final int SENTINEL = -1;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        while(true) {
            System.out.println("Please enter a number:");
            int number = input.nextInt();
            if(number == SENTINEL) {
                break;
            }
            sum += number;
        }

        System.out.println(sum);
    }
}
