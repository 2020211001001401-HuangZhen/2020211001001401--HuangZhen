package com.HuangZhen.week4;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



@WebServlet(name = "ConfigDemoServlet2",urlPatterns = {"/config2"},
        initParams = {
                @WebInitParam(name = "Name",value = "HuangZhen"),
                @WebInitParam(name ="studentId",value = "2020211001001401")
        },loadOnStartup = 1)
public class ConfigDemoServlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer =response.getWriter();
        ServletConfig config = getServletConfig();
        String Name = config.getInitParameter("name");
        String studentId = config.getInitParameter("studentId");
        writer.println("Name:HuangZhen");
        writer.println("studentId:2020211001001401");
    }
}