package com.gmail.ponomarenko2008.different.threads;

import java.util.LinkedList;
import java.util.List;

public class MainThread {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        createThr();
        userMethod();

        long end = System.currentTimeMillis();

        System.out.println("total time = " + (end - start));
        System.out.println("Stop programm");


    }

    private static void createThr() {
     //   Runnable runnable1 = new CreateThreads();
        //  Runnable runnable2 = new CreateThreads();
        //Runnable runnable3 = new CreateThreads();

       // Thread threadOne = new Thread(runnable1);
        //threadOne.start();


        //Thread threadTwo = new Thread(runnable2);
        //Thread threadThree = new Thread(runnable3);

       /* try {

            threadOne.start();
            threadTwo.start();
            threadThree.start();

            threadOne.join();
            threadTwo.join();
            threadThree.join();
        } catch (InterruptedException e) {
            e.fillInStackTrace();
        }*/

    }

    public static void userMethod() {
        int max = 1000;
        User user = new User(43, "B", "BBB");
        List<User> userList = new LinkedList<User>();

        for (int i = 0; i < max; i++) {
            userList.add(user);
     /*       try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                throw new RuntimeException();
            }*/
            System.out.println(user.toString());
        }


    }


}



