package id.natlus.js10.percobaan;

public class ElectricityBill1841720019Sultan extends Employee1841720019Sultan implements IPayable1841720019Sultan {
    private int mKwh;
    private String mCategory;

    public ElectricityBill1841720019Sultan(int mKwh, String mCategory) {
        this.mKwh = mKwh;
        this.mCategory = mCategory;
    }

    public int getmKwhSultan() {
        return mKwh;
    }

    public void setmKwhSultan(int mKwh) {
        this.mKwh = mKwh;
    }

    public String getmCategorySultan() {
        return mCategory;
    }

    public void setmCategorySultan(String mCategory) {
        this.mCategory = mCategory;
    }

    @Override
    public int getPaymentAmountSultan() {
        return mKwh + getBasePriceSultan();
    }

    public int getBasePriceSultan() {
        int bPrice = 0;
        switch (mCategory) {
            case "R-1":
                bPrice = 100;
                break;
            case "R-2":
                bPrice = 200;
                break;
            default:
                break;
        }
        return bPrice;
    }

    public String getBillInfoSultan() {
        return "kWH = " + mKwh + "\n" + "Category = " + mCategory + "(" + getBasePriceSultan() + " per kWH)\n";
    }
}
