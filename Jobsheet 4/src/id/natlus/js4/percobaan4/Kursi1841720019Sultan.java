package id.natlus.js4.percobaan4;

public class Kursi1841720019Sultan {
    private String mNomer;
    private Penumpang1841720019Sultan mPenumpang;

    public Kursi1841720019Sultan(String mNomer) {
        this.mNomer = mNomer;
    }

    public String getmNomerSultan() {
        return mNomer;
    }

    public void setmNomerSultan(String mNomer) {
        this.mNomer = mNomer;
    }

    public Penumpang1841720019Sultan getmPenumpangSultan() {
        return mPenumpang;
    }

    public void setmPenumpangSultan(Penumpang1841720019Sultan mPenumpang) {
        this.mPenumpang = mPenumpang;
    }

    public String infoSultan() {
        String info = "";
        info += "Nomor: " + mNomer + "\n";
        if (mPenumpang != null) {
            info += "Penumpang; " + mPenumpang.infoSultan() + "\n";
        }
        return info;
    }
}
