package id.natlus.js4.percobaan4;

public class Penumpang1841720019Sultan {
    private String mKtp;
    private String mNama;

    public Penumpang1841720019Sultan(String mKtp, String mNama) {
        this.mKtp = mKtp;
        this.mNama = mNama;
    }

    public String getmKtpSultan() {
        return mKtp;
    }

    public void setmKtpSultan(String mKtp) {
        this.mKtp = mKtp;
    }

    public String getmNamaSultan() {
        return mNama;
    }

    public void setmNamaSultan(String mNama) {
        this.mNama = mNama;
    }

    public String infoSultan() {
        String info = "";
        info += "Ktp: " + mKtp + "\n";
        info += "Nama: " + mNama + "\n";
        return info;
    }
}
