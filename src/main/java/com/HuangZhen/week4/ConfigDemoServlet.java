package com.HuangZhen.week4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;

@WebServlet(name = "ConfigDemoServlet", value = "/ConfigDemoServlet")
public class ConfigDemoServlet extends HttpServlet {
    Connection con=null;
    @Override
    public void init() throws ServletException {
        super.init();

    ServletConfig config=getServletConfig();
    String name= config.getInitParameter("name");
    String studentId= config.getInitParameter("studentId");


    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
