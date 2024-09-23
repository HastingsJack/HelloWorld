public class Firkant {
    double side;
    double height;

    public Firkant(double side, double height) {
        this.side = side;
        this.height = height;
    }

    public double beregnAreal() {
        return this.side * this.height;
    }

    public String hilkenSlagsFirkant() {
        if(side == height) {
            return "Det er kvadrat";
        }
        return "Det er en rektangel";
    }
}
