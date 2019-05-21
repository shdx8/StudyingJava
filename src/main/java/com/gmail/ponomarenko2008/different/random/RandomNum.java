package com.gmail.ponomarenko2008.different.random;

public class RandomNum {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        randomMethod();
        randomMethod();
        randomMethod();

        long end = System.currentTimeMillis();
        System.out.println("total time = " + (end - start));
    }

    private static void randomMethod() {
        int[] arr = new int[1000000];

        for (int i = 0; i < arr.length; i++) {
// ***************option # 1******************************
            // Random random = new Random();
            //   int number = random.nextInt();

// ***************option # 2******************************

            int number = (int) (Math.random() * 1000000);
            System.out.println("number => " + (arr[i] = number));
        }

    }

}
