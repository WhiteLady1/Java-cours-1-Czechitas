package cz.czechitas;

public class Procesor {
    private String vyrobce;
    private long frekvence;

    public String getVyrobce() {
        return vyrobce;
    }

    public void setVyrobce(String newValue) {
        vyrobce = newValue;
    }

    public long getRychlost() {
        return frekvence;
    }

    public void setRychlost(long newValue) {
        frekvence = newValue;
    }

    @Override
    public String toString() {
        return  "od vyrobce \"" + vyrobce + "\"" + ", " +
                "s frekvencí " + frekvence+" GHz";
    }
}
