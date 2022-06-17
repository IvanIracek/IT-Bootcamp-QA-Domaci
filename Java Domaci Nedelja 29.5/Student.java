package Drugi;

import java.util.List;

public class Student {
    private String ime;
    private String prezime;
    private static int brojac = 0;
    private int index = brojac;
    private String smer;
    private List<Double> rez;

    public Student (String ime, String prezime, String smer, List<Double> rez){
        this.ime = ime;
        this.prezime = prezime;
        this.smer = smer;
        this.rez = rez;
        brojac++;
    }
    public void prolaznost (){
        int zbir = 0;
        for (int i = 0; i < rez.size(); i++) {
            zbir += rez.indexOf(i);
        }
        double srednja = zbir / rez.size();
        if(srednja >= 51.0){
            System.out.println("Polozio");
        }
        else{
            System.out.println("Pao");
        }
    }
}
