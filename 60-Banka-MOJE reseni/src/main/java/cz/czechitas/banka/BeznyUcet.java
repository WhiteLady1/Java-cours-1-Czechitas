package cz.czechitas.banka;

public class BeznyUcet {

    private double zustatek;
    private double limitPrecerpani;

    public BeznyUcet(double pocatecniCastka) {
        zustatek = pocatecniCastka;
    }

    public BeznyUcet(double pocatecniCastka, double pocatecniLimitPrecerpani) {
        this.zustatek = pocatecniCastka;
        this.limitPrecerpani = pocatecniLimitPrecerpani;
    }

    public double getZustatek() {
        return zustatek;
    }

    public double getLimitPrecerpani() {
        return limitPrecerpani;
    }
    public double getPouzitelnyZustatek(){
         double pouzitelnyZustatek=zustatek+limitPrecerpani;
         return pouzitelnyZustatek;
    }

    public boolean vyberPenize(double castka) {
        if (castka < 0.0) {
            return false;
        }   else if (castka>getPouzitelnyZustatek()){
            return false;
        }   zustatek = zustatek - castka;
            return true;
    }

    public boolean vlozPenize(double castka) {
        if (0.0 > castka) {
            System.out.println("Chyba nelze vložit " + castka);
            return false;
        } 
            zustatek = zustatek + castka;
            return true;
    }
}
