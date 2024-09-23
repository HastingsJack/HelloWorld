public class Hilsen {
    public void hej(String name) {
        System.out.println("Hej " + name);
    }

    /*public static String hej(String name) {
        return "Hej " + name;
    }*/

    public static void main(String[] args) {
        //hej("Signe");
        //hej("Bo");
        //hej("Anne");
        //String hello = hej("Bo");
        System.out.println();

        Hilsen hej = new Hilsen();
        //String hilsen = hej.hej("Bo");
        hej.hej("Bo");
    }
}
