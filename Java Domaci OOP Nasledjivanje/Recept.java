package Nasledjivanje;

import java.util.ArrayList;

public class Recept {
    private String naziv;
    private int tezina;
    private ArrayList<SastojakRecepta> sastojci;

    public Recept (){
        this("", 0, new ArrayList<>());
    }

    public Recept(String naziv, int tezina, ArrayList<SastojakRecepta> sastojci) {
        this.naziv = naziv;
        this.tezina = tezina;
        this.sastojci = sastojci;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getTezina() {
        return tezina;
    }

    public void setTezina(int tezina) {
        this.tezina = tezina;
    }


    public ArrayList<SastojakRecepta> getSastojci() {
        return sastojci;
    }

    public void setSastojci(ArrayList<SastojakRecepta> sastojci) {
        this.sastojci = sastojci;
    }
    public void dodajSastojak (SastojakRecepta s){
        sastojci.add(s);
    }
    private boolean provera (Sastojak s1, Sastojak s2){
        if(s1.getNaziv().equals(s2.getNaziv())){
            return true;
        }
        return false;
    }
    public void brisanje (Sastojak s){
        for (int i = 0; i < sastojci.size(); i++) {
            Sastojak trenutni = sastojci.get(i);
            if(trenutni.getNaziv().equals(s.getNaziv())){
                sastojci.remove(i);
                return;
            }
        }
    }
    private String arrayToString() {
        String s = "";
        for (int i = 0; i < sastojci.size(); i++) {
            if (i == sastojci.size() - 1) {
                s += sastojci.get((i)).getNaziv();
                return s;
            }
            s += sastojci.get(i).getNaziv() + ", ";
        }
        return s;
    }
    public double ukupnaCenac(){
        double cena = 0;
        for(SastojakRecepta s : sastojci){
            cena += s.ukupnaCena();
        }
        return cena;
    }
    public static Recept skaliraj (Recept r ,double x){
        double y =100 / x;
        Recept q = new Recept(r.getNaziv(),r.getTezina(),r.getSastojci());
        for (SastojakRecepta s : q.getSastojci()){
            s.setCena(s.getCena() / y);
        }
        return q;
    }
    public static ArrayList<Recept> filtirajRecepte(ArrayList<Recept> recepti, int tezina){
        ArrayList<Recept> l = new ArrayList<>();
        for(Recept r : recepti){
            if(r.getTezina() == tezina){
                l.add(r);
            }
        }
        return l;
    }
    public static ArrayList<Recept> filtirajRecepte(ArrayList<Recept>recepti, int[] tezina){
        ArrayList<Recept> novi = new ArrayList<>();
        for (int i = 0; i < tezina.length; i++) {
            for (int j = 0; j < recepti.size(); j++) {
                if(tezina[i] == recepti.get(j).getTezina()){
                    novi.add(recepti.get(j));
                }
            }
        }
        return novi;
    }

    @Override
    public String toString() {
        return naziv.concat("\n").concat("Tezina: ").concat(Integer.toString(tezina)).concat("\n").concat("Sastojci: ").concat(arrayToString());
    }
}