package id.natlus.js4.percobaan3;

public class Pegawai1841720019Sultan {
    private String mNip;
    private String mNama;

    public Pegawai1841720019Sultan(String mNip, String mNama) {
        this.mNip = mNip;
        this.mNama = mNama;
    }

    public String getmNipSultan() {
        return mNip;
    }

    public void setmNipSultan(String mNip) {
        this.mNip = mNip;
    }

    public String getmNamaSultan() {
        return mNama;
    }

    public void setmNamaSultan(String mNama) {
        this.mNama = mNama;
    }

    public String infoSultan() {
        String info = "";
        info += "Nip: " + this.mNip + "\n";
        info += "Nama: " + this.mNama + "\n";
        return info;
    }
}
