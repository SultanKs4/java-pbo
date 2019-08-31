package id.natlus.js1;

public class SepedaGunung1841720019Sultan extends Sepeda1841720019Sultan {
    private String mTipeSuspensi;

    public void setTipeSuspensiSultan(String newValue) {
        mTipeSuspensi = newValue;
    }

    @Override
    public void cetakSatusSultan() {
        super.cetakSatusSultan();
        System.out.println("Tipe Suspensi: " + mTipeSuspensi);
    }
}
