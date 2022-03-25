package com.company;

import java.util.Arrays;
import java.util.Random;

public class M_15 {
    private static int bigInt;

    /* Найдите наибольший элемент матрицы и заменить все нечетные элементы на него*/
    public static void main(String[] args) {

        int[][] mat = new int[10][10]; //creat matrix

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                Random ran = new Random();// insert random int to array
                int r = ran.nextInt();
                mat[i][j] = r;
            }
        }
        printArray(mat);//System.out.println(Arrays.deepToString(mat));
        findBiggerIntInArray(mat);
        System.out.println();
        System.out.println("Это больший элемент в массиве: "+bigInt);
        replaceOddNumbersToBigint(mat, bigInt);
        printArray(mat);
    }
    //нахожу больший элемент в массиве
    public static int findBiggerIntInArray(int[][] arr) {
        bigInt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (bigInt < arr[i][j]) {
                    bigInt = arr[i][j];
                }
            }
        }
        return bigInt;
    }
    //меняю все нечетные элементы на наибольший элемент
    public static void replaceOddNumbersToBigint(int[][] arr, int rp) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] % 2 != 0) {
                    arr[i][j] = rp;
                }
            }
        }
    }
    //вывод на консоль
    public static void printArray(int [][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ,");

            }
        }
    }
}