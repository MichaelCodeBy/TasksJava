package com.company;

import java.util.Arrays;

//Дано натуральное число N Написать метод для формирования массива,
// элементами которого являются цифры числа N
public class D_10 {
    //public static int s;
    public static int count;

    //подсчет количества цифр в числе
    public static int getCountsOfDigits(int a) {
        while (a != 0) {
            count++;
            a /= 10;
        }
        return count;
    }

    //заполнение массива цифрами из числа.
    public static void numberToDigits(int a, int count) {
        int[] digits = new int[count];
        int d = 0;
        int s;

        while (a > 0) {
            s = (a % 10);
            a = a / 10;
            digits[d] = s;
            d++;
        }
        System.out.println(Arrays.toString(digits));
    }

    public static void main(String[] args) {
        int a = 74373;
        getCountsOfDigits(a);
        numberToDigits(a, count);
    }
}
