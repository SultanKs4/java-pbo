package id.natlus.js4.tugas;

public class PelangganKue1841720019Sultan {
    private String mNama;
    private String mAlamat;

    public PelangganKue1841720019Sultan(String mNama, String mAlamat) {
        this.mNama = mNama;
        this.mAlamat = mAlamat;
    }

    public PelangganKue1841720019Sultan() {
    }

    public String getmNamaSultan() {
        return mNama;
    }

    public void setmNamaSultan(String mNama) {
        this.mNama = mNama;
    }

    public String getmAlamatSultan() {
        return mAlamat;
    }

    public void setmAlamatSultan(String mAlamat) {
        this.mAlamat = mAlamat;
    }

    public String infoSultan() {
        String info = "";
        info += "Nama: " + this.mNama + "\n";
        info += "Alamat: " + this.mAlamat;
        return info;
    }

}
