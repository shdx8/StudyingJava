package com.gmail.ponomarenko2008.different.collections.set.linkedHeshSetExample;

import com.gmail.ponomarenko2008.progects.model.User;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static LinkedHashSet<User> userLinkedHashSet = new LinkedHashSet<>();

    public LinkedHashSetExample() {
    }


    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User("Pavel", 39);
        userLinkedHashSet.add(user1);
        userLinkedHashSet.add(user2);
        userLinkedHashSet.add(user2);
        userLinkedHashSet.add(user2);
        userLinkedHashSet.add(user2);

        userLinkedHashSet.forEach(user -> System.out.println(user));

        System.out.println(userLinkedHashSet.size());
        System.out.println(userLinkedHashSet.isEmpty());
    }


}
