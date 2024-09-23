import java.util.Scanner;

public class SchoolDayOrWeekend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 1;
        Weekday.values();
        for(Weekday day : Weekday.values()) {
            System.out.println(number + ": " + day);
            number++;
        }
        System.out.println("Choose a weekday:");
        int userChoice = input.nextInt();
        while(userChoice <= 0 || userChoice > 7)  {
            System.out.println("You may only write a number between 1 and 7, try again.");
            userChoice = input.nextInt();
        }
        Weekday weekday = null;
        weekday = switch(userChoice) {
            case 1 -> weekday.MONDAY;
            case 2 -> weekday.TUESDAY;
            case 3 -> weekday.WEDNESDAY;
            case 4 -> weekday.THURSDAY;
            case 5 -> weekday.FRIDAY;
            case 6 -> weekday.SATURDAY;
            case 7 -> weekday.SUNDAY;
            default -> throw new IllegalStateException("Unexpected value: " + userChoice);
        };
        /*switch(weekday) {
            case MONDAY -> System.out.println("It's a weekday!");
            case TUESDAY -> System.out.println("It's a weekday!");
            case WEDNESDAY -> System.out.println("It's a weekday!");
            case THURSDAY -> System.out.println("It's a weekday!");
            case FRIDAY -> System.out.println("It's a weekday!");
            case SATURDAY -> System.out.println("It's the weekend!");
            case SUNDAY -> System.out.println("It's the weekend!");
        }*/
        if(!(weekday == Weekday.SATURDAY || weekday == Weekday.SUNDAY)) {
            System.out.println("You have to go to school");
        }
        if(weekday == Weekday.MONDAY) {
            System.out.println("It's monday again...");
        } else if(weekday == Weekday.FRIDAY) {
            System.out.println("It'll be the weekend when you are done.");
        } else if(weekday == Weekday.SATURDAY || weekday == Weekday.SUNDAY) {
            System.out.println("Just keep sleepin, just keep sleepin");
        }


        Months.values();
        int monthNumber = 1;
        for(Months month : Months.values()) {
            System.out.println(month);
            monthNumber++;
        }
        System.out.println("Choose a Month");
        int userChoice2 = input.nextInt();
        while(userChoice2 <= 0 || userChoice2 > Months.values().length)  {
            System.out.println("You may only write a number between 1 and 12.");
            userChoice2 = input.nextInt();
        }
        Months month = null;
        month = switch(userChoice2) {
            case 1 -> Months.JANUARY;
            case 2 -> Months.FEBRUARY;
            case 3 -> Months.MARCH;
            case 4 -> Months.APRIL;
            case 5 -> Months.MAY;
            case 6 -> Months.JUNE;
            case 7 -> Months.JULY;
            case 8 -> Months.AUGUST;
            case 9 -> Months.SEPTEMBER;
            case 10 -> Months.OCTOBER;
            case 11 -> Months.NOVEMBER;
            case 12 -> Months.DECEMBER;
            default -> throw new IllegalStateException("Unexpected value: " + userChoice2);
        };

        if(month == Months.JANUARY || month == Months.FEBRUARY || month == Months.DECEMBER) {
            System.out.println("It's winter!");
        } else if (month == Months.MARCH || month == Months.APRIL || month == Months.MAY) {
            System.out.println("It's spring!");
        } else if (month == Months.JULY || month == Months.AUGUST || month == Months.JUNE) {
            System.out.println("It's summer!");
        } else {
            System.out.println("It's fall!");
        }

    }
}
