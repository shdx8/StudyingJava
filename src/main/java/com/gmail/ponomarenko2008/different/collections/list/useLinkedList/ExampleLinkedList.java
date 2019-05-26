package com.gmail.ponomarenko2008.different.collections.list.useLinkedList;

import com.gmail.ponomarenko2008.different.random.RandomUtil;
import com.gmail.ponomarenko2008.java8.User;
import com.gmail.ponomarenko2008.repository.CrudDao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.LinkedList;

public class ExampleLinkedList {
    private static LinkedList<User> linkedListUsers = new LinkedList<User>();


    public static void main(String[] args) throws IOException {

        RandomUtil randomUtil = new RandomUtil();
        //randomUtil.generateMathRandom();
        linkedListUsers.addAll(randomUtil.generateMathRandom());


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
}
