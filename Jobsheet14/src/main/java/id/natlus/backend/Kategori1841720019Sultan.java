package id.natlus.backend;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Kategori1841720019Sultan {
    private int mIdkategori;
    private String mNama;
    private String mKeterangan;

    public Kategori1841720019Sultan() {
    }

    public Kategori1841720019Sultan(String mNama, String mKeterangan) {
        this.mNama = mNama;
        this.mKeterangan = mKeterangan;
    }

    public int getmIdkategoriSultan() {
        return mIdkategori;
    }

    public void setmIdkategoriSultan(int mIdkategori) {
        this.mIdkategori = mIdkategori;
    }

    public String getmNamaSultan() {
        return mNama;
    }

    public void setmNamaSultan(String mNama) {
        this.mNama = mNama;
    }

    public String getmKeteranganSultan() {
        return mKeterangan;
    }

    public void setmKeteranganSultan(String mKeterangan) {
        this.mKeterangan = mKeterangan;
    }

    public Kategori1841720019Sultan getByIdSultan(int id) {
        Kategori1841720019Sultan kat = new Kategori1841720019Sultan();
        ResultSet rs = DBHelper1841720019Sultan.selectQuerySultan("SELECT * FROM kategori " + " WHERE idkategori = '" + id + "'");

        try {
            while (rs.next()) {
                kat = new Kategori1841720019Sultan();
                kat.setmIdkategoriSultan(rs.getInt("idkategori"));
                kat.setmNamaSultan(rs.getString("nama"));
                kat.setmKeteranganSultan(rs.getString("keterangan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }

    public ArrayList<Kategori1841720019Sultan> getAllSultan() {
        ArrayList<Kategori1841720019Sultan> ListKategori = new ArrayList<>();

        ResultSet rs = DBHelper1841720019Sultan.selectQuerySultan("SELECT * FROM kategori");

        try {
            while (rs.next()) {
                Kategori1841720019Sultan kat = new Kategori1841720019Sultan();
                kat.setmIdkategoriSultan(rs.getInt("idkategori"));
                kat.setmNamaSultan(rs.getString("nama"));
                kat.setmKeteranganSultan(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public ArrayList<Kategori1841720019Sultan> searchSultan(String keyword) {
        ArrayList<Kategori1841720019Sultan> ListKategori = new ArrayList<>();

        String sql = "SELECT * FROM kategori WHERE " + " nama LIKE '%" + keyword + "%' " + " OR keterangan LIKE '%" + keyword + "%' ";

        ResultSet rs = DBHelper1841720019Sultan.selectQuerySultan(sql);

        try {
            while (rs.next()) {
                Kategori1841720019Sultan kat = new Kategori1841720019Sultan();
                kat.setmIdkategoriSultan(rs.getInt("idkategori"));
                kat.setmNamaSultan(rs.getString("nama"));
                kat.setmKeteranganSultan(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public void saveSultan() {
        if (getByIdSultan(mIdkategori).getmIdkategoriSultan() == 0) {
            String SQL = "INSERT INTO kategori (nama,keterangan) VALUES("
                    + " '" + this.mNama + "', "
                    + " '" + this.mKeterangan + "' "
                    + " )";
            this.mIdkategori = DBHelper1841720019Sultan.insertQueryGetIdSultan(SQL);
        } else {
            String SQL = "UPDATE kategori SET"
                    + " nama = '" + this.mNama + "', "
                    + " keterangan = '" + this.mKeterangan + "' "
                    + "WHERE idKategori = '" + this.mIdkategori + "'";
            DBHelper1841720019Sultan.executeQuerySultan(SQL);
        }
    }

    public void deleteSultan() {
        String SQL = "DELETE FROM kategori WHERE idKategori = '" + this.mIdkategori + "'";
        DBHelper1841720019Sultan.executeQuerySultan(SQL);
    }
}
