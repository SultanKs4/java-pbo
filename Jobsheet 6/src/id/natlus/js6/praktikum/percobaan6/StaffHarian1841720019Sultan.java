package id.natlus.js6.praktikum.percobaan6;

import id.natlus.js6.praktikum.percobaan5.Staff1841720019Sultan;

public class StaffHarian1841720019Sultan extends Staff1841720019Sultan {
    private int mJmlJamKerja;

    public StaffHarian1841720019Sultan() {
    }

    public StaffHarian1841720019Sultan(String mNama, String mAlamat, String mJk, int mUmur, int mGaji, int mLembur, int mPotongan, int mJmlJamKerja) {
        super(mNama, mAlamat, mJk, mUmur, mGaji, mLembur, mPotongan);
        this.mJmlJamKerja = mJmlJamKerja;
    }

    public int getmJmlJamKerjaSultan() {
        return mJmlJamKerja;
    }

    public void setmJmlJamKerjaSultan(int mJmlJamKerja) {
        this.mJmlJamKerja = mJmlJamKerja;
    }

    public void tampilStaffHarianSultan() {
        System.out.println("====================Data Staff Harian====================");
        super.tampilDataStaffSultan();
        System.out.println("Jumlah Jam Kerja = " + getmJmlJamKerjaSultan());
        System.out.println("Gaji Bersih\t\t= " + (getmGajiSultan() * getmJmlJamKerjaSultan() + getmLemburSultan() - getmPotonganSultan()));
    }
}
