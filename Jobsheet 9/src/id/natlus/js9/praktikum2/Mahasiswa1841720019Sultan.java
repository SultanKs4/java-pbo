package id.natlus.js9.praktikum2;

public class Mahasiswa1841720019Sultan implements ICumlaude1841720019Sultan {
    protected String mNama;

    public Mahasiswa1841720019Sultan(String mNama) {
        this.mNama = mNama;
    }

    public void kuliahDiKampusSultan() {
        System.out.println("Aku mahasiswa, namaku " + this.mNama);
        System.out.println("Aku berkuliah di kampus.");
    }

    @Override
    public void lulusSultan() {
        System.out.println("Mahasiswa");
    }

    @Override
    public void meraihIPKTinggiSultan() {
        System.out.println("Bismillah IPK Tinggi");
    }
}
