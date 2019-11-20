package id.natlus.js2;

public class Mahasiswa1841720019Sultan {
    private int mNim;
    private String mNama;
    private String mAlamat;
    private String mKelas;

    Mahasiswa1841720019Sultan(int mNim, String mNama, String mAlamat, String mKelas) {
        this.mNim = mNim;
        this.mNama = mNama;
        this.mAlamat = mAlamat;
        this.mKelas = mKelas;
    }

    public void tampilBiodataSultan(){
        System.out.println("NIM: " + mNim);
        System.out.println("Nama: " + mNama);
        System.out.println("Alamat: " + mAlamat);
        System.out.println("Kelas: " + mKelas);
        System.out.println();
    }
}
