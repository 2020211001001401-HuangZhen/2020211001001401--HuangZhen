package com.HuangZhen.week6;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SearchServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String txt = request.getParameter("txt");
        String search = request.getParameter("search");
        String contextPath = request.getContextPath();
        if (txt.length() == 0) {
            response.sendRedirect(contextPath+"/index.jsp");
        } else {
            if (search.equals("baidu")) {
                response.sendRedirect("https://www.baidu.com/s?wd="+txt);
            } else if (search.equals("bing")) {
                response.sendRedirect("https://cn.bing.com/search?q="+txt);
            } else if (search.equals("google")) {
                response.sendRedirect("https://www.google.com/search?q="+txt);
            }
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
