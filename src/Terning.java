import java.util.Random;

public class Terning {
    private int max = 6;
    private int faceValue;
    private Random random;

    public Terning() {
        this.random = new Random();
    }

    public int roll() {
        return faceValue = random.nextInt(max)+1;
    }


}
