package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//n
// найти положительные элементы главной диагонали квадратной матрицы.

public class Lesson_M10 {
    public static void printArray(int [][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + ", ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ввведите любое число: "); //задаем размер матрицы

        int n = scan.nextInt();
        int[][] mat = new int[n][n]; //creat массив массивов  с n размерностью
// insert array from random
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Random ran = new Random();
                int r = ran.nextInt(n + 1);
                boolean b = ran.nextBoolean();// assign plus or minus
                if (b == false)
                    r = r / -1;
                mat[i][j] = r;
            }
        }
        printArray(mat);
        System.out.println();
        System.out.print("положительные элементы диагонали квадратной матрицы: ");
        for (int i = 0; i < n; i++) {
            if (mat[i][i]>0)
            System.out.print(mat[i][i] + ",");
        }
        System.out.println();
        System.out.print("положительные элементы второй диагонали квадратной матрицы: ");
        int t=mat.length-1;
        for (int j = 0; j < mat.length; j++) {
                if (mat[t][j] > 0) {
                    System.out.print(mat[t][j] + ",");
                    System.out.println();
                }
            t=t-1;
            }
        }
    }

