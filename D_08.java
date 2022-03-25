package com.company;

import java.util.Arrays;
import java.util.Random;

//Задан массив, определить суммы трех последующих элементов трех последовательностей.
public class D_08 {
    public static int sum;

    //fill array from random numbers
    public static void fillArrayRandom(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Random ran = new Random();// insert random int to array
            int r = ran.nextInt(1000);
            arr[i] = r;
        }
    }

    //метод расчета трех последовательных чисел в массиве
    public static int sumOfThreeNumbersOfArray(int[] arr, int n) {
        sum = 0;
        for (int i = n - 1; i < n + 2; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = new int[6];
        fillArrayRandom(arr); //fill in an array of numbers
        System.out.println(Arrays.toString(arr));//для наглядности и проверки работы
        sumOfThreeNumbersOfArray(arr, 1);// сумма 1,2,3 числа в массиве
        System.out.println(sum);
        sumOfThreeNumbersOfArray(arr, 3);// сумма 3,4,5 чисел в массиве
        System.out.println(sum);
        sumOfThreeNumbersOfArray(arr, 4);// сумма 4,5,6 чисел в массиве
        System.out.println(sum);

    }
}