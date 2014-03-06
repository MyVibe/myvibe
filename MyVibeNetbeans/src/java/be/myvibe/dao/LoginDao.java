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
        String query = "select gebruikersnaam, wachtwoord from gebruiker where gebruikersnaam='" + username + "';";
        try (Connection con = getConnection(); PreparedStatement stmt = con.prepareStatement(query)) {
            ResultSet rs = stmt.executeQuery();
            rs.next();
            UserBean user = new UserBean();
            user.setUsername(rs.getString(1));
            user.setPassword(rs.getString(2));
            return user;
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}
