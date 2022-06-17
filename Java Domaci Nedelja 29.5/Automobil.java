package Prvi;

public class Automobil {
    private String marka;
    private String model;
    public static int brojac = 0;
    private int serijskiBroj = brojac; // da li mogu da povecam bez statica
    private String vlasnik;

    public Automobil(){
        this(null,null);
    }

    public Automobil(String marka, String model){
        this(marka, model, null);
    }

    public Automobil(String marka, String model, String vlasnik){
        this.marka = marka;
        this.model = model;
        brojac++;
        this.serijskiBroj = brojac;
        this.vlasnik = vlasnik;
    }

    public int getBrojac() {
        return brojac;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getSerijskiBroj() {
        return serijskiBroj;
    }

    public String getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(String vlasnik) {
        this.vlasnik = vlasnik;
    }
}
