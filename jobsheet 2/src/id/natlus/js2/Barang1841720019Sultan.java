package id.natlus.js2;

public class Barang1841720019Sultan {
    private String mNamaBrg;
    private String mJenisBrg;
    private int mStok;

    public Barang1841720019Sultan(String mNamaBrg, String mJenisBrg, int mStok) {
        this.mNamaBrg = mNamaBrg;
        this.mJenisBrg = mJenisBrg;
        this.mStok = mStok;
    }

    public void tampilBarangSultan(){
        System.out.println("Nama Barang: " + mNamaBrg);
        System.out.println("Jenis Barang: " + mJenisBrg);
        System.out.println("Stok: " + mStok);
    }

//    method dengan argumen dan nilai balik (return)
    public int tambahStokSultan(int mBrgMasuk){
        return mBrgMasuk + mStok;
    }
}
