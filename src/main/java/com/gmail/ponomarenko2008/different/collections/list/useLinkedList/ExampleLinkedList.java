package com.gmail.ponomarenko2008.different.collections.list.useLinkedList;

import com.gmail.ponomarenko2008.java8.User;

import java.util.LinkedList;
import java.util.List;

public class ExampleLinkedList {
    private List<User> linkedListUsers = new LinkedList<>();
    private final Integer NUMBER_USERS = 100;

    public ExampleLinkedList() {
    }


    public void generateUsers() {
        //StringBuilder sb = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 1; i <= NUMBER_USERS; i++) {
            linkedListUsers.add(new User("Vova", i));
        }

    }

    public void addUser(User user) {
        linkedListUsers.add(user);
    }


    public void getLinkedListUsers() {
        linkedListUsers.forEach(user -> System.out.println(user));

    }
}
