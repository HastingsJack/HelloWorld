public class NumberDisplay {
    private int limit;
    private int value;

    public NumberDisplay(int rollOverLimt) {
        this.limit = rollOverLimt;
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public String getDisplayValue() {
        if(value < 10) {
            return "0" + value;
        }
        return "" + value;
    }

    public void setValue(int replacementValue) {
        if(replacementValue < limit && replacementValue >= 0) {
            value = replacementValue;
        }
    }

    public void increaseValue() {
        value = (value + 1) % limit;
    }
}
