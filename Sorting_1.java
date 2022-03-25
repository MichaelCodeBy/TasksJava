package com.company;

import java.util.Arrays;
//n
/* заданы два одномерных массива с разным количеством элементов и натуральное число к .
Обьединить их в один массив, включив второй массив между к-м и (к+1)-м элементами первого массива,
при этом не используя доп массив.*/
public class Sorting_1 {
    public static void unitedArrays(int [] a1, int [] a2, int k) {
        int n1 = a1.length;
        int n2 = a2.length;
        int i, p;

        int res[] = new int[n1 + n2];

        p = 0;
        for (i = 0; i < k; i++)
            res[p++] = a1[i];
        for (i = 0; i < n2; i++)
            res[p++] = a2[i];
        for (i = k; i < n1; i++)
            res[p++] = a1[i];
        //System.out.println(Arrays.toString(res));//what I see
        for (int e = 0; e < res.length; e++) {
            System.out.print(res[e] + " ,");

        }
    }
    public static void main(String[] args) {
        int[]arr1={2,54,23,9};
        int[]arr2={52,45,9,6,2,5};
        int k=3;
        unitedArrays(arr1,arr2,k);

    }
}
