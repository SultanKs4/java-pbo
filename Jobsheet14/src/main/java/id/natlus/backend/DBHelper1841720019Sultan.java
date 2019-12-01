package id.natlus.backend;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class DBHelper1841720019Sultan {
    private static Connection mKoneksi;

    public static void bukaKoneksiSultan() {
        if (mKoneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/dbperpus";
                String user = "sultan";
                String password = "1U5yPNNWWcqnUEFx";
                DriverManager.registerDriver(new Driver());
                mKoneksi = DriverManager.getConnection(url, user, password);
            } catch (SQLException t) {
                System.out.println("Error koneksi! : " + t.getMessage());
            }
        }
    }

    public static int insertQueryGetIdSultan(String query) {
        bukaKoneksiSultan();
        int num = 0;
        int result = -1;
        try {
            Statement stmt = mKoneksi.createStatement();
            num = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                result = rs.getInt(1);
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            result = 1;
        }
        return result;
    }

    public static boolean executeQuerySultan(String query) {
        bukaKoneksiSultan();
        boolean result = false;
        try {
            Statement stmt = mKoneksi.createStatement();
            stmt.executeUpdate(query);
            result = true;
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static ResultSet selectQuerySultan(String query) {
        bukaKoneksiSultan();
        ResultSet rs = null;

        try {
            Statement stmt = mKoneksi.createStatement();
            rs = stmt.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
}
