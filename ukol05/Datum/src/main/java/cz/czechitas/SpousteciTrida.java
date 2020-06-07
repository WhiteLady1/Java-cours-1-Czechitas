package cz.czechitas;

public class SpousteciTrida {

    public static void main(String[] args) {
        Datum dnes= new Datum();
        dnes.setDen(1);
        dnes.setMesic(1);
        dnes.setRok(2019);
        System.out.println(dnes);
        System.out.println("Měsíc:"+dnes.getNazevMesice()+"\n");

        Datum vanoce = new Datum();
        vanoce.setRok(2019);
        vanoce.setMesic(12);
        vanoce.setDen(24);
        System.out.println(vanoce);

        Datum silvestr = new Datum();
        silvestr.setRok(2019);
        silvestr.setMesic(12);
        silvestr.setDen(31);
        System.out.println(silvestr);

        if (vanoce.getMesic() == silvestr.getMesic()) {
            System.out.println("Vanoce a Silvestr jsou ve stejnem mesici.");
        } else {
            System.out.println("Vanoce a Silvestr NEJSOU ve stejnem mesici.");
        }

        System.out.println();
        Datum nesmyslnyMesic = new Datum();
        nesmyslnyMesic.setRok(2020);
        nesmyslnyMesic.setMesic(13);
        nesmyslnyMesic.setDen(11);
        System.out.println(nesmyslnyMesic);

        Datum nesmyslnyMesic2 = new Datum();
        nesmyslnyMesic2.setRok(2021);
        nesmyslnyMesic2.setMesic(-1);
        nesmyslnyMesic2.setDen(5);
        System.out.println(nesmyslnyMesic2);

        Datum nesmyslnyDen = new Datum();
        nesmyslnyDen.setRok(2022);
        nesmyslnyDen.setMesic(12);
        nesmyslnyDen.setDen(40);
        System.out.println(nesmyslnyDen);

        Datum nesmyslnyDen2 = new Datum();
        nesmyslnyDen2.setRok(2023);
        nesmyslnyDen2.setMesic(3);
        nesmyslnyDen2.setDen(-2);
        System.out.println(nesmyslnyDen2);
    }

}
