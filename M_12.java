package com.company;
/* отсортировать строки матрицы по возрастанию и убыванию значений элементов*/

import com.sun.source.util.SourcePositions;

import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

public class M_12 {

    public static void main(String[] args) {
        int[][] mat = new int[10][20]; //creat массив массивов  с размерностью 10 на 20
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                Random ran = new Random();// insert int to array random from 0 to 15
                int r = ran.nextInt(16);
                mat[i][j] = r;
            }
        }
        for (int i = 0; i < 10; i++) {
            Arrays.sort(mat[i]); //отсортировали строки по возрастанию.
            sortingArrayRevers(mat);
        }
        printArray(mat);
    }
    public static void sortingArrayRevers(int[][] matrix) {
        int[] temp = new int[20];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                temp[j] = matrix[i][j];
                matrix[i][j] = matrix[i][19 - j];
                matrix[i][19 - j] = temp[j];
            }
        }
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ,");

            }
        }
    }
}

