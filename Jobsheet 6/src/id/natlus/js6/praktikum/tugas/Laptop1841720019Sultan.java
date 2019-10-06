package id.natlus.js6.praktikum.tugas;

public class Laptop1841720019Sultan extends Komputer1841720019Sultan {
    private String mJnsBaterai;

    public Laptop1841720019Sultan() {
    }

    public Laptop1841720019Sultan(String mMerk, int mKecProcessor, int mSizeMemory, String mJnsProcessor, String mJnsBaterai) {
        super(mMerk, mKecProcessor, mSizeMemory, mJnsProcessor);
        this.mJnsBaterai = mJnsBaterai;
    }

    public String getmJnsBateraiSultan() {
        return mJnsBaterai;
    }

    public void setmJnsBateraiSultan(String mJnsBaterai) {
        this.mJnsBaterai = mJnsBaterai;
    }

    public void tampilLaptopSultan() {
        super.tampilDataSultan();
        System.out.println("Jenis Baterai: " + getmJnsBateraiSultan());
    }
}
