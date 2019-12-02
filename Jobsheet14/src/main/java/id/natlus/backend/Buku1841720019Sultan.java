package id.natlus.backend;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Buku1841720019Sultan {

    private int mIdBuku;
    private Kategori1841720019Sultan mKategori = new Kategori1841720019Sultan();
    private String mJudul;
    private String mPenerbit;
    private String mPenulis;

    public Buku1841720019Sultan() {
    }

    public Buku1841720019Sultan(Kategori1841720019Sultan mKategori, String mJudul, String mPenerbit, String mPenulis) {
        this.mKategori = mKategori;
        this.mJudul = mJudul;
        this.mPenerbit = mPenerbit;
        this.mPenulis = mPenulis;
    }

    public int getmIdBukuSultan() {
        return mIdBuku;
    }

    public void setmIdBukuSultan(int mIdBuku) {
        this.mIdBuku = mIdBuku;
    }

    public Kategori1841720019Sultan getmKategoriSultan() {
        return mKategori;
    }

    public void setmKategoriSultan(Kategori1841720019Sultan mKategori) {
        this.mKategori = mKategori;
    }

    public String getmJudulSultan() {
        return mJudul;
    }

    public void setmJudulSultan(String mJudul) {
        this.mJudul = mJudul;
    }

    public String getmPenerbitSultan() {
        return mPenerbit;
    }

    public void setmPenerbitSultan(String mPenerbit) {
        this.mPenerbit = mPenerbit;
    }

    public String getmPenulisSultan() {
        return mPenulis;
    }

    public void setmPenulisSultan(String mPenulis) {
        this.mPenulis = mPenulis;
    }


    public Buku1841720019Sultan getByIdSultan(int id) {
        Buku1841720019Sultan buku = new Buku1841720019Sultan();
        ResultSet rs = DBHelper1841720019Sultan.selectQuerySultan("SELECT "
                + "    b.idbuku as idbuku, "
                + "    b.judul as judul,"
                + "    b.penerbit as penerbit, "
                + "    b.penulis as penulis, "
                + "    k.idkategori as idkategori, "
                + "    k.nama as nama, "
                + "    k.keterangan as keterangan"
                + "    FROM buku b "
                + "    LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                + "    where b.idbuku = '" + id + "'");
        try {
            while (rs.next()) {
                buku = new Buku1841720019Sultan();
                buku.setmIdBukuSultan(rs.getInt("idBuku"));
                buku.getmKategoriSultan().setmIdkategoriSultan(rs.getInt("idkategori"));
                buku.getmKategoriSultan().setmNamaSultan(rs.getString("nama"));
                buku.getmKategoriSultan().setmKeteranganSultan(rs.getString("keterangan"));
                buku.setmJudulSultan(rs.getString("judul"));
                buku.setmPenerbitSultan(rs.getString("penerbit"));
                buku.setmPenulisSultan(rs.getString("penulis"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buku;
    }

    public ArrayList<Buku1841720019Sultan> getAllSultan() {
        ArrayList<Buku1841720019Sultan> listBuku1841720019Sultan = new ArrayList<>();
        ResultSet rs = DBHelper1841720019Sultan.selectQuerySultan("SELECT "
                + "    b.idbuku as idbuku, "
                + "    b.judul as judul, "
                + "    b.penerbit as penerbit,"
                + "    b.penulis as penulis, "
                + "    k.idkategori as idkategori, "
                + "    k.nama as nama, "
                + "    k.keterangan as keterangan "
                + "    FROM buku b "
                + "    LEFT JOIN kategori k ON b.idkategori = k.idkategori ");
        try {
            while (rs.next()) {
                Buku1841720019Sultan buku = new Buku1841720019Sultan();
                buku.setmIdBukuSultan(rs.getInt("idbuku"));
                buku.getmKategoriSultan().setmIdkategoriSultan(rs.getInt("idkategori"));
                buku.getmKategoriSultan().setmNamaSultan(rs.getString("nama"));
                buku.getmKategoriSultan().setmKeteranganSultan(rs.getString("keterangan"));
                buku.setmJudulSultan(rs.getString("judul"));
                buku.setmPenerbitSultan(rs.getString("penerbit"));
                buku.setmPenulisSultan(rs.getString("penulis"));

                listBuku1841720019Sultan.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listBuku1841720019Sultan;
    }

    public ArrayList<Buku1841720019Sultan> searchSultan(String keyword) {
        ArrayList<Buku1841720019Sultan> listBuku1841720019Sultan = new ArrayList<>();

        ResultSet rs = DBHelper1841720019Sultan.selectQuerySultan("Select "
                + "    b.idBuku as idbuku,"
                + "    b.judul as judul,"
                + "    b.penerbit as penerbit,"
                + "    b.penulis as penulis,"
                + "    k.idkategori as idkategori,"
                + "    k.nama as nama,"
                + "    k.keterangan as keterangan "
                + "    FROM buku b "
                + "    left join kategori k on b.idkategori = k.idkategori "
                + "    where b.judul like '%" + keyword + "%' "
                + "    OR b.penerbit like '%" + keyword + "%' "
                + "    OR b.penulis LIKE '%" + keyword + "%' ");
        try {
            while (rs.next()) {
                Buku1841720019Sultan buku = new Buku1841720019Sultan();
                buku.setmIdBukuSultan(rs.getInt("idbuku"));
                buku.getmKategoriSultan().setmIdkategoriSultan(rs.getInt("idkategori"));
                buku.getmKategoriSultan().setmNamaSultan(rs.getString("nama"));
                buku.getmKategoriSultan().setmKeteranganSultan(rs.getString("keterangan"));
                buku.setmJudulSultan(rs.getString("judul"));
                buku.setmPenerbitSultan(rs.getString("penerbit"));
                buku.setmPenerbitSultan(rs.getString("penulis"));

                listBuku1841720019Sultan.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listBuku1841720019Sultan;
    }

    public void saveSultan() {
        if (getByIdSultan(mIdBuku).getmIdBukuSultan() == 0) {
            String SQL = "INSERT INTO buku (idkategori, judul, penulis, penerbit) VALUES("
                    + " '" + this.getmKategoriSultan().getmIdkategoriSultan() + "', "
                    + " '" + this.mJudul + "', "
                    + " '" + this.mPenulis + "', "
                    + " '" + this.mPenerbit + "' "
                    + " )";
            this.mIdBuku = DBHelper1841720019Sultan.insertQueryGetIdSultan(SQL);
        } else {
            String SQL = "UPDATE buku set "
                    + " idkategori = '" + this.getmKategoriSultan().getmIdkategoriSultan() + "', "
                    + " judul = '" + this.mJudul + "', "
                    + " penulis = '" + this.mPenulis + "', "
                    + " penerbit = '" + this.mPenerbit + "' "
                    + " WHERE idbuku = '" + this.mIdBuku + "'";
            DBHelper1841720019Sultan.executeQuerySultan(SQL);
        }
    }

    public void deleteSultan() {
        String SQL = "DELETE FROM buku where idbuku = '" + this.mIdBuku + "'";
        DBHelper1841720019Sultan.executeQuerySultan(SQL);
    }
}
