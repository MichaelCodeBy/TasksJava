package com.company;

import java.util.Arrays;
//n
//написать алгоритм сортировки выбором
public class Sorting_3 {
    public static void sortingFromBig(int[]arr){
       int tempInArr=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                  tempInArr=arr[j];
                  arr[j]=arr[i];
                  arr[i]=tempInArr;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {52, 45, 9, 6, 34,96,2, 5};
        sortingFromBig(arr);
    }
}
