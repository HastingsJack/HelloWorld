public class Calculator {
    public static void main(String[] args) {
        System.out.println(toAdd(5, 6));
    }

    public static int toAdd(int number1, int number2) {
        return number1 + number2;
    }

    public double toAdd(double number1, double number2) {
        return number1 + number2;
    }

    public int toAdd(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    public int toAdd(String number1, String number2) {
        return Integer.valueOf(number1) + Integer.valueOf(number2);
    }
}
