package com.gmail.ponomarenko2008.different.collections.consol;

import com.gmail.ponomarenko2008.progects.model.User;
import com.gmail.ponomarenko2008.progects.repository.CrudDao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class AddEntityMenu {


     CrudDao crudDao;
     User user;

    public AddEntityMenu() {
    }


    public void showAddEntityMenu() throws IOException, SQLException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your login");
        String login = br.readLine();

        System.out.println("Enter your password");
        Integer password = Integer.parseInt(br.readLine());

        user = new User(login, password);
        crudDao.save(user);


    }


}
