package id.natlus.js4.percobaan3;

public class KeretaApi1841720019Sultan {
    private String mNama;
    private String mKelas;
    private Pegawai1841720019Sultan mMasinis;
    private Pegawai1841720019Sultan mAsisten;

    public KeretaApi1841720019Sultan(String mNama, String mKelas, Pegawai1841720019Sultan mMasinis) {
        this.mNama = mNama;
        this.mKelas = mKelas;
        this.mMasinis = mMasinis;
    }

    public KeretaApi1841720019Sultan(String mNama, String mKelas, Pegawai1841720019Sultan mMasinis, Pegawai1841720019Sultan mAsisten) {
        this.mNama = mNama;
        this.mKelas = mKelas;
        this.mMasinis = mMasinis;
        this.mAsisten = mAsisten;
    }

    public String getmNamaSultan() {
        return mNama;
    }

    public void setmNamaSultan(String mNama) {
        this.mNama = mNama;
    }

    public String getmKelasSultan() {
        return mKelas;
    }

    public void setmKelasSultan(String mKelas) {
        this.mKelas = mKelas;
    }

    public Pegawai1841720019Sultan getmMasinisSultan() {
        return mMasinis;
    }

    public void setmMasinisSultan(Pegawai1841720019Sultan mMasinis) {
        this.mMasinis = mMasinis;
    }

    public Pegawai1841720019Sultan getmAsistenSultan() {
        return mAsisten;
    }

    public void setmAsistenSultan(Pegawai1841720019Sultan mAsisten) {
        this.mAsisten = mAsisten;
    }

    public String infoSultan() {
        String info = "";
        info += "Nama: " + this.mNama + "\n";
        info += "Kelas: " + this.mKelas + "\n";
        info += "Masinis: " + this.mMasinis.infoSultan() + "\n";
//        info += "Asisten: " + this.mAsisten.infoSultan() + "\n";

//        Pertanyaan Nomor 4
        if (this.mAsisten != null)
            info += "Asisten: " + this.mAsisten.infoSultan() + "\n";
        return info;
    }
}
