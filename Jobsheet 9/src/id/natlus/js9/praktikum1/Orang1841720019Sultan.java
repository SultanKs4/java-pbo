package id.natlus.js9.praktikum1;

public class Orang1841720019Sultan {
    private String mNama;
    private Hewan1841720019Sultan mHewanPeliharaan;

    public Orang1841720019Sultan(String mNama) {
        this.mNama = mNama;
    }

    public void peliharaanHewanSultan(Hewan1841720019Sultan hewanPelihaan) {
        this.mHewanPeliharaan = hewanPelihaan;
    }

    public void ajakPeliharaanJalanJalanSultan(){
        System.out.println("Namaku " + this.mNama);
        System.out.println("Hewan peliharaanku berjalan dengan cara: ");
        this.mHewanPeliharaan.bergerakSultan();
        System.out.println("-----------------------------------------");
    }
}
