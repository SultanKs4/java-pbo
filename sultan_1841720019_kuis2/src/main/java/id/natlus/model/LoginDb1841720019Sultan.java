package id.natlus.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDb1841720019Sultan extends Database1841720019Sultan {
    public boolean checkLoginDataSultan(String username, String password) {
        boolean tf = false;
        try {
            openConnectionSultan();
            Statement s = mConnection.createStatement();
            String query = "SELECT * FROM login WHERE username = '" + username + "' AND password = '" + password + "'";
            ResultSet r = s.executeQuery(query);
            if (r.next()) {
                if (username.equals(r.getString("username")) && password.equals(r.getString("password"))) {
                    tf = true;
                }
            }
            r.close();
            s.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tf;
    }
}
