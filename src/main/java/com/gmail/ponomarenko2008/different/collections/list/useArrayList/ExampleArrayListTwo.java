package com.gmail.ponomarenko2008.different.collections.list.useArrayList;

import com.gmail.ponomarenko2008.progects.model.Entity;
import com.gmail.ponomarenko2008.progects.model.User;

import java.util.ArrayList;

public class ExampleArrayListTwo {

    static ArrayList<Entity> entityArrayList = new ArrayList<>();

    public static void main(String[] args) {


        User user = new User();
        User user2 = new User("Pavel", 39);
        entityArrayList.add(user);
        entityArrayList.add(null);
        entityArrayList.add(null);
        entityArrayList.add(null);


        entityArrayList.forEach(user1 -> System.out.println(user1));

    }


}
