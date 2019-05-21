package com.gmail.ponomarenko2008.golovach.thread.Example_2A;

public class ThreadExample_0A {

    // ВСЕ РАВНО РАБОТАЮТ ПОСЛЕДОВАТЕЛЬНО !!!!!!!!!

    public static void main(String[] args) throws InterruptedException{
        for (int i = 0; i < 10; i++) {
            Thread.sleep(50);
            System.out.println("Hi man");
        }
        new PrintRunnable("Goodbay !!!",60).run();
    }
}
