package com.HuangZhen.dao;

import com.HuangZhen.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class UserDao implements IUserDao {

    @Override
    public boolean saveUser(Connection con, User user) throws SQLException {
        String sql = "insert into usertable values(?,?,?,?,?)";
        PreparedStatement st = con.prepareStatement(sql);
        st.executeUpdate();
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
            user = new User();
            user.setID(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setGender(rs.getString("gender"));
            user.setBirthdate(rs.getDate("birthDate"));
        }
        return true;
    }

    @Override
    public int deleteUser(Connection con, User user) throws SQLException {
        String sql = "delete from usertable where id=? ";
        PreparedStatement st = con.prepareStatement(sql);
        st.executeUpdate();

        st.setInt(1,user.getID());
        ResultSet rs = st.executeQuery();
        System.out.println("delete successfully!!!");
        return 0;
    }

    @Override
    public int updateUser(Connection con, User user) throws SQLException {
        System.out.println(2);
        String sql = "update  usertable set username=?,password=?,email=?,gender=?,birthDate=? where id=?";
        PreparedStatement st = con.prepareStatement(sql);
//        String id = null;
        st.setString(1,user.getUsername());
        st.setString(2,user.getPassword());
        st.setString(3,user.getEmail());
        st.setString(4,user.getGender());
        st.setString(5,String.valueOf(user.getBirthdate()));
        st.setInt(6,user.getID());
        st.executeUpdate();
        return 0;
    }

    @Override
    public User findById(Connection con, Integer id) throws SQLException {
        String sql="Select * from usertable where id=? ";
        PreparedStatement st=con.prepareStatement(sql);
        st.setInt(1,id);
        ResultSet rs= st.executeQuery();
        User user=null;
        if(rs.next()){
            user=new User();
            user.setID(rs.getInt("ID"));
            user.setUsername(rs.getString("Username"));
            user.setPassword(rs.getString("Password"));
            user.setEmail(rs.getString("Email"));
            user.setGender(rs.getString("Gender"));
            user.setBirthdate(rs.getDate("Birthdate"));
        }

        return user;
    }

    @Override
    public User findByUsernamePassword(Connection con, String username, String password) throws SQLException {
        String sql="Select * from usertable where username=? and password=? ";
        PreparedStatement st=con.prepareStatement(sql);
        st.setString(1,username);
        st.setString(2,password);
        ResultSet rs= st.executeQuery();
        User user=null;
        if(rs.next()){
            user=new User();
            user.setID(rs.getInt("ID"));
            user.setUsername(rs.getString("UserName"));
            user.setPassword(rs.getString("Password"));
            user.setEmail(rs.getString("Email"));
            user.setGender(rs.getString("Gender"));
            user.setBirthdate(rs.getDate("Birthdate"));
        }

        return user;
    }

    @Override
    public List<User> findByUsername(Connection con, String username) throws SQLException {
        String sql="Select * from usertable where username=? ";
        PreparedStatement st=con.prepareStatement(sql);
        st.setString(1,username);

        ResultSet rs= st.executeQuery();
        User user=null;
        if(rs.next()){
            user=new User();
            user.setID(rs.getInt("ID"));
            user.setUsername(rs.getString("Username"));
            user.setPassword(rs.getString("Password"));
            user.setEmail(rs.getString("Email"));
            user.setGender(rs.getString("Gender"));
            user.setBirthdate(rs.getDate("Birthdate"));
        }

        return (List<User>) user;
    }

    @Override
    public List<User> findByPassword(Connection con, String password) throws SQLException {
        String sql="Select * from usertable where  password=? ";
        PreparedStatement st=con.prepareStatement(sql);
        st.setString(1,password);
        ResultSet rs= st.executeQuery();
        User user=null;
        if(rs.next()){
            user=new User();
            user.setID(rs.getInt("ID"));
            user.setUsername(rs.getString("Username"));
            user.setPassword(rs.getString("Password"));
            user.setEmail(rs.getString("Email"));
            user.setGender(rs.getString("Gender"));
            user.setBirthdate(rs.getDate("Birthdate"));
        }

        return (List<User>) user;
    }

    @Override
    public List<User> findByEmail(Connection con, String email) throws SQLException {
        String sql="Select * from usertable where email=? ";
        PreparedStatement st=con.prepareStatement(sql);
        st.setString(1,email);
        ResultSet rs= st.executeQuery();
        User user=null;
        if(rs.next()){
            user=new User();
            user.setID(rs.getInt("ID"));
            user.setUsername(rs.getString("Username"));
            user.setPassword(rs.getString("Password"));
            user.setEmail(rs.getString("Email"));
            user.setGender(rs.getString("Gender"));
            user.setBirthdate(rs.getDate("Birthdate"));
        }

        return (List<User>) user;
    }

    @Override
    public List<User> findByGender(Connection con, String gender) throws SQLException {
        String sql="Select * from usertable where gender=? ";
        PreparedStatement st=con.prepareStatement(sql);
        st.setString(1,gender);
        ResultSet rs= st.executeQuery();
        User user=null;
        if(rs.next()){
            user=new User();
            user.setID(rs.getInt("ID"));
            user.setUsername(rs.getString("Username"));
            user.setPassword(rs.getString("Password"));
            user.setEmail(rs.getString("Email"));
            user.setGender(rs.getString("Gender"));
            user.setBirthdate(rs.getDate("Birthdate"));
        }

        return (List<User>) user;
    }

    @Override
    public List<User> findByBirthdate(Connection con, Date birthDate) throws SQLException {
        String sql="Select * from usertable where birthDate=? ";
        PreparedStatement st=con.prepareStatement(sql);
        st.setString(1,birthDate.toString());
        ResultSet rs= st.executeQuery();
        User user=null;
        if(rs.next()){
            user=new User();
            user.setID(rs.getInt("ID"));
            user.setUsername(rs.getString("Username"));
            user.setPassword(rs.getString("Password"));
            user.setEmail(rs.getString("Email"));
            user.setGender(rs.getString("Gender"));
            user.setBirthdate(rs.getDate("Birthdate"));
        }

        return (List<User>) user;
    }

    @Override
    public List<User> findAllUser(Connection con) throws SQLException {
        String sql="Select * from usertable ";
        PreparedStatement st=con.prepareStatement(sql);
        ResultSet rs= st.executeQuery();
        User user=null;
        if(rs.next()){
            user=new User();
            user.setID(rs.getInt("ID"));
            user.setUsername(rs.getString("Username"));
            user.setPassword(rs.getString("Password"));
            user.setEmail(rs.getString("Email"));
            user.setGender(rs.getString("Gender"));
            user.setBirthdate(rs.getDate("Birthdate"));
        }

        return (List<User>) user;
    }
}

