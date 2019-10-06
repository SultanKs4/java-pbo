package id.natlus.js6.praktikum.percobaan2;

public class ClassB1841720019Sultan extends ClassA1841720019Sultan {
    private int mZ;

    public void setmZSultan(int mZ) {
        this.mZ = mZ;
    }

    public void getNilaiZSultan() {
        System.out.println("Nilai Z: " + mZ);
    }

    public void getJumlahSultan() {
        System.out.println("Jumlah: " + (getmXSultan() + getmYSultan() + mZ));
    }
}
