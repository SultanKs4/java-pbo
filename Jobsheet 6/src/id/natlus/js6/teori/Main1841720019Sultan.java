package id.natlus.js6.teori;

import id.natlus.js6.teori.bangundatar.Lingkaran1841720019Sultan;
import id.natlus.js6.teori.bangundatar.PersegiPanjang1841720019Sultan;

public class Main1841720019Sultan {
    public static void main(String[] args) {
        PersegiPanjang1841720019Sultan pp = new PersegiPanjang1841720019Sultan();
        Lingkaran1841720019Sultan lingkaran = new Lingkaran1841720019Sultan();

        pp.lebar = 20;
        pp.panjang = 30;
        System.out.println("Panjang: " + pp.panjang + "\nLebar: " + pp.lebar);
        System.out.println("Luas Persegi Panjang: " + pp.luasSultan());
        System.out.println("Keliling Persegi Panjang: " + pp.kelilingSultan());

        lingkaran.r = 10;
        System.out.println("Jari-Jari: " + lingkaran.r);
        System.out.println("Luas Lingkaran; " + lingkaran.luasSultan());
        System.out.println("Keliling Lingkaran: " + lingkaran.kelilingSultan());
    }
}
