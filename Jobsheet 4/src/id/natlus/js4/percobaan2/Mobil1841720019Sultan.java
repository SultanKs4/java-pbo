package id.natlus.js4.percobaan2;

public class Mobil1841720019Sultan {
    private String mMerk;
    private int mBiaya;

    public Mobil1841720019Sultan() {
    }

    public String getmMerkSultan() {
        return mMerk;
    }

    public void setmMerkSultan(String mMerk) {
        this.mMerk = mMerk;
    }

    public int getmBiayaSultan() {
        return mBiaya;
    }

    public void setmBiayaSultan(int mBiaya) {
        this.mBiaya = mBiaya;
    }

    public int hitungBiayaMobilSultan(int hari) {
        return mBiaya * hari;
    }
}
