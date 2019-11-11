package id.natlus.js9.praktikum1;

public class Program1841720019Sultan {
    public static void main(String[] args) {
        Kucing1841720019Sultan kucingKampung = new Kucing1841720019Sultan();
        Ikan1841720019Sultan lumbalumba = new Ikan1841720019Sultan();

        Orang1841720019Sultan ani = new Orang1841720019Sultan("Ani");
        Orang1841720019Sultan budi = new Orang1841720019Sultan("Budi");

        ani.peliharaanHewanSultan(kucingKampung);
        budi.peliharaanHewanSultan(lumbalumba);

        ani.ajakPeliharaanJalanJalanSultan();
        budi.ajakPeliharaanJalanJalanSultan();
    }
}
