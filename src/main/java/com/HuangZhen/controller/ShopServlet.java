package com.HuangZhen.controller;

import com.HuangZhen.dao.ProductDao;
import com.HuangZhen.model.Category;
import com.HuangZhen.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ShopServlet",value = "/shop")
public class ShopServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Category category= new Category();
        Connection con;
        con =  (Connection)getServletContext().getAttribute("con");
        List<Category> categoryList = null;
        try {
            categoryList = category.findAllCategory(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("categoryList",categoryList);

        ProductDao productDao = new ProductDao();
        List<Product> productList=null;
        try{
            if(request.getParameter("categoryId")==null){
                productList=productDao.findAll(con);
            }else {
                int categoryId =Integer.parseInt(request.getParameter("categoryId"));
                productList = productDao.findByCategoryId(categoryId,con);
            }
        } catch (SQLException throwables){
            throwables.printStackTrace();
        }
        request.setAttribute("productList",productList);
        String path ="/WEB-INF/views/shop.jsp";
        request.getRequestDispatcher(path).forward(request,response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


}
