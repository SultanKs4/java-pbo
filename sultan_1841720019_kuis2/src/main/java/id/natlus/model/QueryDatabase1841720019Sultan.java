package id.natlus.model;

import id.natlus.controller.Database1841720019Sultan;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryDatabase1841720019Sultan extends Database1841720019Sultan {
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

    public Boolean checkLoginDataSultan(String username, String password) {
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
