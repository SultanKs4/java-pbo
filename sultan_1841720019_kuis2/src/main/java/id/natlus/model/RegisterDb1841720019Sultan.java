package id.natlus.model;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDb1841720019Sultan extends Database1841720019Sultan {
    public boolean registerSultan(String nama, String nit, String username, String password) {
        boolean tf;
        String query = "INSERT INTO login (nama, nit, username, password) VALUES ('" + nama + "', '" + nit + "', '" + username + "', '" + password + "')";
        try {
            openConnectionSultan();
            PreparedStatement s = mConnection.prepareStatement(query);
            s.executeUpdate();
            tf = true;
            s.close();
        } catch (SQLException e) {
            e.printStackTrace();
            tf = false;
        }
        return tf;
    }
}
