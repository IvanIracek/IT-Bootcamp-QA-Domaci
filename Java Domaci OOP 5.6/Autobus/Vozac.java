package Autobus;

public class Vozac extends Covek{
    private String zvanje;

    public Vozac() {
        this.zvanje = zvanje;
    }

    public Vozac(String ime, String prezime) {
        super(ime, prezime);
        this.zvanje = "Sofer";
    }
    public String getZvanje() {
        return zvanje;
    }

}
