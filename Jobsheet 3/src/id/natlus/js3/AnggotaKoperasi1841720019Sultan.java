package id.natlus.js3;

public class AnggotaKoperasi1841720019Sultan {
    private String mNomerKTP;
    private String mNama;
    private int mLimitPinjam;
    private int mSisaLimitPinjam;
    private int mJumlahPinjam;

    public AnggotaKoperasi1841720019Sultan(String mNomerKTP, String mNama, int mLimitPinjam) {
        this.mNomerKTP = mNomerKTP;
        this.mNama = mNama;
        this.mLimitPinjam = mLimitPinjam;
        this.mSisaLimitPinjam = mLimitPinjam;
    }

    public String getmNomerKTP() {
        return mNomerKTP;
    }

    public String getmNamaSultan() {
        return mNama;
    }

    public int getmLimitPinjamSultan() {
        return mLimitPinjam;
    }

    public int getmJumlahPinjamSultan() {
        return mJumlahPinjam;
    }

    public int getmSisaLimitPinjamSultan() {
        return mSisaLimitPinjam;
    }

    void pinjamSultan(int mJumlahPinjam) {
        if (this.mLimitPinjam >= mJumlahPinjam) {
            this.mSisaLimitPinjam -= mJumlahPinjam;
            this.mJumlahPinjam += mJumlahPinjam;
        } else {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }
    }

    void angsurSultan(int mAngsuran) {
        if ((this.mJumlahPinjam - mAngsuran) >= 0) {
//          Tugas 5
            if (mAngsuran >= (0.1 * mJumlahPinjam)) {
                this.mSisaLimitPinjam += mAngsuran;
                this.mJumlahPinjam -= mAngsuran;
            } else
                System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        } else
            System.out.println("Tidak valid");
    }
}
