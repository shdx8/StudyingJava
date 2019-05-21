package com.gmail.ponomarenko2008.different.threads.MyExampleThreadOne;

public class PrintLetter implements Runnable {
    private String msg;
    private long millis;

    public PrintLetter(String msg, long millis) {
        this.msg = msg;
        this.millis = millis;
    }

    public void run() {
        int[] arrTwo = new int[20];
        for (int i = 0; i < arrTwo.length; i++) {
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(msg);
        }
    }
}
