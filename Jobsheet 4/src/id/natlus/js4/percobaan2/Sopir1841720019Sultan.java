package id.natlus.js4.percobaan2;

public class Sopir1841720019Sultan {
    private String mNama;
    private int mBiaya;

    public Sopir1841720019Sultan() {
    }

    public String getmNamaSultan() {
        return mNama;
    }

    public void setmNamaSultan(String mNama) {
        this.mNama = mNama;
    }

    public int getmBiayaSultan() {
        return mBiaya;
    }

    public void setmBiayaSultan(int mBiaya) {
        this.mBiaya = mBiaya;
    }

    public int hitungBiayaSopirSultan(int hari) {
        return mBiaya * hari;
    }
}
