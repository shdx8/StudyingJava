package com.gmail.ponomarenko2008.golovach.thread.Example_2A;

public class PrintRunnable implements Runnable  {
    private String msg;
    private long sleepMillis;

    public PrintRunnable(String msg, long sleepMillis) {
        this.msg = msg;
        this.sleepMillis = sleepMillis;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(sleepMillis);
            } catch (InterruptedException e) {
                new RuntimeException(e);
            }
            System.out.println(msg);
        }
    }
}
