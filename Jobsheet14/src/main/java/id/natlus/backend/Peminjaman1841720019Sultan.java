package id.natlus.backend;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Peminjaman1841720019Sultan {
    private int mIdpeminjaman, mIdanggota, mIdbuku;
    private Anggota1841720019Sultan mAnggota = new Anggota1841720019Sultan();
    private Buku1841720019Sultan mBuku = new Buku1841720019Sultan();
    private String mTanggalPinjam;
    private String mTanggalKembali;

    public Peminjaman1841720019Sultan() {

    }

    public Peminjaman1841720019Sultan(Anggota1841720019Sultan anggota, Buku1841720019Sultan buku, String tanggalpinjam, String tanggalkembali) {
        this.mAnggota = anggota;
        this.mBuku = buku;
        this.mTanggalPinjam = tanggalpinjam;
        this.mTanggalKembali = tanggalkembali;
    }

    public int getmIdanggotaSultan() {
        return mIdanggota;
    }

    public void setmIdanggotaSultan(int mIdanggota) {
        this.mIdanggota = mIdanggota;
    }

    public int getmIdbukuSultan() {
        return mIdbuku;
    }

    public void setmIdbukuSultan(int mIdbuku) {
        this.mIdbuku = mIdbuku;
    }

    public int getmIdpeminjamanSultan() {
        return mIdpeminjaman;
    }

    public void setmIdpeminjamanSultan(int mIdpeminjaman) {
        this.mIdpeminjaman = mIdpeminjaman;
    }

    public Anggota1841720019Sultan getmAnggotaSultan() {
        return mAnggota;
    }

    public void setmAnggotaSultan(Anggota1841720019Sultan mAnggota) {
        this.mAnggota = mAnggota;
    }

    public Buku1841720019Sultan getmBukuSultan() {
        return mBuku;
    }

    public void setmBukuSultan(Buku1841720019Sultan mBuku) {
        this.mBuku = mBuku;
    }

    public String getmTanggalPinjamSultan() {
        return mTanggalPinjam;
    }

    public void setmTanggalPinjamSultan(String mTanggalPinjam) {
        this.mTanggalPinjam = mTanggalPinjam;
    }

    public String getmTanggalKembaliSultan() {
        return mTanggalKembali;
    }

    public void setmTanggalKembaliSultan(String mTanggalKembali) {
        this.mTanggalKembali = mTanggalKembali;
    }

    public Peminjaman1841720019Sultan getByIdSultan(int id) {
        Peminjaman1841720019Sultan pinjam = new Peminjaman1841720019Sultan();
        ResultSet rs = DBHelper1841720019Sultan.selectQuerySultan("SELECT "
                + " p.idpeminjaman AS idpeminjaman, "
                + " p.tanggalpinjam AS tanggalpinjam, "
                + " p.tanggalkembali AS tanggalkembali, "
                + " a.idanggota AS idanggota, "
                + " b.idbuku AS idbuku "
                + " FROM peminjaman p LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                + " LEFT JOIN buku b ON p.idbuku = b.idbuku WHERE p.idpeminjaman = '" + id + "'");

        try {
            while (rs.next()) {
                pinjam = new Peminjaman1841720019Sultan();
                pinjam.setmIdpeminjamanSultan(rs.getInt("idpeminjaman"));
                pinjam.setmIdanggotaSultan(rs.getInt("idanggota"));
                pinjam.setmIdbukuSultan(rs.getInt("idbuku"));
                pinjam.setmTanggalPinjamSultan(rs.getString("tanggalpinjam"));

                pinjam.setmTanggalKembaliSultan(rs.getString("tanggalkembali"));
                pinjam.setmAnggotaSultan(new Anggota1841720019Sultan().getByIdSultan(getmIdanggotaSultan()));
                pinjam.setmBukuSultan(new Buku1841720019Sultan().getByIdSultan(pinjam.getmIdbukuSultan()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pinjam;
    }

    public ArrayList<Peminjaman1841720019Sultan> getAllSultan() {
        ArrayList<Peminjaman1841720019Sultan> ListPinjam = new ArrayList<>();
        ResultSet rs = DBHelper1841720019Sultan.selectQuerySultan("SELECT "
                + "p.idpeminjaman AS idpeminjaman, "
                + "p.tanggalpinjam AS tanggalpinjam, "
                + "p.tanggalkembali AS tanggalkembali, "
                + "a.idanggota AS idanggota, "
                + "b.idbuku AS idbuku "
                + "FROM peminjaman p LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                + "LEFT JOIN buku b ON p.idbuku = b.idbuku");
        try {
            while (rs.next()) {
                Peminjaman1841720019Sultan pinjam = new Peminjaman1841720019Sultan();
                pinjam.setmIdpeminjamanSultan(rs.getInt("idpeminjaman"));
                pinjam.setmIdanggotaSultan(rs.getInt("idanggota"));
                pinjam.setmIdbukuSultan(rs.getInt("idbuku"));
                pinjam.setmTanggalPinjamSultan(rs.getString("tanggalpinjam"));

                pinjam.setmTanggalKembaliSultan(rs.getString("tanggalkembali"));
                pinjam.setmAnggotaSultan(new Anggota1841720019Sultan().getByIdSultan(pinjam.getmIdanggotaSultan()));
                pinjam.setmBukuSultan(new Buku1841720019Sultan().getByIdSultan(pinjam.getmIdbukuSultan()));

                ListPinjam.add(pinjam);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPinjam;
    }

    public void saveSultan() {
        if (getByIdSultan(mIdpeminjaman).getmIdpeminjamanSultan() == 0) {
            String sql = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) "
                    + "values ("
                    + "'" + this.getmAnggotaSultan().getmIdAnggotaSultan() + "', "
                    + "'" + this.getmBukuSultan().getmIdBukuSultan() + "',"
                    + "'" + this.mTanggalPinjam + "', "
                    + "'" + this.mTanggalKembali + "' "
                    + ")";
            this.mIdpeminjaman = DBHelper1841720019Sultan.insertQueryGetIdSultan(sql);
        } else {
            String sql = "UPDATE buku SET "
                    + "idanggota = '" + this.getmAnggotaSultan().getmIdAnggotaSultan() + "', "
                    + "idbuku = '" + this.getmBukuSultan().getmIdBukuSultan() + "', "
                    + "tanggalpinjam = '" + this.mTanggalPinjam + "', "
                    + "tanggalkembali = '" + this.mTanggalKembali + "'";
            DBHelper1841720019Sultan.executeQuerySultan(sql);
        }
    }

    public void cariAnggotaSultan(int id) {
        ResultSet rs = DBHelper1841720019Sultan.selectQuerySultan("SELECT * FROM anggota WHERE idanggota = '" + id + "'");

        try {
            while (rs.next()) {
                getmAnggotaSultan().setmIdAnggotaSultan(rs.getInt("idanggota"));
                getmAnggotaSultan().setmNamaSultan(rs.getString("nama"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cariBukuSultan(int id) {
        ResultSet rs = DBHelper1841720019Sultan.selectQuerySultan("SELECT * FROM buku WHERE idbuku = '" + id + "'");

        try {
            while (rs.next()) {
                getmBukuSultan().setmIdBukuSultan(rs.getInt("idbuku"));
                getmBukuSultan().setmJudulSultan(rs.getString("judul"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteSultan() {
        String sql = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.mIdpeminjaman + "'";
        DBHelper1841720019Sultan.executeQuerySultan(sql);
    }
}