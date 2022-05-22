package com.HuangZhen.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Category {
    private int categoryId;
    private String caategoryName;
    private String description;
    private boolean active;

    public Category(){

    }

    public Category(int categoryId, String caategoryName, String description, boolean active) {
        this.categoryId = categoryId;
        this.caategoryName = caategoryName;
        this.description = description;
        this.active = active;
    }

    public int getCategoryId() {

        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCaategoryName() {
        return caategoryName;
    }

    public void setCaategoryName(String caategoryName) {
        this.caategoryName = caategoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", caategoryName='" + caategoryName + '\'' +
                ", description='" + description + '\'' +
                ", active=" + active +
                '}';
    }
    public static List<Category> findAllCategory(Connection con) throws SQLException {
        String sql="select * from Category ";
        List<Category> list=new ArrayList<Category>();
        PreparedStatement pt=con.prepareStatement(sql);
        ResultSet rs = pt.executeQuery();
        while (rs.next()){
            Category c=new Category();
            c.setCategoryId(rs.getInt("categoryId"));
            c.setCaategoryName(rs.getString("categoryName"));
            c.setDescription(rs.getString("description"));
            list.add(c);
        }
        return list;
    }
    public static String findByCategoryId(Connection con,int categoryId) throws SQLException{
        String sql="select * from Category where categoryId=?";
        PreparedStatement pt=con.prepareStatement(sql);
        pt.setInt(1,categoryId);
        ResultSet rs = pt.executeQuery();
        String categoryName=null;
        while (rs.next()){
            categoryName=rs.getString("categoryName");
        }
        return categoryName;
    }
}
