package com.gmail.ponomarenko2008.different.collections.list.useArrayList;

import com.gmail.ponomarenko2008.progects.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExampleArrayList {

    private static List<User> userList = new ArrayList<User>();
    private static final int number = 100;


    public ExampleArrayList() {

    }

    static {
        Random random = new Random();

        for (int i = 1; i <= number; i++) {
            //int num = random.nextInt();
            int num = i;
            //int newAge = ((num % 1000000000) / 10000000);
            int newAge = num;
            userList.add(new User("Sergey", newAge));
        }
    }

    public List<User> getUserList() {
        return userList;
    }

    public void addEntity(User user) {
        userList.add(user);
    }


    public void showUsersList() {
        // До Java 8
/*
        for (User user : userList) {
            System.out.println(user.toString());
        }
*/
//****************************************************************************************
        // После  Java 8
        userList.forEach(user -> System.out.println(user));
    }
}

