package com.gmail.ponomarenko2008.golovach.thread.Example_2A;


public class ThreadExample_1A {
    public static void main(String[] args) throws InterruptedException {
        Runnable printer = new PrintRunnable("Hi man", 1000);
        Thread thread = new Thread(printer);
        thread.start();
        Runnable sortingArray = new SortArray();
        Thread sortA = new Thread(sortingArray);
        sortA.start();

        for (int i = 0; i < 10; i++) {
            Thread.sleep(1050);
            System.out.println("     GoodBay Man");
        }
    }


}
