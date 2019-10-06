package id.natlus.js6.praktikum.percobaan5;

public class Karyawan1841720019Sultan {
    private String mNama;
    private String mAlamat;
    private String mJk;
    private int mUmur;
    private int mGaji;

    public Karyawan1841720019Sultan() {
    }

    public Karyawan1841720019Sultan(String mNama, String mAlamat, String mJk, int mUmur, int mGaji) {
        this.mNama = mNama;
        this.mAlamat = mAlamat;
        this.mJk = mJk;
        this.mUmur = mUmur;
        this.mGaji = mGaji;
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

    public String getmJkSultan() {
        return mJk;
    }

    public void setmJkSultan(String mJk) {
        this.mJk = mJk;
    }

    public int getmUmurSultan() {
        return mUmur;
    }

    public void setmUmurSultan(int mUmur) {
        this.mUmur = mUmur;
    }

    public int getmGajiSultan() {
        return mGaji;
    }

    public void setmGajiSultan(int mGaji) {
        this.mGaji = mGaji;
    }

    public void tampilDataKaryawanSultan() {
        System.out.println("Nama\t\t\t= " + getmNamaSultan() + "\nAlamat\t\t\t= " + getmAlamatSultan());
        System.out.println("Jenis Kelamin\t= " + getmJkSultan() + "\nUmur\t\t\t= " + getmUmurSultan());
        System.out.println("Gaji\t\t\t= " + getmGajiSultan());
    }
}
