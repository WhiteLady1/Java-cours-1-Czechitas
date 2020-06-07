package cz.czechitas;

import java.util.*;

public class Pocitac {
    boolean jeZapnutý;
    Procesor cpu;
    Pamet ram;
    Disk pevnyDisk;
    Disk externi;
    int prikaz;

    @Override
    public String toString() {
        return "Pocitac " +
                "je Zapnutý " + jeZapnutý + ", " +
                "cpu je " + cpu + ", " +
                "ram je " + ram + ", " +
                "pevnyDisk je " + pevnyDisk;
    }

    public void turnOn(){
        if(jeZapnutý==false){
            jeZapnutý=true;
            System.out.println("Počítač se zapnul.");
            System.out.println("Počítač je složen z Procesoru "+ cpu + ", " +
                    " Paměti " + ram + ", " +
                    "a pevného disku " + pevnyDisk);

        }
        else {
            System.out.println("Počítač je již zapnutý.");
        }
    }
    public void turnOff(){
        if(jeZapnutý==true){
            jeZapnutý=false;
            System.out.println("Počítač se vypnul.");
        }
        else {
            jeZapnutý = false;
        }
    }
    public void zadejPrikaz(){
        String vstup;
        System.out.println("Zadej příkaz:");
        Scanner sc= new Scanner(System.in);
        vstup=sc.nextLine();
        String aString = vstup;
        int aInt = Integer.parseInt(aString);
        prikaz=aInt;
    }
    public void ulozSoubor(){
        String vstup;
        System.out.println("Zadej velikost souboru:");
        Scanner sc= new Scanner(System.in);
        vstup=sc.nextLine();
        String aString = vstup;
        int aInt = Integer.parseInt(aString);

        if ((pevnyDisk.getVyuziteMisto()+aInt)<pevnyDisk.getKapacita()){
            pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto()+aInt);
            System.out.println("Soubor přidán na disk. Volného místa na disku je "+(pevnyDisk.getKapacita()-pevnyDisk.getVyuziteMisto()));
        }   else {
                 System.out.println("Soubor je příliž velký nemohl být na disk přidán");
        }
    }
    public void smazSoubor(){
        String vstup;
        System.out.println("Zadej velikost souboru ke smazání:");
        Scanner sc= new Scanner(System.in);
        vstup=sc.nextLine();
        String aString = vstup;
        int aInt = Integer.parseInt(aString);

        if ((pevnyDisk.getVyuziteMisto()-aInt)>=0){
            pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto()-aInt);
            System.out.println("Soubor smazán z disku. Volného místa na disku je "+(pevnyDisk.getKapacita()-pevnyDisk.getVyuziteMisto()));
        }   else {
            System.out.println("Soubor na disku nenalezen, jeho veikos neodpovídá využitému sítu na disku.");
        }
    }
//    public void pripojExterniDisk(){
//        long externi;
//        String vstup;
//        System.out.println("Zadej velikost externího disku:");
//        Scanner sc= new Scanner(System.in);
//        vstup=sc.nextLine();
//        String aString = vstup;
//        int bInt = Integer.parseInt(aString);
//        long externi=bInt;
//    }
}
