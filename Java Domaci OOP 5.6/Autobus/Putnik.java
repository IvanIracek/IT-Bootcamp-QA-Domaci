package Autobus;

public class Putnik extends Covek {
    private int novac;

    public Putnik(String ime, String prezime, int novac) {
        super(ime, prezime);
        this.novac = novac;
    }

    public void dodajNovac(int novacd) {
        if (novac > 0 && novac <= 1000) {
            this.novac += novacd;
            System.out.println("Uspesno ste dodali ".concat(Integer.toString(novacd)).concat(" dinara"));
        }
    }

    public void oduzmiNovac(int novaco) {
        if (novaco >= this.novac) {
            this.novac = 0;
            System.out.println("Svorc");
        } else {
            this.novac -= novaco;
        }
    }

    public void setNovac(int novac) {
        this.novac = novac;
    }

    public int getNovac() {
        return novac;
    }
}



