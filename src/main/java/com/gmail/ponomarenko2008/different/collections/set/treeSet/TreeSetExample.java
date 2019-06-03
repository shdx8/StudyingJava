package com.gmail.ponomarenko2008.different.collections.set.treeSet;

import com.gmail.ponomarenko2008.progects.model.User;

import java.util.TreeSet;

public class TreeSetExample {
    static TreeSet<User> userTreeSet = new TreeSet<User>();


    public static void main(String[] args) {


        User user = new User("AA", 20);
        for (int i = 0; i < 100; i++) {


            userTreeSet.add(user);
            userTreeSet.add(null);
        }

        userTreeSet.forEach(user1 -> System.out.println(user1));
    }


}
