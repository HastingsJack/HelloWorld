package Inkøbskurv;

public class Main {
    public static void main(String[] args) {
        Vare potatoes = new Vare("potatoes", 2.56);
        Vare apples = new Vare("apples", 3.00);
        Ordrelinje orderApples = new Ordrelinje(apples, 3);
        Ordrelinje orderPotatoes = new Ordrelinje(potatoes, 4);
        Inkøbskurv kurv = new Inkøbskurv();
        kurv.addToKurv(orderApples);
        kurv.addToKurv(orderPotatoes);
        System.out.println(apples);
        System.out.println(orderApples);
        System.out.println(kurv.totalPrice());
        System.out.println(kurv);
    }
}
