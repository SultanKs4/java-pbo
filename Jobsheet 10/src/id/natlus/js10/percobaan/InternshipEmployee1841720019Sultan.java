package id.natlus.js10.percobaan;

public class InternshipEmployee1841720019Sultan extends Employee1841720019Sultan implements IPayable1841720019Sultan {
    private int mLength;

    public InternshipEmployee1841720019Sultan(String mName, int mLength) {
        this.mLength = mLength;
        this.mName = mName;
    }

    public int getmLengthSultan() {
        return mLength;
    }

    public void setmLengthSultan(int mLength) {
        this.mLength = mLength;
    }

    @Override
    public String getEmployeeInfoSultan() {
        String info = super.getEmployeeInfoSultan() + "\n";
        info += "Registered as Internship employee for " + mLength + " month/s\n";
        return info;
    }

    @Override
    public int getPaymentAmountSultan() {
        return 0;
    }
}
