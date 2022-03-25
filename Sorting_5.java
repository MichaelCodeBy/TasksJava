package com.company;

import java.util.Arrays;

// сортровка вставками
public class Sorting_5 {
//метод сортировки вставками
    public static void sortingInsert(int[] array){
        int length = array.length;
        for (int i = 1; i < length; i++) {
            for (int j = i; j >= 1; j--) {
                if (array[j] < array[j - 1])
                    swapOfElements(array, j, j - 1);
                else
                    break;
            }
        }
    }
// метод замены элементов
    private static void swapOfElements(int[] array, int j, int i) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {52, 45, 9, 6, 34,96,2, 5};
        sortingInsert(arr);
        System.out.println(Arrays.toString(arr));
    }
}
