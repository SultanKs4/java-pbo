package id.natlus.js10.tugas;

public class Barrier1841720019Sultan implements Destroyable1841720019Sultan {
    private int mStrength;

    public Barrier1841720019Sultan(int mStrength) {
        this.mStrength = mStrength;
    }

    public int getmStrengthSultan() {
        return mStrength;
    }

    public void setmStrengthSultan(int mStrength) {
        this.mStrength = mStrength;
    }

    @Override
    public void destroyedSultan() {
        mStrength -= (mStrength * 0.1);
    }

    public String getBarrierInfoSultan() {
        return "Barrier Strength = " + mStrength + "\n";
    }
}
