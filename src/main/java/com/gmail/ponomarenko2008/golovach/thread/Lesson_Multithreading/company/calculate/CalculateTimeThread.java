package com.gmail.ponomarenko2008.golovach.thread.Lesson_Multithreading.company.calculate;

public class CalculateTimeThread {
    long start;
    long end;

    public CalculateTimeThread(long start, long end) {
        this.start = start;
        this.end = end;
        calculate();
    }

    private void calculate() {
        System.out.println();
        System.out.println(this.end - this.start + " ms");
    }
}
