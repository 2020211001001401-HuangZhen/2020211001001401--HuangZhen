package com.HuangZhen.week4;

import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/*@WebServlet(name="JDBCDemoServlet",urlPatterns = {"/jdbc"},
        initParams={
        @WebInitParam(name="driver",value="com.microsoft.sqlserver.jdbc.SQLServerDriver"),
        @WebInitParam(name="url",value="jdbc:sqlserver://localhost:1433;database=userdb;encrypt=false"),
        @WebInitParam(name="username",value="sa"),
        @WebInitParam(name="password",value="123456789"),
        },
        loadOnStartup = 1
)*/


//@WebServlet(urlPatterns = {"/jdbc"},loadOnStartup=1)
public class JDBCDemoServlet extends HttpServlet {
    Connection con=null;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         //String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
         //String url="jdbc:sqlserver://localhost:1433;database=userdb;encrypt=false";
         //String username="sa";
         //String password="123456789";
         //ServletConfig config=getServletConfig();
         //String driver= config.getInitParameter("driver");
         //String url= config.getInitParameter("url");
         //String username= config.getInitParameter("username");
         //String password= config.getInitParameter("password");


        ServletContext context=getServletContext();
        String driver=context.getInitParameter("driver");
        String url=context.getInitParameter("url");
        String username=context.getInitParameter("username");
        String password=context.getInitParameter("password");

        try {
            Class.forName(driver);
            Connection con=DriverManager.getConnection(url,username,password);
            System.out.println("Connection --> in JDBCDemoServlet"+con);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
