package com.company;
/* Задана матрица неотрицательных чисел.
 Посчитать сумму элементов в каждом столбце.
 Определить какой элемент содержит максимальную сумму.*/

import java.util.Arrays;
import java.util.Random;

//n2
public class Lesson_M9 {
    private static int sum;
    public static void fillArrayRandom(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                Random ran = new Random();// insert random int to array
                int r = ran.nextInt(9);
                arr[i][j] = r;
            }
        }
    }
    public static void printArray(int [][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ,");
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        fillArrayRandom(matrix); //заполнение матрицы случайными числами
        printArray(matrix);//вывод на консоль матрицы
        int[] temp = new int[10];
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            summOfColumn(matrix, i);
            temp[i] = sum;//заполнение массива темп
            //System.out.print(temp[i]+" ,");
        }

        maxSumOfColumn(temp);
    }
//подсчет сумм каждого столбца матрицы
    public static int summOfColumn(int[][] mat, int numOfColumn) {
        //int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum = sum + mat[i][numOfColumn];
        }
        //System.out.println(sum);
        return sum;

    }

    public static int maxSumOfColumn(int[] t) {
        int max = 0;
        for (int i = 0; i < t.length; i++) {

            if (max < t[i]) {
                max = t[i];
            }
        }
        System.out.println("Максимальная сумма в столбце матрицы= " + max);
        return max;
    }

}