package com.gmail.ponomarenko2008.different.collections.list.useLinkedList;

import com.gmail.ponomarenko2008.java8.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {


        while (true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            ExampleLinkedList exampleLinkedList = new ExampleLinkedList();

            exampleLinkedList.generateUsers();
            exampleLinkedList.getLinkedListUsers();

            System.out.println("Enter name: ");
            String name = br.readLine();

            System.out.println("Enter age:");
            int age = br.read();

            User user = new User(name, age);

            System.out.println("****************************************************");

            exampleLinkedList.getLinkedListUsers();
        }


    }
}
