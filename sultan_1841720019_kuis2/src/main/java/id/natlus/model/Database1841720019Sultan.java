package id.natlus.model;


import org.mariadb.jdbc.Driver;

import java.sql.*;

public class Database1841720019Sultan {
    protected Connection mConnection;

    public void openConnectionSultan() {
        if (mConnection == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/pbo";
                String user = "sultan";
                String password = "1U5yPNNWWcqnUEFx";
                DriverManager.registerDriver(new Driver());
                mConnection = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}