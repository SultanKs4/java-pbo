package id.natlus.js2;

public class LoanGim1841720019Sultan {
    private int mId;
    private String mNamaMember;
    private String mTitleGame;
    private double mDurasiSewa;
    private double mHargaGame;

    public LoanGim1841720019Sultan(int mId, String mNamaMember, String mTitleGame, double mDurasiSewa, double mHargaGame) {
        this.mId = mId;
        this.mNamaMember = mNamaMember;
        this.mTitleGame = mTitleGame;
        this.mDurasiSewa = mDurasiSewa;
        this.mHargaGame = mHargaGame;
    }

    public void dataTransaksiSultan(){
        System.out.println("ID: " + mId);
        System.out.println("Nama: " + mNamaMember);
        System.out.println("Judul Game: " + mTitleGame);
        System.out.println("Lama Sewa (hari): " + mDurasiSewa);
        System.out.println("Harga Sewa (per hari): " + mHargaGame);
        System.out.println("Total: " + hitungHargaSultan(mDurasiSewa, mHargaGame));
    }

    private double hitungHargaSultan(double mDurasiSewa, double mHargaGame){
        return mDurasiSewa * mHargaGame;
    }
}

