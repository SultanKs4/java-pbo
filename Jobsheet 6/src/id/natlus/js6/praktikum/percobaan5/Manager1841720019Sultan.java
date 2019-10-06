package id.natlus.js6.praktikum.percobaan5;

public class Manager1841720019Sultan extends Karyawan1841720019Sultan {
    private int mTunjangan;

    public Manager1841720019Sultan() {
    }

    public int getmTunjanganSultan() {
        return mTunjangan;
    }

    public void setmTunjanganSultan(int mTunjangan) {
        this.mTunjangan = mTunjangan;
    }

    public void tampilDataManagerSultan() {
        super.tampilDataKaryawanSultan();
        System.out.println("Tunjangan\t\t= " + getmTunjanganSultan());
        System.out.println("Total Gaji\t\t= " + (super.getmGajiSultan() + getmTunjanganSultan()));
    }
}
