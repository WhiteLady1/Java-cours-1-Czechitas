package cz.czechitas;

import java.util.*;

public class SpousteciTrida {

    public static void main(String[] args) {
        Pocitac blankaPC = new Pocitac();
        System.out.println("Jsem aplikce pro operace s Blanka PC. Vyber prosím úkon, který mám provést:");
        System.out.println("0 = vypnout / 1 = zapnout / 2 = informace o konfiguraci / 3 = opravit / 5 = ulož soubor / 6 = smaž soubor / 9 = konec programu");
        while (blankaPC.prikaz != 9) {
            blankaPC.zadejPrikaz();
            if (blankaPC.prikaz == 1) {
                if (blankaPC.cpu == null) {
                    System.out.println("Nelze zapnout, chybí komponenty. Pokus se počítač opravit.");
                } else {
                    blankaPC.turnOn();
                }
            } else if (blankaPC.prikaz == 0) {
                blankaPC.turnOff();
            } else if (blankaPC.prikaz == 3) {
                Disk blankaExterni= new Disk();
                Disk blankaDisk = new Disk();
                blankaDisk.setKapacita(500);
                blankaDisk.setVyuziteMisto(0);
                Pamet blankaPamet = new Pamet();
                blankaPamet.setKamacita(8);
                Procesor blankaProcesor = new Procesor();
                blankaProcesor.setRychlost(1000);
                blankaProcesor.setVyrobce("Intel");
                blankaPC.cpu = blankaProcesor;
                blankaPC.ram = blankaPamet;
                blankaPC.pevnyDisk = blankaDisk;
                System.out.println("Oprava byla úspěšná.");
            } else if (blankaPC.prikaz == 2){
                System.out.println(blankaPC);
            } else if (blankaPC.prikaz == 5){
                if (blankaPC.jeZapnutý==true){
                    blankaPC.ulozSoubor();
                }  else {
                    System.out.println("Počítač není zapnutý, soubor nelze vložit");
                }
            }    else if (blankaPC.prikaz == 9){
                System.out.println("Aplikace ukončena. Krásný den.");
            }   else if (blankaPC.prikaz == 6){
                blankaPC.smazSoubor();
            }
                else {
                System.out.println("Neplatný kód operace!");
            }
        }

    }

}
