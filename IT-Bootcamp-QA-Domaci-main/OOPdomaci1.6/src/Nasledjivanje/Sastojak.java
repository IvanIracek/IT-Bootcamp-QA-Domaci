package Nasledjivanje;

public class Sastojak {
    private String naziv;
    private double cena;

    public Sastojak (String naziv, double cena){
        this.naziv = naziv;
        this.cena = cena;
    }

    public double getCena() {
        return cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}
