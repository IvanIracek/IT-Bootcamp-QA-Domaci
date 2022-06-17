package Planinarenje;

public class RekreatinviPlaninar extends Planinar{
    private int tezina;
    private String okrug;
    private double maxUsponBezOpreme;

    public RekreatinviPlaninar(String ime, String prezime, int tezina, String okrug, int maxUsponBezOpreme) {
        super(ime, prezime);
        this.tezina = tezina;
        this.okrug = okrug;
        this.maxUsponBezOpreme = maxUsponBezOpreme;
    }
    private double maxUsponSaOpremom(){
        return maxUsponBezOpreme - (tezina * 50);
    }

    public String getOkrug() {
        return okrug;
    }

    @Override
    public boolean usoesnost(Planina p) {
        if(maxUsponSaOpremom() >= p.getVisina()){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public double clanarina() {
        return 1000;
    }

    @Override
    public String stampaj() {
        return "Rekreativac, id: ".concat(Integer.toString(getIndetificationNum())).concat(" Ime: ").concat(getIme().concat(" ").concat(getPrezime())).concat("\n").concat("Okrug: ").concat(getOkrug());
    }

}
