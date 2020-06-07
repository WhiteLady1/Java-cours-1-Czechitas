package cz.czechitas;

public class Pamet {
    private long kamacita;

    public long getKamacita() {
        return kamacita;
    }

    public void setKamacita(long newValue) {
        kamacita = newValue;
    }

    @Override
    public String toString() {
        return "s kamacitou " + kamacita+" GB";
    }
}
