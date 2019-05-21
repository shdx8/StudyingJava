package com.gmail.ponomarenko2008.golovach.thread.rabbits;

import com.gmail.ponomarenko2008.golovach.thread.Example_2A.PrintRunnable;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i < 100; i++) {
            String spaces = spaces(i);
            Runnable printer = new PrintRunnable(spaces + i, 100);
            Thread thread = new Thread(printer);
            thread.start();
            Thread.sleep(100);

        }
    }

    private static String spaces(int count) {
        String result = "";
        for (int j = 0; j < count; j++) {
            result += " ";
        }
        return result;

    }
}
