package id.natlus.quiz1.mesincuci;

import id.natlus.quiz1.Warna;

public class MesinCuci2Tabung1841720019Sultan extends MesinCuci1841720019Sultan{
    private int power2;
    public MesinCuci2Tabung1841720019Sultan() {
    }

    public MesinCuci2Tabung1841720019Sultan(Warna warna, int mListrik, int mPower, String mMerk, int power2) {
        super(warna, mListrik, mPower, mMerk);
        this.power2 = power2;
    }

    public int getPower2Sultan() {
        return power2;
    }

    public void setPower2Sultan(int power2) {
        this.power2 = power2;
    }

    @Override
    protected int efisiensiExtSultan(int mListrik, int mPower) {
        return mListrik / (mPower + power2);
    }

    @Override
    public void infoMcSultan() {
        super.infoMcSultan();
        System.out.println("Kemampuan Mesin 2: " + power2);
    }
}
