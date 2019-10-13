package id.natlus.js7.tugas.overriding;

public class Main1841720019Sultan {
    public static void main(String[] args) {
        Manusia1841720019Sultan mns = new Manusia1841720019Sultan();
        Dosen1841720019Sultan dsn = new Dosen1841720019Sultan();
        Mahasiswa1841720019Sultan mhs = new Mahasiswa1841720019Sultan();

        System.out.println("Normal");
        mns.bernafasSultan();
        mns.makanSultan();

        System.out.println("\nDynamic Method Dispatch Dosen");
        mns = dsn;
        mns.bernafasSultan();
        mns.makanSultan();

        System.out.println("\nDynamic Method Dispatch Mahasiswa");
        mns = mhs;
        mns.bernafasSultan();
        mns.makanSultan();

        System.out.println("\nKembali normal");
        mns = new Manusia1841720019Sultan();
        mns.bernafasSultan();
        mns.makanSultan();
    }
}
