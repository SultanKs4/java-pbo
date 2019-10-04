package id.natlus.quiz1.mesincuci;

import id.natlus.quiz1.Warna;

public class MesinCuci1841720019Sultan{
    Warna warna;
    protected int mListrik;
    int mPower;
    private String mMerk;

    public MesinCuci1841720019Sultan() {
    }

    public MesinCuci1841720019Sultan(Warna warna, int mListrik, int mPower, String mMerk) {
        this.warna = warna;
        this.mListrik = mListrik;
        this.mPower = mPower;
        this.mMerk = mMerk;
    }

    public int getmPowerSultan() {
        return mPower;
    }

    public void setmPowerSultan(int mPower) {
        this.mPower = mPower;
    }

    public String getmMerkSultan() {
        return mMerk;
    }

    public void setmMerkSultan(String mMerk) {
        this.mMerk = mMerk;
    }

    public void infoMcSultan(){
        System.out.println("Merk: " + getmMerkSultan());
        infoWarnaSultan(warna);
        infoListrikSultan();
        System.out.println("Kemampuan: " + getmPowerSultan());
        System.out.println(infoEfisiensiSultan());
    }

    private void infoWarnaSultan(Warna warna){
        System.out.println("Warna: " + warna);
    }

    protected void infoListrikSultan(){
        System.out.println("Listrik: " + mListrik);
    }

    String infoEfisiensiSultan(){
        return "Perkiraan Efisiensi: " + efisiensiSultan();
    }

    protected int efisiensiExtSultan(int mListrik, int mPower){
        return mListrik / mPower;
    }

    private int efisiensiSultan(){
        return efisiensiExtSultan(mListrik, mPower);
    }
}
