package id.natlus.js4.percobaan4;

public class Gerbong1841720019Sultan {
    private String mKode;
    private Kursi1841720019Sultan[] mArrayKursi;

    private void initKursiSultan() {
        for (int i = 0; i < mArrayKursi.length; i++) {
            this.mArrayKursi[i] = new Kursi1841720019Sultan(String.valueOf(i + 1));
        }
    }

    public Gerbong1841720019Sultan(String mKode, int jumlah) {
        this.mKode = mKode;
        this.mArrayKursi = new Kursi1841720019Sultan[jumlah];
        this.initKursiSultan();
    }

    public String getmKodeSultan() {
        return mKode;
    }

    public void setmKodeSultan(String mKode) {
        this.mKode = mKode;
    }

    public Kursi1841720019Sultan[] getmArrayKursiSultan() {
        return mArrayKursi;
    }

    public String infoSultan() {
        String info = "";
        info += "Kode: " + mKode + "\n";
        for (Kursi1841720019Sultan kursi : mArrayKursi) {
            info += kursi.infoSultan();
        }
        return info;
    }

    public void setPenumpangSultan(Penumpang1841720019Sultan penumpang, int nomor) {
//        Percobaan 4
//        this.mArrayKursi[nomor - 1].setmPenumpangSultan(penumpang);

//        Pertanyaan 5 Percobaan 4
        if (mArrayKursi[nomor - 1].getmPenumpangSultan() != null)
            System.out.println("Maaf, kursi nomor " + nomor + " sudah ada orangnya, silahkan pilih kursi lain");
        else
            this.mArrayKursi[nomor - 1].setmPenumpangSultan(penumpang);
    }
}
