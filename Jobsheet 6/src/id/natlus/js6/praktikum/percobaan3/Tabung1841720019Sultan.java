package id.natlus.js6.praktikum.percobaan3;

public class Tabung1841720019Sultan extends Bangun1841720019Sultan {
    protected int mT;

    public void setSupermPhiSultan(double mPhi) {
        super.mPhi = mPhi;
    }

    public void setSupermRSultan(int mR) {
        super.mR = mR;
    }

    public void setmTSultan(int mT) {
        this.mT = mT;
    }

    public void volumeSultan() {
        System.out.println("Volume Tabung adalah: " + (super.mPhi * Math.pow(super.mR, 2) * this.mT));
    }
}
