package id.natlus.js7.percobaan1;

public class Karyawan1841720019Sultan {
    private String mNama;
    private String mNip;
    private String mGolongan;
    private double mGaji;

    public String getmNamaSultan() {
        return mNama;
    }

    public void setmNamaSultan(String mNama) {
        this.mNama = mNama;
    }

    public String getmNipSultan() {
        return mNip;
    }

    public void setmNipSultan(String mNip) {
        this.mNip = mNip;
    }

    public String getmGolonganSultan() {
        return mGolongan;
    }

    public void setmGolonganSultan(String mGolongan) {
        this.mGolongan = mGolongan;

        switch (mGolongan.charAt(0)) {
            case '1':
                this.mGaji = 5000000;
                break;
            case '2':
                this.mGaji = 3000000;
                break;
            case '3':
                this.mGaji = 2000000;
                break;
            case '4':
                this.mGaji = 1000000;
                break;
            case '5':
                this.mGaji = 750000;
                break;

        }
    }

    public Double getmGajiSultan() {
        return mGaji;
    }

    public void setmGajiSultan(Double mGaji) {
        this.mGaji = mGaji;
    }
}
