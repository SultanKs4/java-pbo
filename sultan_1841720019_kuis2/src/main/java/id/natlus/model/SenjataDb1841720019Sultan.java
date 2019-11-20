package id.natlus.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SenjataDb1841720019Sultan extends Database1841720019Sultan {
    public ResultSet getDataSenjataSultan() {
        ResultSet r = null;
        try {
            openConnectionSultan();
            Statement s = mConnection.createStatement();
            String query = "SELECT * FROM senjata";
            r = s.executeQuery(query);
            s.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return r;
    }
}
