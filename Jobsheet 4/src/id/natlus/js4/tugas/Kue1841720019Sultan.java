package id.natlus.js4.tugas;

public class Kue1841720019Sultan {
    private String mNamaKue;
    private int mHargaKue;

    public Kue1841720019Sultan() {
    }

    public Kue1841720019Sultan(String mNamaKue, int mHargaKue) {
        this.mNamaKue = mNamaKue;
        this.mHargaKue = mHargaKue;
    }

    public String getmNamaKueSultan() {
        return mNamaKue;
    }

    public void setmNamaKueSultan(String mNamaKue) {
        this.mNamaKue = mNamaKue;
    }

    public int getmHargaKueSultan() {
        return mHargaKue;
    }

    public void setmHargaKueSultan(int mHargaKue) {
        this.mHargaKue = mHargaKue;
    }

    public String infoSultan() {
        String info = "";
        info += "Nama Kue: " + this.mNamaKue + "\n";
        info += "Harga Kue: " + this.mHargaKue;
        return info;
    }
}
