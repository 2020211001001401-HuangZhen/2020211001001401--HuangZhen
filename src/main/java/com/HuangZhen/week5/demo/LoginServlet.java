package com.HuangZhen.week5.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;


@WebServlet(name = "LoginServlet",value = "/login")
public class LoginServlet extends HttpServlet {
    Connection conn = null;
    @Override
    public void init() throws ServletException{

        super.init();
        ServletContext context=getServletContext();
        String driver=context.getInitParameter("driver");
        String url=context.getInitParameter("url");
        String username=context.getInitParameter("username");
        String password=context.getInitParameter("password");

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection -->" + conn);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();

        }
    }

    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletConfig config = getServletConfig();

        String driver=request.getParameter("driver");
        String url=request.getParameter("url");
        String username=request.getParameter("username");
        String password=request.getParameter("password");

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from usertable where username='sa' and password =123456789 ");
            if("sa".equals(username)&&"123456789".equals(password))
            {   PrintWriter writer =response.getWriter();
                writer.println("Login successful!!!");
                writer.println("Welcome"+username);
            }
            else
            {   PrintWriter writer =response.getWriter();

                writer.println("username or password Error!!!");
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
