package com.company;

import java.util.Arrays;
import java.util.Random;

// составить программу , которая в массиве A[N] находит второе по величине число (вывести на печать число,
// которое меньше максимального элемента массива, но больше всех остальных элементов)
public class D_05 {
    //fill array from random int
    public static void fillArrayRandom(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Random ran = new Random();// insert random int to array
            int r = ran.nextInt(1000);
            arr[i] = r;
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[20];
        fillArrayRandom(arr);
        System.out.println(Arrays.toString(arr));//для наглядности заполненный массив
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//массив отсортированный, где последнее число максимальное
        if (arr[arr.length-3] < arr [arr.length-2]  && arr[arr.length-2] < arr[arr.length-1]) //Check int
        {
            System.out.println("Это число меньше максимального: "+arr[arr.length-2]);// вывод на печать предпоследнего числа
        } else System.out.println("Какието из чисел равны ( ");
    }
}
