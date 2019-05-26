package com.gmail.ponomarenko2008.different.collections.consol;

import com.gmail.ponomarenko2008.java8.User;
import com.gmail.ponomarenko2008.repository.CrudDao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class MainConsol {
    public static void main(String[] args) throws IOException {


        while (true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


            System.out.println("Enter name: ");
            String name = br.readLine();

            System.out.println("Enter age:");
            Integer age = Integer.parseInt(br.readLine());

            User user = new User(name, age);


            linkedListUsers.addLast(user);

            CrudDao crudDao = new CrudDao();

            try {
                crudDao.save(linkedListUsers);
            } catch (SQLException e) {
                e.printStackTrace();
            }

            linkedListUsers.forEach(user1 -> System.out.println(user1));
            System.out.println("number of linkedlist => " + linkedListUsers.size());
            //System.out.println();


        }
    }

    public static void showMenu() {
        1. add;
        2.d elete
        3. show_all


    }
}