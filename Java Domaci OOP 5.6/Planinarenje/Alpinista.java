package Planinarenje;

public class Alpinista extends Planinar {
    private int brojPoena;

    public Alpinista(String ime, String prezime, int brojPoena) {
        super(ime, prezime);
        this.brojPoena = brojPoena;
    }

    public int getBrojPoena() {
        return brojPoena;
    }

    @Override
    public String stampaj() {
        return "Alpinista, id: ".concat(Integer.toString(getIndetificationNum())).concat("\n").concat("Ime: ").concat(getIme()).concat(" i ").concat(getPrezime()).concat("\n").concat("Broj poena: ").concat(Integer.toString(getBrojPoena()));
    }

    @Override
    public double clanarina() {
        return 1500 - (brojPoena * 50);
    }

    @Override
    public boolean usoesnost(Planina p) {
        if(p.getVisina() < 4000){
            return true;
        }
        else return false;
    }
}
