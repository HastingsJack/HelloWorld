public class Værelse {
    public static void main(String[] args) {
        Lamp tablelamp = new Lamp(true);
        tablelamp.trykPåKontakt();
        System.out.println("tableLamp " + tablelamp);
        Lamp brokenLamp = new Lamp();
        brokenLamp.trykPåKontakt();
        brokenLamp.trykPåKontakt();
        System.out.println("brokenLamp " + brokenLamp);
        Lamp bedLamp = new Lamp(true);
        bedLamp.trykPåKontakt();
        bedLamp.trykPåKontakt();
        System.out.println("bedLamp " + bedLamp);
        System.out.println(Lamp.getNumberOfLamps());
    }
}
