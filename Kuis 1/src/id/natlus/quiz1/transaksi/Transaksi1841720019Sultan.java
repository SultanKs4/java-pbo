package id.natlus.quiz1.transaksi;

import id.natlus.quiz1.mesincuci.MesinCuci1841720019Sultan;
import id.natlus.quiz1.mesincuci.MesinCuci2Tabung1841720019Sultan;

public class Transaksi1841720019Sultan {
    MesinCuci1841720019Sultan mesincuci;
    MesinCuci2Tabung1841720019Sultan mesincuci2tabung;
    private int mJumlah;
    private int mHarga;

    public Transaksi1841720019Sultan() {
    }

    public Transaksi1841720019Sultan(MesinCuci1841720019Sultan mesincuci, int jumlah, int mHarga) {
        this.mesincuci = mesincuci;
        this.mJumlah = jumlah;
        this.mHarga = mHarga;
    }

    public Transaksi1841720019Sultan(MesinCuci2Tabung1841720019Sultan mesincuci2tabung, int mJumlah, int mHarga) {
        this.mesincuci2tabung = mesincuci2tabung;
        this.mJumlah = mJumlah;
        this.mHarga = mHarga;
    }

    public int getmHargaSultan() {
        return mHarga;
    }

    public void setmHargaSultan(int mHarga) {
        this.mHarga = mHarga;
    }

    public int getmJumlahSultan() {
        return mJumlah;
    }

    public void setmJumlahSultan(int mJumlah) {
        this.mJumlah = mJumlah;
    }

    public MesinCuci1841720019Sultan getMesincuciSultan() {
        return mesincuci;
    }

    public void setMesincuciSultan(MesinCuci1841720019Sultan mesincuci) {
        this.mesincuci = mesincuci;
    }

    public MesinCuci2Tabung1841720019Sultan getMesincuci2tabungSultan() {
        return mesincuci2tabung;
    }

    public void setMesincuci2tabungSultan(MesinCuci2Tabung1841720019Sultan mesincuci2tabung) {
        this.mesincuci2tabung = mesincuci2tabung;
    }

    public double diskonSultan(int mHarga){
        return 0.2 * mHarga;
    }

    public void totalHargaSultan(int jumlah){
        System.out.println("Total: " + diskonSultan(mHarga));
    }
    void infoHargaSultan(){
        System.out.println("Harga: " + mHarga);
    }

    public void infoSultan(){
        if (mesincuci!=null)
            mesincuci.infoMcSultan();
        else if (mesincuci2tabung!=null)
            mesincuci2tabung.infoMcSultan();
        infoHargaSultan();
        totalHargaSultan(mJumlah);
    }
}
