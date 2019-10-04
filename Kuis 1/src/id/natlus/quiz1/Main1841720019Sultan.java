package id.natlus.quiz1;

import id.natlus.quiz1.mesincuci.MesinCuci1841720019Sultan;
import id.natlus.quiz1.mesincuci.MesinCuci2Tabung1841720019Sultan;
import id.natlus.quiz1.transaksi.Transaksi1841720019Sultan;

public class Main1841720019Sultan {
    public static void main(String[] args) {
        MesinCuci1841720019Sultan mesincuci = new MesinCuci1841720019Sultan(Warna.Putih, 500, 2, "Samsung");
        MesinCuci2Tabung1841720019Sultan mesincuci2 = new MesinCuci2Tabung1841720019Sultan(Warna.Kuning, 500, 2,
                "LG", 3);
        Transaksi1841720019Sultan beli = new Transaksi1841720019Sultan(mesincuci, 20, 100000);
        Transaksi1841720019Sultan beli2 = new Transaksi1841720019Sultan(mesincuci2, 20, 100000);

        beli.infoSultan();
        beli2.infoSultan();
    }
}
