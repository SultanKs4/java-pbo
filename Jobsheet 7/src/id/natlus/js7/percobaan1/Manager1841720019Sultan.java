package id.natlus.js7.percobaan1;

import java.util.Locale;

public class Manager1841720019Sultan extends Karyawan1841720019Sultan {
    private double mTunjangan;
    private String mBagian;
    private Staff1841720019Sultan[] mSt;

    public double getmTunjanganSultan() {
        return mTunjangan;
    }

    public void setmTunjanganSultan(double mTunjangan) {
        this.mTunjangan = mTunjangan;
    }

    public String getmBagianSultan() {
        return mBagian;
    }

    public void setmBagianSultan(String mBagian) {
        this.mBagian = mBagian;
    }

    public void setStaffSultan(Staff1841720019Sultan[] mSt) {
        this.mSt = mSt;
    }

    public void viewStaffSultan() {
        System.out.println("===============");
        for (int i = 0; i < mSt.length; i++) {
            mSt[i].lihatInfo();
        }
        System.out.println("===============");
    }

    public void lihatInfoSultan() {
        System.out.println("Manager\t\t: " + this.getmBagianSultan());
        System.out.println("NIP\t\t\t: " + this.getmNipSultan());
        System.out.println("Nama\t\t: " + this.getmNamaSultan());
        System.out.println("Golongan\t: " + this.getmGolonganSultan());
        System.out.printf(Locale.ITALY, "Tunjangan\t: Rp %,.0f\n", this.getmTunjanganSultan());
        System.out.printf(Locale.ITALY, "Gaji\t\t: Rp %,.0f\n", this.getmGajiSultan());
        System.out.println("Bagian\t\t: " + this.getmBagianSultan());
        this.viewStaffSultan();
    }

    @Override
    public Double getmGajiSultan() {
        return super.getmGajiSultan() + mTunjangan;
    }
}
