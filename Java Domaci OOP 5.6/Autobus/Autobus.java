package Autobus;

import java.util.ArrayList;

public class Autobus {
    private String ime;
    private Vozac v;
    private int cenaKarte;
    private ArrayList<Putnik> lp;

    public Autobus(String ime, int cenaKarte) {
        this.ime = ime;
        this.v = new Vozac();
        this.cenaKarte = cenaKarte;
        this.lp = new ArrayList<>();
    }
    public void dodajPutnika(Putnik p){
        if(v.getIme().equals("Default ime")){
            lp.add(p);
        }
        else {
            lp.add(p);
            p.setNovac(p.getNovac() - this.cenaKarte);
        }
    }
    public void ukloniPutnika(Putnik p){
        for(Putnik q : lp){
            if(q.getIme().equals(p.getIme()) && q.getPrezime().equals(p.getPrezime())){
                lp.remove(q);
            }
        }
    }

    public void setV(Vozac v) {
        this.v = v;
    }
    public void ukloniVozaca(){
        this.v = new Vozac("Default ime", "Default prezime");
    }

    public String getIme() {
        return ime;
    }

    public Vozac getV() {
        return v;
    }

    public int getCenaKarte() {
        return cenaKarte;
    }

    public ArrayList<Putnik> getLp() {
        return lp;
    }
}