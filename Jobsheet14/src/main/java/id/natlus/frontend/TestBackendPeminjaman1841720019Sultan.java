package id.natlus.frontend;

import id.natlus.backend.Anggota1841720019Sultan;
import id.natlus.backend.Buku1841720019Sultan;
import id.natlus.backend.Peminjaman1841720019Sultan;

public class TestBackendPeminjaman1841720019Sultan {

    public static void main(String[] args) {
        Anggota1841720019Sultan agt = new Anggota1841720019Sultan().getByIdSultan(1);
        Buku1841720019Sultan TimunMas = new Buku1841720019Sultan().getByIdSultan(1);
        Peminjaman1841720019Sultan peminjaman1 = new Peminjaman1841720019Sultan(agt, TimunMas, "2019/12/26", "2019/12/28");
        peminjaman1.saveSultan();
        for (Peminjaman1841720019Sultan p : new Peminjaman1841720019Sultan().getAllSultan()) {
            System.out.println("Nama Peminjam : " + p.getmAnggotaSultan().getmNamaSultan() + "\n"
                    + "Nama Buku : " + p.getmBukuSultan().getmJudulSultan() + "\n"
                    + "Tanggal Pinjam: " + p.getmTanggalPinjamSultan() + "\n"
                    + "Tanggal Kembali: " + p.getmTanggalKembaliSultan());
        }
    }
}
