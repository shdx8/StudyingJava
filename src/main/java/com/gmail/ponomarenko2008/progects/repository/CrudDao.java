package com.gmail.ponomarenko2008.progects.repository;

import com.gmail.ponomarenko2008.progects.model.LoginUser;
import com.gmail.ponomarenko2008.progects.model.User;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;


public class CrudDao {
    Connection connection;

    private List<User> list = new LinkedList<>();
    private LinkedList<LoginUser> listLoginUser = new LinkedList<>();
    private LoginUser loginUser;


    public CrudDao() {
    }

    private final static String SQL_URL_PROGECT_22_01 = "jdbc:mysql://localhost:3306/progect_22_01?useSSL=false";
    private final static String SQL_LOGIN = "root";
    private final static String SQL_PASSWORD = "19491951";
    private final static String SQL_DRIVER = "com.mysql.jdbc.Driver";


    private final static String SQL_INSERT = "INSERT INTO logintable(login,password) VALUES(?, ?)";
    private final static String SQL_READ_ALL_LOGINUSER = "SELECT * FROM logintable";



    public void save(User user) throws SQLException {
        connection = DriverManager.getConnection(SQL_URL_PROGECT_22_01, SQL_LOGIN, SQL_PASSWORD);

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT);

            preparedStatement.setString(1, user.getName());
            preparedStatement.setInt(2, user.getAge());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
