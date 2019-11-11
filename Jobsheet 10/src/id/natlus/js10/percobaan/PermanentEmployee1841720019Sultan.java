package id.natlus.js10.percobaan;

public class PermanentEmployee1841720019Sultan extends Employee1841720019Sultan
    implements IPayable1841720019Sultan {
  private int mSalary;

  public PermanentEmployee1841720019Sultan(String mName, int mSalary) {
    this.mSalary = mSalary;
    this.mName = mName;
  }

  public int getmSalarySultan() {
    return mSalary;
  }

  public void setmSalarySultan(int mSalary) {
    this.mSalary = mSalary;
  }

  @Override
  public int getPaymentAmountSultan() {
    return (int) (mSalary + 0.05 * mSalary);
  }

  @Override
  public String getEmployeeInfoSultan() {
    String info = super.getEmployeeInfoSultan() + "\n";
    info += "Registered as Permanent employee with salary " + mSalary + "\n";
    return info;
  }
}
