package id.natlus.controller;

import id.natlus.model.LoginDb1841720019Sultan;
import id.natlus.model.RegisterDb1841720019Sultan;
import id.natlus.model.SenjataDb1841720019Sultan;

import java.sql.ResultSet;

public class Db1841720019Sultan {
    private SenjataDb1841720019Sultan mSenjata = new SenjataDb1841720019Sultan();
    private LoginDb1841720019Sultan mLogin = new LoginDb1841720019Sultan();
    private RegisterDb1841720019Sultan register = new RegisterDb1841720019Sultan();

    public ResultSet getSenjataSultan() {
        return mSenjata.getDataSenjataSultan();
    }

    public Boolean tryLoginSultan(String username, String password) {
        return mLogin.checkLoginDataSultan(username, password);
    }

    public Boolean registerSultan(String name, String nit, String username, String password) {
        return register.registerSultan(name, nit, username, password);
    }
}
