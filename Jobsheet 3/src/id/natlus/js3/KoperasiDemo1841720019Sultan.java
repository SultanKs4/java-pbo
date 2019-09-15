package id.natlus.js3;

public class KoperasiDemo1841720019Sultan {
    public static void main(String[] args) {
//        Percobaan 3
//        Anggota1841720019Sultan anggota1 = new Anggota1841720019Sultan();

//        Percobaan 4
        Anggota1841720019Sultan anggota1 = new Anggota1841720019Sultan("Iwan", "Jalan Mawar");
        System.out.println("Simpanan " + anggota1.getmNamaSultan() + " : Rp " + anggota1.getmSimpananSultan());

//        Percobaan 3
        anggota1.setmNamaSultan("Iwan Setiawan");
        anggota1.setmAlamatSultan("Jalan Soekarno Hatta no 10");
        anggota1.setorSultan(10000);
        System.out.println("Simpanan " + anggota1.getmNamaSultan() + " : Rp " + anggota1.getmSimpananSultan());

        anggota1.pinjamSultan(5000);
        System.out.println("Simpanan " + anggota1.getmNamaSultan() + " : Rp " + anggota1.getmSimpananSultan());
    }
}
