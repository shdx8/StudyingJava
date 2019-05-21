package com.gmail.ponomarenko2008.different.threads.UseSinhroniz;

public class MainSinhron {
    public static void main(String[] args) {

        String s1 = "A";
        String s2 = "B";
        String s3 = "C";

        printA(s1);
        printA(s2);
        printA(s3);
    }

    private static synchronized void printA(String s) {
        System.out.println(s);

    }
}
