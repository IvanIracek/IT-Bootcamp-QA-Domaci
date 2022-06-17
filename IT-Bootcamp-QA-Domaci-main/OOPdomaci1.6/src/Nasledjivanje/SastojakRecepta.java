package Nasledjivanje;

public class SastojakRecepta extends Sastojak {
    private double kolicinaPotrebna;

    public SastojakRecepta(){
        this("", 0, 0);
    }
    public SastojakRecepta(String naziv, double cena){

        super(naziv, cena);
    }
    public SastojakRecepta(String naziv, double cena, double kolicinaPotrebna) {
        super(naziv, cena);
        this.kolicinaPotrebna = kolicinaPotrebna;
    }
    public double ukupnaCena(){
        return getCena() * kolicinaPotrebna;
    }
}
