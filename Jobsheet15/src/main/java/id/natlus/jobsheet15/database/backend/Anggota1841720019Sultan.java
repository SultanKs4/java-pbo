package id.natlus.jobsheet15.database.backend;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Anggota1841720019Sultan {
    private int mIdAnggota;
    private String mNama;
    private String mAlamat;
    private String mTelepon;

    public Anggota1841720019Sultan() {
    }

    public Anggota1841720019Sultan(String mNama, String mAlamat, String mTelepon) {
        this.mNama = mNama;
        this.mAlamat = mAlamat;
        this.mTelepon = mTelepon;
    }

    public int getmIdAnggotaSultan() {
        return mIdAnggota;
    }

    public void setmIdAnggotaSultan(int idAnggota) {
        this.mIdAnggota = idAnggota;
    }

    public String getmNamaSultan() {
        return mNama;
    }

    public void setmNamaSultan(String nama) {
        this.mNama = nama;
    }

    public String getmAlamatSultan() {
        return mAlamat;
    }

    public void setmAlamatSultan(String alamat) {
        this.mAlamat = alamat;
    }

    public String getmTeleponSultan() {
        return mTelepon;
    }

    public void setmTeleponSultan(String telepon) {
        this.mTelepon = telepon;
    }

    public Anggota1841720019Sultan getByIdSultan(int id) {
        Anggota1841720019Sultan agt = new Anggota1841720019Sultan();
        ResultSet rs = DBHelper1841720019Sultan.selectQuerySultan("SELECT * FROM anggota " + " WHERE idAnggota = '" + id + "'");

        try {
            while (rs.next()) {
                agt = new Anggota1841720019Sultan();
                agt.setmIdAnggotaSultan(rs.getInt("idAnggota"));
                agt.setmNamaSultan(rs.getString("nama"));
                agt.setmAlamatSultan(rs.getString("alamat"));
                agt.setmTeleponSultan(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return agt;
    }

    public ArrayList<Anggota1841720019Sultan> getAllSultan() {
        ArrayList<Anggota1841720019Sultan> listAnggota1841720019Sultan = new ArrayList<>();

        ResultSet rs = DBHelper1841720019Sultan.selectQuerySultan("SELECT * FROM anggota");

        try {
            while (rs.next()) {
                Anggota1841720019Sultan agt = new Anggota1841720019Sultan();
                agt.setmIdAnggotaSultan(rs.getInt("idAnggota"));
                agt.setmNamaSultan(rs.getString("nama"));
                agt.setmAlamatSultan(rs.getString("alamat"));
                agt.setmTeleponSultan(rs.getString("telepon"));

                listAnggota1841720019Sultan.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listAnggota1841720019Sultan;
    }

    public ArrayList<Anggota1841720019Sultan> searchSultan(String keyword) {
        ArrayList<Anggota1841720019Sultan> listAnggota1841720019Sultan = new ArrayList<>();

        String sql = "Select * from anggota where " + " nama like '%" + keyword + "%' " + " or alamat like '%" + keyword + "%' ";

        ResultSet rs = DBHelper1841720019Sultan.selectQuerySultan(sql);

        try {
            while (rs.next()) {
                Anggota1841720019Sultan agt = new Anggota1841720019Sultan();
                agt.setmIdAnggotaSultan(rs.getInt("idAnggota"));
                agt.setmNamaSultan(rs.getString("nama"));
                agt.setmAlamatSultan(rs.getString("alamat"));
                agt.setmTeleponSultan(rs.getString("telepon"));

                listAnggota1841720019Sultan.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listAnggota1841720019Sultan;
    }

    public void saveSultan() {
        if (getByIdSultan(mIdAnggota).getmIdAnggotaSultan() == 0) {
            String SQL = "Insert into anggota (nama,alamat,telepon) values("
                    + " '" + this.mNama + "', "
                    + " '" + this.mAlamat + "', "
                    + " '" + this.mTelepon + "' "
                    + " )";
            this.mIdAnggota = DBHelper1841720019Sultan.insertQueryGetIdSultan(SQL);
        } else {
            String SQL = "Update anggota set"
                    + " nama = '" + this.mNama + "', "
                    + " alamat = '" + this.mAlamat + "', "
                    + " telepon = '" + this.mTelepon + "' "
                    + "Where idAnggota = '" + this.mIdAnggota + "'";
            DBHelper1841720019Sultan.executeQuerySultan(SQL);
        }
    }

    public void deleteSultan() {
        String SQL = "DELETE FROM anggota WHERE idAnggota = '" + this.mIdAnggota + "'";
        DBHelper1841720019Sultan.executeQuerySultan(SQL);
    }

    public ArrayList<Anggota1841720019Sultan> getByNamaAlamatAndTeleponSultan(String nama, String alamat, String telepon) {
        ArrayList<Anggota1841720019Sultan> ListKategori = new ArrayList<>();
        ResultSet rs;

        if ((nama.trim().length() > 0) && (alamat.trim().length() > 0)) {
            rs = DBHelper1841720019Sultan.selectQuerySultan("SELECT * FROM anggota Where nama = '"
                    + nama + "' and alamat = '" + alamat + "' and telepon = '" + telepon + "'");
        } else if ((nama.trim().length() > 0) && (alamat.trim().length() == 0) && (telepon.trim().length() == 0)) {
            rs = DBHelper1841720019Sultan.selectQuerySultan("SELECT * FROM anggota Where nama = '"
                    + nama + "'");
        } else if ((nama.trim().length() == 0) && (alamat.trim().length() == 0) && (telepon.trim().length() > 0)) {
            rs = DBHelper1841720019Sultan.selectQuerySultan("SELECT * FROM anggota Where telepon = '"
                    + telepon + "'");
        } else {
            rs = DBHelper1841720019Sultan.selectQuerySultan("SELECT * FROM anggota Where alamat'" + alamat + "'  ");
        }

        try {
            while (rs.next()) {
                Anggota1841720019Sultan agt = new Anggota1841720019Sultan();
                agt.setmIdAnggotaSultan(rs.getInt("idAnggota"));
                agt.setmNamaSultan(rs.getString("nama"));
                agt.setmAlamatSultan(rs.getString("alamat"));
                agt.setmTeleponSultan(rs.getString("telepon"));
                ListKategori.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }
}
