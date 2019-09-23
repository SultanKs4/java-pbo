package id.natlus.js4.tugas;

public class MainTugas1841720019Sultan {
    public static void main(String[] args) {
        Kue1841720019Sultan kue = new Kue1841720019Sultan("Kue Putu", 3000);
        PegawaiKue1841720019Sultan pegawai = new PegawaiKue1841720019Sultan("12345", "Amanda");
        PelangganKue1841720019Sultan pelanggan = new PelangganKue1841720019Sultan("Sultan", "Rumdin BLKI 40");

        Pemesanan1841720019Sultan pemesanan = new Pemesanan1841720019Sultan();
        pemesanan.setmKueSultan(kue);
        pemesanan.setmPegawaiSultan(pegawai);
        pemesanan.setmPelangganSultan(pelanggan);
        pemesanan.setmJumlahSultan(20);
        pemesanan.setmTglPesanSultan("24092019");

        pemesanan.infoRekapSultan();
    }
}
