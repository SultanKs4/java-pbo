package id.natlus.js2;

public class DataKaryawan1841720019Sultan {
    private int mId;
    private String mNama;
    private String mJk;
    private String mJabatan;
    private int mGaji;

    public void setmId(int mId) {
        this.mId = mId;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public void setmJk(String mJk) {
        this.mJk = mJk;
    }

    public void setmJabatan(String mJabatan) {
        this.mJabatan = mJabatan;
    }

    public void setmGaji(int mGaji) {
        this.mGaji = mGaji;
    }

    public DataKaryawan1841720019Sultan(int mId, String mNama, String mJk, String mJabatan, int mGaji) {
        this.mId = mId;
        this.mNama = mNama;
        this.mJk = mJk;
        this.mJabatan = mJabatan;
        this.mGaji = mGaji;
    }

    public void tampilBiodataSultan(){
        System.out.println("ID: " + mId);
        System.out.println("Nama: " + mNama);
        System.out.println("Jenis Kelamin: " + mJk);
        System.out.println("Jabatan: " + mJabatan);
    }

    public void tampilGajiSultan(){
        System.out.println("Gaji: " + mGaji);
    }
}
