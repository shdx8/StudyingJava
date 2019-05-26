package com.gmail.ponomarenko2008.repository;

import com.gmail.ponomarenko2008.java8.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;


public class CrudDao {
    private List<User> list = new LinkedList<>();

    public CrudDao() {
    }

    private final static String SQL_URL = "jdbc:mysql://localhost:3306/progect_22_01?useSSL=false";
    private final static String SQL_LOGIN = "root";
    private final static String SQL_PASSWORD = "19491951";
    private final static String SQL_DRIVER = "com.mysql.jdbc.Driver";

    private final static String SQL_INSERT = "INSERT INTO logintable(login,password) VALUES(?, ?)";

    /*
        public void save(User user) throws SQLException {
            Connection connection = DriverManager.getConnection(SQL_URL, SQL_LOGIN, SQL_PASSWORD);

            try {

                PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT);

                preparedStatement.setString(1, user.getName());
                preparedStatement.setInt(2, user.getAge());
                preparedStatement.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }

    */
    public void save(List<User> list) throws SQLException {
        Connection connection = DriverManager.getConnection(SQL_URL, SQL_LOGIN, SQL_PASSWORD);
        this.list = list;
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT);

            for (User user : list) {
                preparedStatement.setString(1, user.getName());
                preparedStatement.setInt(2, user.getAge());
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
