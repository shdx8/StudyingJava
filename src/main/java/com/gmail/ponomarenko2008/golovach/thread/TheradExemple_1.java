package com.gmail.ponomarenko2008.golovach.thread;

public class TheradExemple_1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 1000000000L; j++) {
            }
            System.out.println("A");
        }
    }
}
