package id.natlus.js2;

public class BarangTugas41841720019Sultan {
    private String mKode;
    private String mNamaBarang;
    private int mHargaDasar;
    private float mDiskon;

    public BarangTugas41841720019Sultan(String mKode,
                                        String mNamaBarang,
                                        int mHargaDasar,
                                        float mDiskon) {
        this.mKode = mKode;
        this.mNamaBarang = mNamaBarang;
        this.mHargaDasar = mHargaDasar;
        this.mDiskon = mDiskon;
    }

    public void tampilDataSultan(){
        System.out.println("Kode: " + mKode);
        System.out.println("Nama Barang: " + mNamaBarang);
        System.out.println("Harga Dasar (Rp): " + mHargaDasar);
        System.out.println("Diskon (%): " + mDiskon);
        System.out.println("Harga Jual (Rp): " + hitungHargaJualSultan(mHargaDasar, mDiskon));
    }

    private int hitungHargaJualSultan(int mHargaDasar,
                                      float mDiskon){
        return  Math.round(mHargaDasar - ((mDiskon / 100)
                * mHargaDasar));
    }
}
