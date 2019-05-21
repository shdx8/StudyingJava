package com.gmail.ponomarenko2008.golovach.thread.Example_2A;

public class SortArray implements Runnable {

    @Override
    public void run() {
        try {
            int i = 5;
            for (int j = 0; j < 10; j++) {
                Thread.sleep(500);
                System.out.println("*********number********* " + i);
            }

        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}

