package com.company;
//n2

import java.util.Arrays;

//сформировать квадратную матрицу порядка н по заданному образцу (н четное)
public class Lesson_M6 {
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            //System.out.print("Строка " + (i + 1) + ": ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + ",");
            }
        }
    }

    public static void main(String[] args) {

        int n = 8;
        int dat = 1;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - i; j++) {

                matrix[j][i] = dat;
            }
        }
        //System.out.println(Arrays.deepToString(matrix));//what I see

        printArray(matrix);
    }

}

//class NowiClass {
// System.out.println("das ist new class");


