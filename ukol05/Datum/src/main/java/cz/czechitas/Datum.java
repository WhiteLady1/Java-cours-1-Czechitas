package cz.czechitas;

import jdk.nashorn.internal.ir.*;

public class Datum {

    private int den;
    private int mesic;
    private int rok;

    public int getDen() {
        return den;
    }

    public void setDen(int newValue) {
        den = newValue;
    }

    public int getMesic() {
        return mesic;
    }

    public void setMesic(int newValue) {
        mesic = newValue;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int newValue) {
        rok = newValue;
    }

    public String getNazevMesice() {
        String nazevMesice=" ";
        switch (mesic) {
            case 1:
                nazevMesice = nazevMesice + "leden";
                break;
            case 2:
                nazevMesice = nazevMesice + "únor";
                break;
            case 3:
                nazevMesice = nazevMesice + "březen";
                break;
            case 4:
                nazevMesice = nazevMesice + "duben";
                break;
            case 5:
                nazevMesice = nazevMesice + "květen";
                break;
            case 6:
                nazevMesice = nazevMesice + "červen";
                break;
            case 7:
                nazevMesice = nazevMesice + "čevenec";
                break;
            case 8:
                nazevMesice = nazevMesice + "srpen";
                break;
            case 9:
                nazevMesice = nazevMesice + "září";
                break;
            case 10:
                nazevMesice = nazevMesice + "říjen";
                break;
            case 11:
                nazevMesice = nazevMesice + "listopad";
                break;
            case 12:
                nazevMesice = nazevMesice + "prosinec";
                break;
        }
        return nazevMesice;
    }

    @Override
    public String toString() {
        String vysledek = "Datum ";
        if (mesic == 1 || mesic == 3 || mesic == 5 || mesic == 7 || mesic == 8 || mesic == 10 || mesic == 12) {
            if (den >= 1 && den <= 31) {
                vysledek = vysledek + den + "." + getNazevMesice() + " " + rok;
            } else {
                vysledek = vysledek + "0." + getNazevMesice() + " " + rok + "\nNeplatná hodnota dne " + den+"\n";
            }
        } else if (mesic == 2 || mesic == 4 || mesic == 6 || mesic == 9 || mesic == 11){
            if (den >= 1 && den <= 30) {
                vysledek = vysledek + den + "." + getNazevMesice() + " " + rok;
            } else {
                vysledek = vysledek + "0." + getNazevMesice() + " " + rok + "\nNeplatná hodnota dne " + den+"\n";
            }
        }  else {
            if (den >= 1 && den <= 31){
                vysledek=vysledek+den+"."+"Neplatný měsíc "+rok+"\nNeplatná hodnota měsíce "+mesic+"\n";
            }  else {
                vysledek=vysledek+"0."+"Neplatný měsíc "+rok+"\nNeplatná hodnota dne"+den+"\nNeplatná hodnota měsíce "+mesic+"\n";
            }
        }
        return vysledek;
    }
}
