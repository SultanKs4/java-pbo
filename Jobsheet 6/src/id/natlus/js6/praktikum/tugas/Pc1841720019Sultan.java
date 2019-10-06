package id.natlus.js6.praktikum.tugas;

public class Pc1841720019Sultan extends Komputer1841720019Sultan {
    private int mUkuranMonitor;

    public Pc1841720019Sultan() {
    }

    public Pc1841720019Sultan(String mMerk, int mKecProcessor, int mSizeMemory, String mJnsProcessor, int mUkuranMonitor) {
        super(mMerk, mKecProcessor, mSizeMemory, mJnsProcessor);
        this.mUkuranMonitor = mUkuranMonitor;
    }

    public int getmUkuranMonitor() {
        return mUkuranMonitor;
    }

    public void setmUkuranMonitor(int mUkuranMonitor) {
        this.mUkuranMonitor = mUkuranMonitor;
    }

    public void tampilPcSultan() {
        System.out.println("====================PC=====================");
        super.tampilDataSultan();
        System.out.println("Ukuran Monitor: " + getmUkuranMonitor() + " Inch");
    }
}
