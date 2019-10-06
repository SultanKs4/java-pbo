package id.natlus.js6.praktikum.tugas;

public class Mac1841720019Sultan extends Laptop1841720019Sultan {
    private String mSecurity;

    public Mac1841720019Sultan() {
    }

    public Mac1841720019Sultan(String mMerk, int mKecProcessor, int mSizeMemory, String mJnsProcessor, String mJnsBaterai, String mSecurity) {
        super(mMerk, mKecProcessor, mSizeMemory, mJnsProcessor, mJnsBaterai);
        this.mSecurity = mSecurity;
    }

    public String getmSecuritySultan() {
        return mSecurity;
    }

    public void setmSecuritySultan(String mSecurity) {
        this.mSecurity = mSecurity;
    }

    public void tampilMacSultan() {
        System.out.println("====================MAC====================");
        super.tampilLaptopSultan();
        System.out.println("Security: " + getmSecuritySultan());
    }
}
