package com.gmail.ponomarenko2008.different.collections.set;

import com.gmail.ponomarenko2008.progects.model.User;

import static com.gmail.ponomarenko2008.different.collections.set.hashSetExample.HashSetExample.stringHashSet;

public class MainSet {
    public static void main(String[] args) {
        User u1 = new User("Andrey", 18);
        User u2 = new User("Andrey", 18);
        User pavel = new User("Pavel", 39);
        User pavel2 = new User("Pavel", 39);
        User pavel3 = new User();

        stringHashSet.add(u1);
        stringHashSet.add(u1);
        stringHashSet.add(pavel);
        stringHashSet.add(pavel2);
        stringHashSet.add(pavel3);



        stringHashSet.forEach(user -> System.out.println(user));


    }
}
