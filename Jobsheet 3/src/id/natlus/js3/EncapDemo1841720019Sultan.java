package id.natlus.js3;

public class EncapDemo1841720019Sultan {
    private String mName;
    private int mAge;

    public String getmNameSultan() {
        return mName;
    }

    public void setmNameSultan(String mName) {
        this.mName = mName;
    }

    public int getmAgeSultan() {
        return mAge;
    }

    public void setmAgeSultan(int mAge) {
//        Tugas 1
//        this.mAge = Math.min(mAge, 30);

//        Tugas 3
        if (mAge > 30) {
            this.mAge = 30;
        } else
            this.mAge = Math.max(mAge, 18);
    }
}
