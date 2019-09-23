package id.natlus.js4.percobaan2;

public class Pelanggan1841720019Sultan {
    private String mNama;
    private Mobil1841720019Sultan mMobil;
    private Sopir1841720019Sultan mSopir;
    private int mHari;

    public Pelanggan1841720019Sultan() {
    }

    public String getNamaSultan() {
        return mNama;
    }

    public void setmNamaSultan(String nama) {
        this.mNama = nama;
    }

    public Mobil1841720019Sultan getmMobilSultan() {
        return mMobil;
    }

    public void setmMobilSultan(Mobil1841720019Sultan mMobil) {
        this.mMobil = mMobil;
    }

    public Sopir1841720019Sultan getmSopirSultan() {
        return mSopir;
    }

    public void setmSopirSultan(Sopir1841720019Sultan mSopir) {
        this.mSopir = mSopir;
    }

    public int getmHariSultan() {
        return mHari;
    }

    public void setmHariSultan(int mHari) {
        this.mHari = mHari;
    }

    public int hitungBiayaTotalSultan() {
        return mMobil.hitungBiayaMobilSultan(mHari) + mSopir.hitungBiayaSopirSultan(mHari);
    }
}
