package Planinarenje;

public abstract class Planinar {
    private String ime;
    private String prezime;
    private static int brojObjekta = 0;
    private int indetificationNum = brojObjekta;

    public Planinar(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        brojObjekta++;
    }

    public abstract String stampaj();
    public abstract double clanarina();
    public abstract boolean usoesnost(Planina p);

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getIndetificationNum() {
        return indetificationNum;
    }

}
