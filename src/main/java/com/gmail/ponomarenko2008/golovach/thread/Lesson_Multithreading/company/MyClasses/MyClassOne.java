package com.gmail.ponomarenko2008.golovach.thread.Lesson_Multithreading.company.MyClasses;

public class MyClassOne {

    public void showArrayByte() {
        byte[] b = new byte[]{22, 33, 44, 55, 66, 77, 88, 99};
        for (int i = 0; i < b.length; i++) {
            try {
                byte b1 = b[i];
                System.out.print(b1 + " ");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
