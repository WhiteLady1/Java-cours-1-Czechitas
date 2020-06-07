package cz.czechitas;

public class Disk {
    private long kapacita;
    private long vyuziteMisto;

    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long newValue) {
        kapacita = newValue;
    }

    public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(long newValue) {
        vyuziteMisto = newValue;
    }

    @Override
    public String toString() {
        return "s kapacitou " + kapacita + " GB, " +
                "a viužitým místem " + vyuziteMisto+" GB";
    }
}
