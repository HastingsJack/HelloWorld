public class Main {
    public static void main(String[] args) {
        Konto k = new Konto(100, "jack", 123.4);
        k.withdrawal(23.4);
        k.setName("Bob");
        k.setBalance(1000.4);
        k.deposit(50.0);
        System.out.println(k.withdrawal(1060));

        System.out.println(k);
    }
}
