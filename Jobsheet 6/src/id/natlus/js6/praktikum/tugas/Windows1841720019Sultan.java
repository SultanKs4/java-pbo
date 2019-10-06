package id.natlus.js6.praktikum.tugas;

public class Windows1841720019Sultan extends Laptop1841720019Sultan {
    private String mFitur;

    public Windows1841720019Sultan() {
    }

    public Windows1841720019Sultan(String mMerk, int mKecProcessor, int mSizeMemory, String mJnsProcessor, String mJnsBaterai, String mFitur) {
        super(mMerk, mKecProcessor, mSizeMemory, mJnsProcessor, mJnsBaterai);
        this.mFitur = mFitur;
    }

    public String getmFiturSultan() {
        return mFitur;
    }

    public void setmFiturSultan(String mFitur) {
        this.mFitur = mFitur;
    }

    public void tampilWindowsSultan() {
        System.out.println("==================WINDOWS==================");
        super.tampilLaptopSultan();
        System.out.println("Fitur: " + getmFiturSultan());
    }
}
