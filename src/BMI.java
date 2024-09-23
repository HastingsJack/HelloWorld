import java.util.Locale;
import java.util.Scanner;

public class BMI {
    public static final double M = 0.01;
    public static void main(String[] args) {
        System.out.println("Welcome to the World's Best BMI Calculator!");
        System.out.println();
        //receiving error with commas and periods so set to US 'standards'
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("What is your height in meters(m)?");
        double height = input.nextDouble();

        System.out.println("What is your weight in kilograms(kg)?");
        double weight = input.nextDouble();

        double calc = weight / ((height) * (height));
        //round to two decimal places to make it look prettier
        double roundedCalc = Math.round(calc*100.0)/100.0;

        if(roundedCalc > 30) {
            System.out.println("Your BMI is: " + roundedCalc + " which is obese.");
        } else if (roundedCalc >= 25) {
            System.out.println("Your BMI is: " + roundedCalc + " which is overweight.");
        } else if (roundedCalc >= 18.5) {
            System.out.println("Your BMI is: " + roundedCalc + " which is a normal weight.");
        } else {
            System.out.println("Your BMI is: " + roundedCalc + " which is underweight.");
        }
    }
}
