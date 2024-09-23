package Inkøbskurv;

import java.util.ArrayList;

public class Inkøbskurv {
    private ArrayList<Ordrelinje> order;

    public Inkøbskurv() {
        order = new ArrayList<>();
    }

    public void addToKurv(Ordrelinje item) {
        order.add(item);
    }

    public double totalPrice() {
        double total = 0.0;
        for (Ordrelinje item : order) {
            total += item.returnPrice();
        }
        return total;
    }

    public String toString() {
        String list = "Your basket: \n";
        for(int i = 0; i < order.size(); i++) {
            list += order.get(i).returnVareName() + " x " +
                    order.get(i).returnAmount() + " at " +
                    order.get(i).returnPrice() + "kr.\n";
        }
        list+= "Total price: " + totalPrice() + "kr.";
        return list;
    }
}
