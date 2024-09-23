public class Terningspil {
    public static void main(String[] args) {
        Terning terning1 = new Terning();
        Terning terning2 = new Terning();
        while(true) {
            int total = terning1.roll() + terning2.roll();
            if(total == 2) {
                System.out.println("Snake Eyes!");
                System.out.println("Good game");
                break;
            }
            System.out.println(total);
        }
    }
}
