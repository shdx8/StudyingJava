package com.gmail.ponomarenko2008.different.collections.set.hashSetExample;

import com.gmail.ponomarenko2008.progects.model.Entity;
import com.gmail.ponomarenko2008.progects.model.User;

import java.util.HashSet;

public class HashSetExample {
    //public static Set<Entity> stringHashSet = new HashSet<Entity>();
    public static HashSet<User> stringHashSet = new HashSet<User>();

    public HashSetExample() {
    }

    public static void main(String[] args) {
        stringHashSet.add(null);
        stringHashSet.add(new User("YY", 25));

        stringHashSet.forEach(entity -> System.out.println(entity));
    }
}
