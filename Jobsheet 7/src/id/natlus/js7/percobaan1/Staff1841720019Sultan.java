package id.natlus.js7.percobaan1;

import java.util.Locale;

public class Staff1841720019Sultan extends Karyawan1841720019Sultan {
    private int mLembur;
    private double mGajiLembur;

    public int getmLemburSultan() {
        return mLembur;
    }

    public void setmLemburSultan(int mLembur) {
        this.mLembur = mLembur;
    }

    public double getmGajiLemburSultan(int mLembur, double mGajiLembur) {
        return super.getmGajiSultan() + mGajiLembur * mGajiLembur;
    }

    public double getmGajiLemburSultan() {
        return super.getmGajiSultan() + mLembur * mGajiLembur;
    }

    public void setmGajiLemburSultan(double mGajiLembur) {
        this.mGajiLembur = mGajiLembur;
    }

    public void lihatInfo() {
        System.out.println("NIP\t\t\t: " + this.getmNipSultan());
        System.out.println("Nama\t\t: " + this.getmNamaSultan());
        System.out.println("Golongan\t: " + this.getmGolonganSultan());
        System.out.println("Jml Lembur\t: " + this.getmLemburSultan());
        System.out.printf(Locale.ITALY, "Gaji Lembur\t: Rp %,.0f\n", this.getmGajiLemburSultan());
        System.out.printf(Locale.ITALY, "Gaji\t\t: Rp %,.0f\n\n", this.getmGajiSultan());
    }
}
