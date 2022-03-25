package com.company;

import java.util.Arrays;
//n
/* Даны две последовательности a1<a2<....<an и b1<b2<...<bn
Образовать из них новую последовательность чисел, чтобы она тоже была неубывающей.
 Примечание. Доп массив не использовать.
 */
public class Sorting_2 {

    public static void unitedArray(int[] array1, int[] array2) {
        int[] array = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array[i] = array1[i];
        }
        for (int i = array1.length; i < (array1.length + array2.length); i++) {
            array[i] = array2[i - array1.length];
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 54, 23, 9};
        int[] arr2 = {52, 45, 9, 6, 2, 5};
        unitedArray(arr1, arr2);


    }
}