package Nasledjivanje;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SastojakRecepta s1 = new SastojakRecepta("Spagete", 500, 100);
        SastojakRecepta s2 = new SastojakRecepta("Pavlaka", 250, 100);
        SastojakRecepta s3 = new SastojakRecepta("Beli luk", 175, 100);
        SastojakRecepta s4 = new SastojakRecepta("Curece meso", 85, 100);
        SastojakRecepta s5 = new SastojakRecepta("Maslac", 42, 100);
        SastojakRecepta s6 = new SastojakRecepta("Jaja", 21, 100);
        SastojakRecepta s7 = new SastojakRecepta("So", 10, 100);
        SastojakRecepta s8 = new SastojakRecepta("Biber", 5, 100);

        ArrayList<SastojakRecepta> lista = new ArrayList<>();

        lista.add(s1);
        lista.add(s2);
        lista.add(s3);
        lista.add(s4);
        lista.add(s5);
        lista.add(s6);
        lista.add(s7);
        lista.add(s8);

        ArrayList<SastojakRecepta> lista1 = new ArrayList<>();

        lista1.add(s1);
        lista1.add(s2);
        lista1.add(s3);
        lista1.add(s4);

        Recept br2 = new Recept("Spagete u nekom drugom sosu", 4, lista1);
        Recept br1 = new Recept("Spagete u belom sosu", 3, lista);
        Recept br4 = new Recept("Krompir salata", 3, lista);
        Recept br5 = new Recept("Pileca salata", 5, lista1);
        Recept br6 = new Recept("Govedja salata", 4, lista1);

        /*System.out.println(br1);
        System.out.println("-----------------");
        System.out.println(br1.ukupnaCenac());
        System.out.println("----------------");*/

        /*Nasledjivanje.Recept br3 = Nasledjivanje.Recept.skaliraj(br1, 50);
        System.out.println(br2.ukupnaCenac());*/

       /* System.out.println(br2*/;

        ArrayList<Recept> li = new ArrayList<>();
        li.add(br2);
        li.add(br1);
        li.add(br4);
        li.add(br5);
        li.add(br6);

        int[] tezina = {3};


        for(Recept r : Recept.filtirajRecepte(li, tezina)){
            System.out.println(r.getNaziv());
        }
    }
}
