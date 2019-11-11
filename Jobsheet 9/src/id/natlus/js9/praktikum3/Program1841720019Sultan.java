package id.natlus.js9.praktikum3;

public class Program1841720019Sultan {
    public static void main(String[] args) {
        Rektor1841720019Sultan pakRektor = new Rektor1841720019Sultan();

//        Mahasiswa1841720019Sultan mahasiswaBiasa = new Mahasiswa1841720019Sultan("Charlie");
        Sarjana1841720019Sultan sarjanaCumlaude = new Sarjana1841720019Sultan("Dini");
        PascaSarjana1841720019Sultan masterCumlaude = new PascaSarjana1841720019Sultan("Elok");

//        pakRektor.beriSertifikatCumlaudeSultan(mahasiswaBiasa);
//        pakRektor.beriSertifikatCumlaudeSultan(sarjanaCumlaude);
//        pakRektor.beriSertifikatCumlaudeSultan(masterCumlaude);

        pakRektor.beriSertifikatMawapresSultan(sarjanaCumlaude);
        pakRektor.beriSertifikatMawapresSultan(masterCumlaude);
    }
}
