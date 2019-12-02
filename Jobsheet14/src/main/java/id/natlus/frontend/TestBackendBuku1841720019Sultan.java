package id.natlus.frontend;

import id.natlus.backend.Buku1841720019Sultan;
import id.natlus.backend.Kategori1841720019Sultan;

public class TestBackendBuku1841720019Sultan {
    public static void main(String[] args) {
        Kategori1841720019Sultan novel = new Kategori1841720019Sultan().getByIdSultan(1);
        Kategori1841720019Sultan referensi = new Kategori1841720019Sultan().getByIdSultan(2);

        Buku1841720019Sultan buku1 = new Buku1841720019Sultan(novel, "Timun Mas", "Elex Media", "Bang Supit");
        Buku1841720019Sultan buku2 = new Buku1841720019Sultan(referensi, "Metode Linier", "Springer", "Alex Baldwin");
        Buku1841720019Sultan buku3 = new Buku1841720019Sultan(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");

        // test insert
        buku1.saveSultan();
        buku2.saveSultan();

        // test update
        buku2.setmJudulSultan("Aljabar Linier");
        buku2.saveSultan();

        // test delete
        buku3.deleteSultan();

        // test select all
        for (Buku1841720019Sultan b : new Buku1841720019Sultan().getAllSultan()) {
            System.out.println("Kategori: " + b.getmKategoriSultan().getmNamaSultan() + ", Judul: " + b.getmJudulSultan());
        }

        // test search
        for (Buku1841720019Sultan b : new Buku1841720019Sultan().searchSultan("timun")) {
            System.out.println("Kategori: " + b.getmKategoriSultan().getmNamaSultan() + ", Judul: " + b.getmJudulSultan());
        }

    }
}
