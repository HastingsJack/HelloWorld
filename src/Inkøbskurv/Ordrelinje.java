package Inkøbskurv;

public class Ordrelinje {
    private Vare vare;
    private int amount;

    public Ordrelinje(Vare vare, int amount) {
        this.vare = vare;
        this.amount = amount;
    }

    public double returnPrice(Vare vare, int amount) {
        return vare.getPrice() * amount;
    }

    public double returnPrice() {
        return returnPrice(vare, amount);
    }

    public String returnVareName() {
        return vare.getName().toUpperCase();
    }

    public int returnAmount() {
        return this.amount;
    }

    public String toString() {
        return "You'd like to buy " + amount + " " + vare.getName() +
                " for " + vare.getPrice() + " kr.";
    }
}
