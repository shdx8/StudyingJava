package com.gmail.ponomarenko2008.different.fibonacci;

import java.util.Scanner;

public class NumbersFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;

        while (true) {
            System.out.println("Enter your number: ");
            int number = scanner.nextInt();
            //arr = new int[number];

            //System.out.println(calculateFibonacci(number));
                   System.out.println(fibonacci(number));

            //fibonacciIteration(number);
        }

    }

    private static void fibonacciIteration(int number) {
        int index0 = 1;
        int index1 = 1;
        int num;
        System.out.println("Fibonacci of number -> " + number);
        System.out.print(index0 + " " + index1 + " ");
        for (int i = 2; i < number; i++) {
            num = index0 + index1;
            System.out.print(num + " ");
            index0 = index1;
            index1 = num;
        }
        System.out.println();


    }

    private static int calculateFibonacci(int number) {
        int result;
        if (number == 0 || number == 1) {
            return result = (number == 0) ? 0 : 1;
        } else {
            return result = calculateFibonacci(number - 1) + calculateFibonacci(number - 2);
            //System.out.println(result);

            //System.out.println(result);
        }
    }

    public static int fibonacci(int n) {
        System.out.println(n);
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

}

