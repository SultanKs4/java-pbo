package id.natlus.js2;

public class Lingkaran1841720019Sultan {
    private static final double PI = Math.PI;
    private double mR;

    public Lingkaran1841720019Sultan(double mR) {
        this.mR = mR;
    }

    public double hitungLuasSultan(){
        return PI * (Math.pow(mR, 2));
    }

    public double hitungKelilingSultan(){
        return 2 * PI * mR;
    }
}
