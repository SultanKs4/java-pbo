package id.natlus.js9.praktikum2;

public class Sarjana1841720019Sultan extends Mahasiswa1841720019Sultan implements ICumlaude1841720019Sultan {

    public Sarjana1841720019Sultan(String mNama) {
        super(mNama);
    }

    @Override
    public void lulusSultan() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggiSultan() {
        System.out.println("IPK-ku lebih dari 3,51");
    }
}
