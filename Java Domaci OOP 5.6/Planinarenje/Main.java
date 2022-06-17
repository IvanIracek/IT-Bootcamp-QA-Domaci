package Planinarenje;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Planina p1 = new Planina("Ozren", "Srbija", 1178);

        Planinar rp1 = new RekreatinviPlaninar("Milos", "Milosevic", 30, "Beograd", 1000);
        Planinar rp2 = new RekreatinviPlaninar("Uros", "Jovanovic", 30, "Kraljevo", 1500);
        Planinar rp3 = new RekreatinviPlaninar("Lonac", "Loncic", 30, "Loncarica", 2000);

        Planinar a1 = new Alpinista("Ivan", "Ivanovic", 2);
        Planinar a2 = new Alpinista("Dragan", "Draganovic", 3);
        Planinar a3 = new Alpinista("Zoran", "Kukic", 4);

        ArrayList<Planinar> lista = new ArrayList<>();
        lista.add(rp1);
        lista.add(rp2);
        lista.add(rp3);
        lista.add(a1);
        lista.add(a2);
        lista.add(a3);

        int sum = 0;

        for(Planinar p : lista){
            System.out.println(p.stampaj());
            System.out.println("Uspesnost: " + p.usoesnost(p1));
            System.out.println("-------------------------------");
            sum += p.clanarina();
        }
        System.out.println("Zbir clanarina iz niza: " + sum);
    }
}
