package id.natlus.js4.tugas;

public class Pemesanan1841720019Sultan {
    private String mTglPesan;
    private int mJumlah;
    private PegawaiKue1841720019Sultan mPegawai;
    private PelangganKue1841720019Sultan mPelanggan;
    private Kue1841720019Sultan mKue;

    public Pemesanan1841720019Sultan(String mTglPesan, int mJumlah,
                                     PegawaiKue1841720019Sultan mPegawai,
                                     PelangganKue1841720019Sultan mPelanggan,
                                     Kue1841720019Sultan mKue) {
        this.mTglPesan = mTglPesan;
        this.mJumlah = mJumlah;
        this.mPegawai = mPegawai;
        this.mPelanggan = mPelanggan;
        this.mKue = mKue;
    }

    public Pemesanan1841720019Sultan() {
    }

    public String getmTglPesanSultan() {
        return mTglPesan;
    }

    public void setmTglPesanSultan(String mTglPesan) {
        this.mTglPesan = mTglPesan;
    }

    public int getmJumlahSultan() {
        return mJumlah;
    }

    public void setmJumlahSultan(int mJumlah) {
        this.mJumlah = mJumlah;
    }

    public PegawaiKue1841720019Sultan getmPegawaiSultan() {
        return mPegawai;
    }

    public void setmPegawaiSultan(PegawaiKue1841720019Sultan mPegawai) {
        this.mPegawai = mPegawai;
    }

    public PelangganKue1841720019Sultan getmPelangganSultan() {
        return mPelanggan;
    }

    public void setmPelangganSultan(PelangganKue1841720019Sultan mPelanggan) {
        this.mPelanggan = mPelanggan;
    }

    public Kue1841720019Sultan getmKueSultan() {
        return mKue;
    }

    public void setmKueSultan(Kue1841720019Sultan mKue) {
        this.mKue = mKue;
    }

    public int hitungTotalSultan(int mJumlah, int mHarga) {
        return mJumlah * mHarga;
    }

    public void infoRekapSultan() {
        System.out.println("Pemesan: \n" + mPelanggan.infoSultan());
        System.out.println("Tanggal: " + mTglPesan);
        System.out.println("Pegawai: \n" + mPegawai.infoSultan());
        System.out.println(mKue.infoSultan());
        System.out.println("Jumlah: " + mJumlah);
        System.out.println("Jumlah Total: " + hitungTotalSultan(mJumlah, mKue.getmHargaKueSultan()));
    }
}
