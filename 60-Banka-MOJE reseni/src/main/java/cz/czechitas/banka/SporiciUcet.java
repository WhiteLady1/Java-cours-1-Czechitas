package cz.czechitas.banka;

public class SporiciUcet {
    private double zustatek;
    private double urokovaMira;

    public SporiciUcet(double pocatecniCastka) {
        this.zustatek = pocatecniCastka;
    }

    public SporiciUcet(double pocatecniCastka, double pocatecniUrokovaMira) {
        this.zustatek = pocatecniCastka;
        this.urokovaMira = pocatecniUrokovaMira;
    }

    public double getZustatek() {
        return zustatek;
    }

    public double getUrokovaMira() {
        return urokovaMira;
    }

    public boolean vlozPenize(double castka) {
        if (0.0 > castka) {
            System.out.println("Chyba nelze vložit " + castka);
            return false;
        }
        zustatek = zustatek + castka;
        return true;
    }
    public boolean vyberPenize(double castka) {
        if (castka < 0.0) {
            return false;
        }   else if (castka>zustatek){
            return false;
        }   zustatek = zustatek - castka;
        return true;
    }
    public void vypocitejRocniUrokAVlozHoNaUcet(){
        double rocniUrok=(zustatek*urokovaMira);
        vlozPenize(rocniUrok);
    }
}
