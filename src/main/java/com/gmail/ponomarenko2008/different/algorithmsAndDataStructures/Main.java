package com.gmail.ponomarenko2008.different.algorithmsAndDataStructures;

import com.gmail.ponomarenko2008.different.random.RandomUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    private static LinkedList<Integer> linkedList = new LinkedList<>();
    final static int MAX_VALUE = 1000;
    private static RandomUtil randomUtil = new RandomUtil();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        addListRandomNumber();

        int size = linkedList.size();

        System.out.println("Size of the Linked List => " + size);
        System.out.println("***** 1111111111111111111111111111111111111**********************");


        while (true) {

            System.out.println("Enter number: ");
            Integer integer = Integer.parseInt(br.readLine());

            // linkedList.addLast(integer);


            showInfo();
            System.out.println(linkedList.contains(integer));

        }


    }

    private static void addListRandomNumber() {
        linkedList.addAll(randomUtil.ganereteNamber());
        linkedList.forEach(integer -> System.out.println(integer));


    }

    public static void showInfo() {
        System.out.println("Show All ****************************************************************");
        linkedList.forEach(integer -> System.out.println(integer));

        int size = linkedList.size();
        System.out.println("Size of the Linked List => " + size);
    }
}
