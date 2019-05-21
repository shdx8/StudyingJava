package com.gmail.ponomarenko2008.golovach.thread;

public class ThreadExemple_2 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(250);
            System.out.println("BB");
        }
    }
}
