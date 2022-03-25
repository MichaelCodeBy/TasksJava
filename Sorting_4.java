package com.company;

import java.util.Arrays;

//сортировка обменами
public class Sorting_4 {
    public static void sortingChange(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int temp = 0;
            if (arr[i] > arr[i + 1]) {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }else
                continue;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static boolean chekArray(int[]arr) {
        boolean chek = false;
        int summ=0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                summ=summ++;
                chek = summ== arr.length-1;
            } else {
                chek=false;
            }
        }
        return chek;
    }
        public static void main (String[]args){
            int[] arr = {52, 45, 9, 6, 34, 96, 2, 5};
            int sum=0;
            do {
                sortingChange(arr);
                sum++;
            }
            while (chekArray(arr));

            System.out.println("Массив отсортирован за "+sum+ " проходов");
            }


        }
