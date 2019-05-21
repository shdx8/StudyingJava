package com.gmail.ponomarenko2008.golovach.thread.Lesson_Multithreading.company.MyThread;


import com.gmail.ponomarenko2008.golovach.thread.Lesson_Multithreading.company.MyClasses.MyClassOne;

public class MyNewThread implements Runnable {

    String nameThread;

    public MyNewThread(String nameThread) {
        this.nameThread = nameThread;
        run();

    }


//    @Override
    public void run() {
        MyClassOne myClassOne = new MyClassOne();
        myClassOne.showArrayByte();

    }


}

