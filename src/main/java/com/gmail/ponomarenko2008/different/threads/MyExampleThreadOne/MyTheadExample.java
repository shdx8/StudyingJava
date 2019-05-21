package com.gmail.ponomarenko2008.different.threads.MyExampleThreadOne;

public class MyTheadExample {

    public static void main(String[] args) throws InterruptedException {

        int[] arr = new int[20];

        Thread thread = new Thread(new PrintLetter("Man", 250));
        thread.start();

        for (int i = 0; i < arr.length; i++) {
           // int num = arr[i];
            Thread.sleep(280);
            System.out.println("************** Woman");
        }

    }
}
