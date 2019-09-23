package id.natlus.js4.percobaan1;

public class Processor1841720019Sultan {
    private String mMerk;
    private double mCache;

    public Processor1841720019Sultan() {

    }

    public Processor1841720019Sultan(String mMerk, double mCache) {
        this.mMerk = mMerk;
        this.mCache = mCache;
    }

    public String getmMerkSultan() {
        return mMerk;
    }

    public void setmMerkSultan(String mMerk) {
        this.mMerk = mMerk;
    }

    public double getmCacheSultan() {
        return mCache;
    }

    public void setmCacheSultan(double mCache) {
        this.mCache = mCache;
    }

    public void infoSultan() {
        System.out.println("Merk Processor = " + mMerk);
        System.out.printf("Cache Memory = %.2f\n", mCache);
    }

}
