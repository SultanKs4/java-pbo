package id.natlus.js6.praktikum.tugas;

public class Komputer1841720019Sultan {
    private String mMerk;
    private int mKecProcessor;
    private int mSizeMemory;
    private String mJnsProcessor;

    public Komputer1841720019Sultan() {
    }

    public Komputer1841720019Sultan(String mMerk, int mKecProcessor, int mSizeMemory, String mJnsProcessor) {
        this.mMerk = mMerk;
        this.mKecProcessor = mKecProcessor;
        this.mSizeMemory = mSizeMemory;
        this.mJnsProcessor = mJnsProcessor;
    }

    public String getmMerkSultan() {
        return mMerk;
    }

    public void setmMerkSultan(String mMerk) {
        this.mMerk = mMerk;
    }

    public int getmKecProcessorSultan() {
        return mKecProcessor;
    }

    public void setmKecProcessorSultan(int mKecProcessor) {
        this.mKecProcessor = mKecProcessor;
    }

    public int getmSizeMemorySultan() {
        return mSizeMemory;
    }

    public void setmSizeMemorySultan(int mSizeMemory) {
        this.mSizeMemory = mSizeMemory;
    }

    public String getmJnsProcessorSultan() {
        return mJnsProcessor;
    }

    public void setmJnsProcessorSultan(String mJnsProcessor) {
        this.mJnsProcessor = mJnsProcessor;
    }

    public void tampilDataSultan() {
        System.out.println("Merk: " + getmMerkSultan() + "\nKecepatan Processor: " + getmKecProcessorSultan() + " Ghz");
        System.out.println("Memory: " + getmSizeMemorySultan() + " GB" + "\nJenis Processor: " + getmJnsProcessorSultan());
    }
}
