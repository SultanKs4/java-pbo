package id.natlus.js1;

public class Sepeda1841720019Sultan {
    private String mMerek;
    private int mKecepatan;
    private int mGear;
    private String mWarna;

    public void setmWarna(String mWarna) {
        this.mWarna = mWarna;
    }

    public void setMerekSultan(String newValue) {
        mMerek = newValue;
    }

    public void gantiGearSultan(int newValue) {
        mGear = newValue;
    }

    public void tambahKecepatanSultan(int increment) {
        mKecepatan = mKecepatan + increment;
    }

    public void remSultan(int decrement) {
        mKecepatan = mKecepatan - decrement;
    }

    public void cetakSatusSultan() {
        System.out.println("Merek: " + mMerek);
        System.out.println("Kecepatan: " + mKecepatan);
        System.out.println("Gear: " + mGear);
        System.out.println("Warna: "+ mWarna);
    }
}
