package be.myvibe.web;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import be.myvibe.bean.UserBean;
import be.myvibe.dao.LoginDao;

@WebServlet(value = "/LoginServlet", initParams = {
    @WebInitParam(name = "driver", value = "com.mysql.jdbc.Driver"),
    @WebInitParam(name = "url", value = "jdbc:mysql://db4free.net/myvibe"),
    @WebInitParam(name = "user", value = "kennethjeu"),
    @WebInitParam(name = "password", value = "myvibe")
})
public class LoginServlet extends HttpServlet {

    private LoginDao dao;

    @Override
    public void init() throws ServletException {
        try {
            String driver = getInitParameter("driver");
            String url = getInitParameter("url");
            String user = getInitParameter("user");
            String password = getInitParameter("password");
            if (driver == null || url == null || user == null || password == null) {
                throw new ServletException("Missing parameter");
            }
            dao = new LoginDao();
            dao.setDriver(driver);
            dao.setUrl(url);
            dao.setUser(user);
            dao.setPassword(password);
        } catch (ClassNotFoundException ex) {
            throw new ServletException(ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        try {
            String username = req.getParameter("username");
            String password = req.getParameter("password");
            UserBean user = dao.getUser(username);
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                res.sendRedirect("homeWelkom.jsp");
            } else {
                req.getSession().setAttribute("msg", "Incorrect. Please try again.");
                ServletContext context = getServletContext();
                RequestDispatcher requestDispatcher = context
                        .getRequestDispatcher("/home.jsp");
                requestDispatcher.forward(req, res);

            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }
}
