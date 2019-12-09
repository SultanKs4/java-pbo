package id.natlus.jobsheet15.database.frontend;

import id.natlus.jobsheet15.database.backend.Kategori1841720019Sultan;

public class TestBackend1841720019Sultan {
    public static void main(String[] args) {
        Kategori1841720019Sultan kat1 = new Kategori1841720019Sultan("Novel", "Koleksi buku novel");
        Kategori1841720019Sultan kat2 = new Kategori1841720019Sultan("Referensi", "Buku referensi ilmiah");
        Kategori1841720019Sultan kat3 = new Kategori1841720019Sultan("Komik", "Komik anak-anak");

        // test insert
        kat1.saveSultan();
        kat2.saveSultan();
        kat3.saveSultan();

        // test update
        kat2.setmKeteranganSultan("Koleksi buku referensi ilmiah");
        kat2.saveSultan();

        // test delete
        kat3.deleteSultan();

        // test select all
        for (Kategori1841720019Sultan k : new Kategori1841720019Sultan().getAllSultan()) {
            System.out.println("Nama: " + k.getmNamaSultan() + ", Ket: " + k.getmKeteranganSultan());
        }

        // test search
        for (Kategori1841720019Sultan k : new Kategori1841720019Sultan().searchSultan("ilmiah")) {
            System.out.println("Nama: " + k.getmNamaSultan() + ", Ket: " + k.getmKeteranganSultan());
        }
    }
}
