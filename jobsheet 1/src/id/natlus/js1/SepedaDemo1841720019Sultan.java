package id.natlus.js1;

public class SepedaDemo1841720019Sultan {
    public static void main(String[] args) {

        // Pembuatan dua buah Object sepeda
        Sepeda1841720019Sultan spd1 = new Sepeda1841720019Sultan();
        Sepeda1841720019Sultan spd2 = new Sepeda1841720019Sultan();
        SepedaGunung1841720019Sultan spd3 = new SepedaGunung1841720019Sultan();

        // Pemanggilan method didalam Object sepeda
        spd1.setMerekSultan("Polygon");
        spd1.tambahKecepatanSultan(10);
        spd1.gantiGearSultan(2);
        spd1.setmWarna("Biru");
        spd1.cetakSatusSultan();

        spd2.setMerekSultan("Wiim Cycle");
        spd2.tambahKecepatanSultan(10);
        spd2.gantiGearSultan(2);
        spd2.tambahKecepatanSultan(10);
        spd2.gantiGearSultan(3);
        spd2.setmWarna("Merah");
        spd2.cetakSatusSultan();

        spd3.setMerekSultan("Klinee");
        spd3.tambahKecepatanSultan(5);
        spd3.gantiGearSultan(7);
        spd3.setTipeSuspensiSultan("Gas Suspension");
        spd3.setmWarna("Pink");
        spd3.cetakSatusSultan();
    }

}
