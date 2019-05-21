package com.gmail.ponomarenko2008.different.factorial;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your number: ");
            int number = scanner.nextInt();
            //int result = factIterator(number);

            int result = factRecursion(number);
            System.out.println(result);
        }
    }


    // ПРИМЕР С РЕКУРСИЕЙ
    //*******************************************************************************************
    private static int factRecursion(int number) {
        int result = number;

        if (number < 0 || number == 0) {
            result = (number < 0) ? number : 1;
            return result;
        } else if (number > 0) {
            result = (number == 1) ? 1 : number * factRecursion(number - 1);
        }
        return result;
    }

    //ПРИМЕР С ИТЕРАЦИЕЙ
//*********************************************************************************************
    private static int factIterator(int number) {
        int result = number;

        if (number == 0) {
            result = 1;
            return result;
        } else if (number > 0) {
            for (int j = 1; j < number; j++) {
                result *= j;
            }
            return result;
        }
        System.out.println("Factorial < 0, enter next number! ");
        return result;

    }

    // ПРИМЕР С ПРОВЕРКАМИ
    //*********************************************************************************

}
