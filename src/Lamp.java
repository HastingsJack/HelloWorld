public class Lamp {
    private boolean off;
    private static int numberOfLamps;

    public Lamp() {
        numberOfLamps++;
    }

    public Lamp(boolean switchON) {
        if(switchON == true) {
            off = true;
        } else {
            off = false;
        }
        numberOfLamps++;
    }

    public void trykPåKontakt() {
        if(off == true) {
            off = false;
        } else {
            off = true;
        }
    }

    public static int getNumberOfLamps() {
        return numberOfLamps;
    }

    @Override
    public String toString() {
        if(off == true) {
            return "is On";
        }
        return "is Off";
    }
}
