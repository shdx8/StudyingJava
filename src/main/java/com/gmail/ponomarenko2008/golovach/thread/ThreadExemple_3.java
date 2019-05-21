package com.gmail.ponomarenko2008.golovach.thread;

public class ThreadExemple_3 {
    public static void main(String[] args) throws InterruptedException{
        for (int i = 0; i < 10; i++) {
            Thread.sleep(240);
            System.out.println("A");
            nextMethod();
        }
    }

    private static void nextMethod() throws InterruptedException{
        Thread.sleep(260);
        System.out.println(" B");
    }
}
