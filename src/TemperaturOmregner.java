public class TemperaturOmregner {
    public static double fahrToCels(double fahr) {
        double cels = (fahr -32)*(5/9);
        return cels;
    }

    public static double celsToFahr(double cels) {
        double fahr = cels*(9/5) + 32;
        return fahr;
    }

    public static void main(String[] args) {
        System.out.println(fahrToCels(32));
        System.out.println(celsToFahr(0));
    }
}
