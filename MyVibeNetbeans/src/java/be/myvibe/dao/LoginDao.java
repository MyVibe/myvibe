package be.myvibe.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import be.myvibe.bean.UserBean;

public class LoginDao {

    private String url;
    private String user;
    private String password;

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDriver(String driver) throws ClassNotFoundException {
        Class.forName(driver);
    }

    public UserBean getUser(String username) throws SQLException {
        String query = "select * from gebruiker where gebruikersnaam='" + username + "';";
        try (Connection con = getConnection(); PreparedStatement stmt = con.prepareStatement(query)) {
            ResultSet rs = stmt.executeQuery();
            rs.next();
            UserBean user = new UserBean();
            user.setIdGebruiker(rs.getInt(1));
            user.setIdGebruikertype(rs.getInt(2));
            user.setGebruikersnaam(rs.getString(3));
            user.setWachtwoord(rs.getString(4));
            user.setEmail(rs.getString(5));
            user.setVoornaam(rs.getString(6));
            user.setAchternaam(rs.getString(7));
            user.setStraat(rs.getString(8));
            user.setHuisnummer(rs.getString(9));
            user.setGemeente(rs.getString(10));
            user.setPostcode(rs.getString(11));
            user.setGeboortedatum(rs.getDate(12));
            user.setGeslacht(rs.getString(13));
            return user;
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}
