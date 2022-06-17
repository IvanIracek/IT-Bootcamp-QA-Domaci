package Autobus;

public abstract class Covek {
    private String ime;
    private String prezime;

    public Covek() {
        this.ime = "Default ime";
        this.prezime = "Default prezime";
    }

    public Covek(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }
}
