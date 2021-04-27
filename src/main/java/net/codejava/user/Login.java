package net.codejava.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "/Login", urlPatterns = "/Login")
public class Login extends HttpServlet {
    private static String URL = "jdbc:mysql://localhost:3306/users?serverTimezone=UTC";
    private static String USERNAME = "root";
    private static String PASSWORD = "12345";
    private static final String SELECT = "SELECT * FROM user WHERE name = ?;";

    @RequestMapping(value = "/log", method = RequestMethod.POST)
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String pass = request.getParameter("pass");
        User user = new User();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(SELECT);
            preparedStatement.setString(1,name);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                user.setName(resultSet.getString("name"));
                user.setPassword(resultSet.getString("password"));
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        request.getSession().setAttribute("user",user);
        if (name.equals(user.getName()) && pass.equals(user.getPassword())) {
            request.getRequestDispatcher("WEB-INF/views/welcome.jsp").forward(request,response);
        }
        else if (name.equals("admin") && pass.equals("admin")) {
            request.getRequestDispatcher("WEB-INF/views/welcome1.jsp").forward(request,response);
        }else {
            response.sendRedirect("redirect:/");

        }

    }
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {

    }

}
