package id.natlus.js7.tugas.overloading;

public class Segitiga1841720019Sultan {
    private int mSudut;

    public int totalSudutSultan(int sudutA) {
        return mSudut = 180 - sudutA;
    }

    public int totalSudutSultan(int sudutA, int sudutB) {
        return mSudut = 180 - (sudutA + sudutB);
    }

    public int kelilingSultan(int sisiA, int sisiB, int sisiC) {
        int keliling = sisiA + sisiB + sisiC;
        return keliling;
    }

    public double kelilingSultan(int sisiA, int sisiB) {
        double keliling = Math.sqrt((Math.pow(sisiA, 2) + Math.pow(sisiB, 2)));
        return keliling;
    }
}
