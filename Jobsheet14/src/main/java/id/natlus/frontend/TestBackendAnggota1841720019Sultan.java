package id.natlus.frontend;

import id.natlus.backend.Anggota1841720019Sultan;

public class TestBackendAnggota1841720019Sultan {
    public static void main(String[] args) {
        Anggota1841720019Sultan agt1 = new Anggota1841720019Sultan("Sultan", "Malang", "123");
        Anggota1841720019Sultan agt2 = new Anggota1841720019Sultan("Achmad", "Blitar", "456");
        Anggota1841720019Sultan agt3 = new Anggota1841720019Sultan("Masykuro", "Surabya", "789");

        //test insert
        agt1.saveSultan();
        agt2.saveSultan();
        agt3.saveSultan();

        //test update
        agt2.setmAlamatSultan("Jawa Timur");
        agt2.saveSultan();

        //test delete
        agt3.deleteSultan();

        //tes select all
        for (Anggota1841720019Sultan k : new Anggota1841720019Sultan().getAllSultan()) {
            System.out.println("Nama: " + k.getmNamaSultan() + ", Alamat : " + k.getmAlamatSultan() + ", Telepon : " + k.getmTeleponSultan());
        }

        //test search
        for (Anggota1841720019Sultan a : new Anggota1841720019Sultan().searchSultan("Timur")) {
            System.out.println("Nama: " + a.getmNamaSultan() + ", Alamat : " + a.getmAlamatSultan() + ", Telepon : " + a.getmTeleponSultan());
        }
    }
}
