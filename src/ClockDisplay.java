public class ClockDisplay {
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;

    public ClockDisplay() {
        this.hours = new NumberDisplay(24);
        this.minutes = new NumberDisplay(60);
        updateDisplay();
    }

    public void timeTick() {
        minutes.increaseValue();
        if (minutes.getValue() == 0) {
            hours.increaseValue();
        }
        updateDisplay();
    }

    public String getDisplayString() {
        return displayString;
    }

    private void updateDisplay() {
        displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }


}
