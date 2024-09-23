public class ForLoops {
    public static void main(String[] args) {
        for(int i = 1; i < 5; i++) {
            System.out.println("2 gange " + i + " = " + 2 * i);
        }

        for(int i = 1; i <= 6; i++) {
            System.out.print(2 * i + " ");
        }
        System.out.println();

        for(int i = 0; i < 6; i++) {
            int sum = 4;
            System.out.print(sum + 15 * i + " ");
        }

        System.out.println();

        int sum = 30;
        for(int i = 0; i < 6; i++) {
            System.out.print(sum + " ");
            sum -= 10;
        }

        System.out.println();

        for(int i = -7; i <= 13; i+=4) {
            System.out.print(i + " ");
        }

        System.out.println();

        for(int i = 97; i >= 82; i -=3) {
            System.out.print(i + " ");
        }
    }
}
