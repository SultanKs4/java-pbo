package id.natlus.percobaan4;

import java.util.ArrayList;

public class InputData1841720019Sultan {
    ArrayList<Mahasiswa1841720019Sultan> listMahasiswa;

    public ArrayList<Mahasiswa1841720019Sultan> getDataSultan() {
        return listMahasiswa;
    }

    public InputData1841720019Sultan() {
        listMahasiswa = new ArrayList<>();
    }

    public void isiDataSultan(String mNim, String mNama, String mAlamat) {
        Mahasiswa1841720019Sultan mhs = new Mahasiswa1841720019Sultan(mNim, mNama, mAlamat);
        listMahasiswa.add(mhs);
    }

}
