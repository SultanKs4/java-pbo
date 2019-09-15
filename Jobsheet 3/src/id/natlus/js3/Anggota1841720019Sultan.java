package id.natlus.js3;

public class Anggota1841720019Sultan {
    private String mNama;
    private String mAlamat;
    private float mSimpanan;

    public Anggota1841720019Sultan(String mNama, String mAlamat) {
        this.mNama = mNama;
        this.mAlamat = mAlamat;
    }

    public String getmNamaSultan() {
        return mNama;
    }

    public void setmNamaSultan(String mNama) {
        this.mNama = mNama;
    }

    public String getmAlamatSultan() {
        return mAlamat;
    }

    public void setmAlamatSultan(String mAlamat) {
        this.mAlamat = mAlamat;
    }

    public float getmSimpananSultan() {
        return mSimpanan;
    }

    public void setorSultan(float uang) {
        mSimpanan += uang;
    }

    public void pinjamSultan(float uang) {
        mSimpanan -= uang;
    }
}
