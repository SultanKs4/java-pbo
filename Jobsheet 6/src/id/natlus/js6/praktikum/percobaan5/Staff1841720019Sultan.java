package id.natlus.js6.praktikum.percobaan5;

public class Staff1841720019Sultan extends Karyawan1841720019Sultan {
    private int mLembur;
    private int mPotongan;

    public Staff1841720019Sultan() {
    }

    public Staff1841720019Sultan(String mNama, String mAlamat, String mJk, int mUmur, int mGaji, int mLembur, int mPotongan) {
        super(mNama, mAlamat, mJk, mUmur, mGaji);
        this.mLembur = mLembur;
        this.mPotongan = mPotongan;
    }

    public int getmLemburSultan() {
        return mLembur;
    }

    public void setmLemburSultan(int mLembur) {
        this.mLembur = mLembur;
    }

    public int getmPotonganSultan() {
        return mPotongan;
    }

    public void setmPotonganSultan(int mPotongan) {
        this.mPotongan = mPotongan;
    }

    public void tampilDataStaffSultan() {
        super.tampilDataKaryawanSultan();
        System.out.println("Lembur\t\t\t= " + getmLemburSultan() + "\nPotongan\t\t= " + getmPotonganSultan());
        System.out.println("Total Gaji\t\t= " + (getmGajiSultan() + getmLemburSultan() - getmPotonganSultan()));
    }
}
