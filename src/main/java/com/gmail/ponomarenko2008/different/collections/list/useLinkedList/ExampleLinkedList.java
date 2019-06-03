package com.gmail.ponomarenko2008.different.collections.list.useLinkedList;

import com.gmail.ponomarenko2008.progects.model.LoginUser;
import com.gmail.ponomarenko2008.progects.model.User;
import com.gmail.ponomarenko2008.progects.repository.LoginDao;

import java.sql.SQLException;
import java.util.LinkedList;

public class ExampleLinkedList {
    private LinkedList<User> linkedListUsers = new LinkedList<User>();
    private LinkedList<LoginUser> linkedListLoginUser = new LinkedList<>();
    private LoginUser loginUser;
    private LoginDao loginDao;


    public ExampleLinkedList() {
    }


    public void addLoginUser(LoginUser loginUser) throws SQLException {
        loginDao = new LoginDao();
        loginDao.saveLoginUser(loginUser);
    }

    public void showAllLoginUser() throws SQLException {
        loginDao = new LoginDao();

        linkedListLoginUser = loginDao.showAllLoginUser();

        linkedListLoginUser.forEach(loginUser -> System.out.println(loginUser));
        System.out.println("number of linkedlist => " + linkedListLoginUser.size());

    }

    public void deleteLoginUser(Integer id) throws SQLException {
        loginDao.deleteLoginUser(id);

    }


}
