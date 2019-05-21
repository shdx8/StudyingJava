package com.gmail.ponomarenko2008.golovach.thread.Lesson_Multithreading.company;


import com.gmail.ponomarenko2008.golovach.thread.Lesson_Multithreading.company.MyClasses.MyClassTwo;

public class Main {

    public static void main(String[] args) {
      /*  String s = "Hello world";
        long start = System.currentTimeMillis();
        MyNewThread myClass = new MyNewThread(s);
        long end = System.currentTimeMillis();
        CalculateTimeThread calc = new CalculateTimeThread(start,end);
*/
        MyClassTwo mT = new MyClassTwo();
        mT.doubleArrey();

    }
}
