package id.natlus.js9.praktikum3;

public class Rektor1841720019Sultan {
    public void beriSertifikatCumlaudeSultan(Mahasiswa1841720019Sultan mahasiswa) {
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
//        System.out.println("Selamat! silahkan perkenalkan diri Anda..");
        System.out.println("Selamat! Bagaimana Anda bisa cumlaude?");

        mahasiswa.kuliahDiKampusSultan();
        mahasiswa.lulusSultan();
        mahasiswa.meraihIPKTinggiSultan();

        System.out.println("----------------------------------------------");
    }

    public void beriSertifikatMawapresSultan(IBerprestasi1841720019Sultan mahasiswa) {
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES.");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");

        mahasiswa.menjuaraiKompetesiSultan();
        mahasiswa.membuatPublikasiIlmiahSultan();

        System.out.println("----------------------------------------------");
    }
}
