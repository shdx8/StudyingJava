package com.gmail.ponomarenko2008.different.random;

import com.gmail.ponomarenko2008.java8.User;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class RandomUtil {
    private List<User> list = new LinkedList<User>();

    private int sizeArray = 15;


    // ПЕРЕДЕЛАТЬ


    public RandomUtil() {
    }


    public List<User> generateRandomArray() {
        Random random = new Random();
        for (int i = 0; i < sizeArray; i++) {
            int num = random.nextInt();
            int newAge = ((num % 1000000000) / 10000000);
            User user = new User("Vavan", newAge);
            list.add(user);
        }
        return list;
    }

    public List<User> generateMathRandom() {
        for (int i = 0; i < sizeArray; i++) {
            int age = (int) (Math.random() * 1000);

            User user = new User("Ivan", age);
            list.add(user);
        }

        return list;

    }


}
