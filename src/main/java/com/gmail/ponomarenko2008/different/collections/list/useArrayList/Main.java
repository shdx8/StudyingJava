package com.gmail.ponomarenko2008.different.collections.list.useArrayList;

import com.gmail.ponomarenko2008.java8.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {


    public static void main(String[] args) throws IOException {


        // Вариант № 1
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Вариант № 2

        //   InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader buff = new BufferedReader(in);

        while (true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            ExampleArrayList exampleArrayList = new ExampleArrayList();

            System.out.println("Enter name: ");
            String name = br.readLine();

            System.out.println("Enter age:");
            int age = br.read();

            User user = new User(name, age);

            exampleArrayList.addEntity(user);
            System.out.println("****************************************************");

            exampleArrayList.showUsersList();

        }

    }
}

