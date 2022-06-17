package Autobus;

public class Main {
    public static void main(String[] args) {
        Putnik p1 = new Putnik("milis", "nekikic", 500);
        Putnik p2 = new Putnik("nikola", "nekikic", 100);
        Putnik p3 = new Putnik("uros", "nekikic", 850);
        Putnik p4 = new Putnik("radan", "nekikic", 555);

        Vozac v1 = new Vozac("Pera", "Perovic");

        Autobus a1 = new Autobus("Trans", 50);

        a1.setV(v1);

        a1.dodajPutnika(p1);
        a1.dodajPutnika(p2);
        a1.dodajPutnika(p3);
        a1.dodajPutnika(p4);

        System.out.println(p1.getNovac());

    }
}
