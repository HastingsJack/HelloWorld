public class DigitalClockDemo {
    public static void main(String[] args) {
        ClockDisplay clock = new ClockDisplay();
        clock.timeTick();
        System.out.println(clock.getDisplayString());

    }
}
