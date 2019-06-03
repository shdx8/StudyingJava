package com.gmail.ponomarenko2008.progects.repository;

import com.gmail.ponomarenko2008.progects.model.LoginUser;

import java.sql.*;
import java.util.LinkedList;

public class LoginDao {

    private LinkedList<LoginUser> listLoginUser = new LinkedList<>();
    private LoginUser loginUser;
    Connection connection;

    private final static String SQL_URL_PROGECT_22_01 = "jdbc:mysql://localhost:3306/progect_22_01?useSSL=false";
    private final static String SQL_LOGIN = "root";
    private final static String SQL_PASSWORD = "19491951";
    private final static String SQL_DRIVER = "com.mysql.jdbc.Driver";


    private final static String SQL_INSERT = "INSERT INTO logintable(login,password) VALUES(?, ?)";
    private final static String SQL_READ_ALL_LOGINUSER = "SELECT * FROM logintable";
    private final static String SQL_DELETE_BY_ID = "DELETE FROM logintable WHERE id = ?";


    public LoginDao() {

    }

    public void saveLoginUser(LoginUser loginUser) throws SQLException {
        connection = DriverManager.getConnection(SQL_URL_PROGECT_22_01, SQL_LOGIN, SQL_PASSWORD);

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT);

            preparedStatement.setString(1, loginUser.getLogin());
            preparedStatement.setString(2, loginUser.getPassword());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public LinkedList<LoginUser> showAllLoginUser() throws SQLException {
        connection = DriverManager.getConnection(SQL_URL_PROGECT_22_01, SQL_LOGIN, SQL_PASSWORD);

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(SQL_READ_ALL_LOGINUSER);
        while (resultSet.next()) {
            loginUser = new LoginUser();
            loginUser.setId(resultSet.getInt(1));
            loginUser.setLogin(resultSet.getString(2));
            loginUser.setPassword(resultSet.getString(3));
            listLoginUser.add(loginUser);
        }
        return listLoginUser;

    }

    public void deleteLoginUser(Integer id) throws SQLException {

        connection = DriverManager.getConnection(SQL_URL_PROGECT_22_01, SQL_LOGIN, SQL_PASSWORD);

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_DELETE_BY_ID);
            preparedStatement.setInt(1,id );
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
