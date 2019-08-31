package id.natlus.js1;

public class Motor1841720019Sultan {
    private String mMerk;
    private String mWarna;
    private String mTipe;
    private int mKecepatan;
    private int mBensin;

    public void setmMerkSultan(String mMerk) {
        this.mMerk = mMerk;
    }

    public void setmWarnaSultan(String mWarna) {
        this.mWarna = mWarna;
    }

    public void setmTipeSultan(String mTipe) {
        this.mTipe = mTipe;
    }

    public void setKecepatanUpSultan(int kecepatan) {
        this.mKecepatan = this.mKecepatan + kecepatan;
    }

    public void setKecepatanDownSultan(int kecepatan) {
        this.mKecepatan = this.mKecepatan - kecepatan;
    }

    public void setmBensinSultan(int mBensin) {
        this.mBensin = mBensin;
    }

    public void cetakSatusSultan() {
        System.out.println("Merk: " + mMerk);
        System.out.println("Tipe: " + mTipe);
        System.out.println("Warna: "+ mWarna);
        System.out.println("Kecepatan: " + mKecepatan);
        System.out.println("Bensin: "+ mBensin);
    }
}
