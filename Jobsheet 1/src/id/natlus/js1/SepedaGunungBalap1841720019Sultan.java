package id.natlus.js1;

public class SepedaGunungBalap1841720019Sultan extends SepedaGunung1841720019Sultan {
    private String mJenisBan;
    private float mPanjangBar;

    public void setmJenisBanSultan(String mJenisBan) {
        this.mJenisBan = mJenisBan;
    }

    public void setmPanjangBarSultan(float mPanjangBar) {
        this.mPanjangBar = mPanjangBar;
    }

    @Override
    public void cetakSatusSultan() {
        super.cetakSatusSultan();
        System.out.println("Jenis Ban: " + mJenisBan);
        System.out.println("Panjang Bar(mm): " + mPanjangBar);
    }
}
