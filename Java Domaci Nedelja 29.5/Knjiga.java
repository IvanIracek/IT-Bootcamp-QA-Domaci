package Dodatni;

public class Knjiga {
    private String naziv;
    private Covek autor;
    private Covek vlasnik;
    private int brojStrana;
    private int godinaIzdanjja;

    public Knjiga(String naziv, Covek autor, int brojStrana, int godinaIzdanjja) {
        this(naziv, autor, null, brojStrana, godinaIzdanjja);
    }

    public Knjiga(String naziv,Covek autor , Covek vlasnik, int brojStrana, int godinaIzdanjja) {
        this.naziv = naziv;
        this.autor = autor;
        this.vlasnik = vlasnik;
        this.brojStrana = brojStrana;
        this.godinaIzdanjja = godinaIzdanjja;
        if(!provera()){
            System.out.println("pogresno");
            this.godinaIzdanjja = 0;
            this.brojStrana = 0;
        }
    }

    public boolean provera() {
        if (brojStrana > 0 && godinaIzdanjja > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public void setGodinaIzdanjja(int godinaIzdanjja) {
        if(godinaIzdanjja > 0){
            this.godinaIzdanjja = godinaIzdanjja;
        }
        else{
            System.out.println("Pogresno");
        }
    }

    public void setBrojStrana(int brojStrana) {
        if (brojStrana > 0) {
            this.brojStrana = brojStrana;
        }
        else {
            System.out.println("Pogresno");
        }
    }

    public String getNaziv() {
        return naziv;
    }

    public String getAutor() {
        return autor.getIme();
    }

    public String getVlasnik() {
        return vlasnik.getIme();
    }

    public int getBrojStrana() {
        return brojStrana;
    }

    public int getGodinaIzdanjja() {
        return godinaIzdanjja;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setAutor(Covek autor) {
        this.autor = autor;
    }

    public void setVlasnik(Covek vlasnik) {
        this.vlasnik = vlasnik;
    }

    @Override
    public String toString() {
        if(vlasnik == null){
            return "Naziv knjige je: ".concat(getNaziv()).concat("\n").concat("Autor knjige je ").concat(getAutor()).concat("\n").concat("Vlasnik je null");
        }
        return "Naziv knjige je: ".concat(getNaziv()).concat("\n").concat("Autor knjige je ").concat(getAutor()).concat("\n").concat("Vlasnik je ").concat(vlasnik.getIme());
    }
    public String velicinaKnjige(){
        String s = "";
            if(getBrojStrana() > 0) s = "Mala knjiga";
            if(getBrojStrana() > 100) s = "Srednja knjiga";
            if(getBrojStrana() > 300) s = "Velika knjiga";
            if(getBrojStrana() > 600) s = "Velika knjiga++";
            return s;
    }
}