package id.natlus.js6.praktikum.percobaan6;

import id.natlus.js6.praktikum.percobaan5.Staff1841720019Sultan;

public class StaffTetap1841720019Sultan extends Staff1841720019Sultan {
    private String mGolongan;
    private int mAsuransi;

    public StaffTetap1841720019Sultan() {
    }

    public StaffTetap1841720019Sultan(String mNama, String mAlamat, String mJk, int mUmur, int mGaji, int mLembur, int mPotongan, String mGolongan, int mAsuransi) {
        super(mNama, mAlamat, mJk, mUmur, mGaji, mLembur, mPotongan);
        this.mGolongan = mGolongan;
        this.mAsuransi = mAsuransi;
    }

    public String getmGolonganSultan() {
        return mGolongan;
    }

    public void setmGolonganSultan(String mGolongan) {
        this.mGolongan = mGolongan;
    }

    public int getmAsuransiSultan() {
        return mAsuransi;
    }

    public void setmAsuransiSultan(int mAsuransi) {
        this.mAsuransi = mAsuransi;
    }

    public void tampilStaffTetapSultan() {
        System.out.println("====================Data Staff Tetap====================");
        super.tampilDataStaffSultan();
        System.out.println("Golongan\t\t= " + getmGolonganSultan() + "\nJumlah Asuransi\t= " + getmAsuransiSultan());
        System.out.println("Gaji Bersih\t\t= " + (getmGajiSultan() + getmLemburSultan() - getmPotonganSultan() - getmAsuransiSultan()));
    }
}
