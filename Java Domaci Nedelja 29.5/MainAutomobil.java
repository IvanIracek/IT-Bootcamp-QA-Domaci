package Prvi;

public class MainAutomobil {
    public static void main(String[] args) {
        Automobil prvi = new Automobil("Fiat", "Punto", "Ivan");

        System.out.println(prvi.getMarka());
        System.out.println(prvi.getModel());
        System.out.println(prvi.getSerijskiBroj());
        System.out.println(prvi.getVlasnik());
        prvi.setVlasnik("Anastasija");
        System.out.println(prvi.getVlasnik());

        System.out.println("-----------------------------------------");

        Automobil drugi = new Automobil("Porsche", "911");
        System.out.println(drugi.getVlasnik());
        System.out.println(drugi.getSerijskiBroj());

        System.out.println("-----------------------------------------");

        Automobil treci = new Automobil();
        System.out.println(treci.getModel());
        System.out.println(treci.getMarka());
        System.out.println(treci.getSerijskiBroj());

        System.out.println("----------------------------");

        System.out.println(drugi.getBrojac());

    }

}
