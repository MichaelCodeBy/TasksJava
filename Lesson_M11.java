package com.company;

import java.util.Arrays;
import java.util.Random;

//n
/* матрицу 10 на 20 заполнить случайными числами от 0 до 15.
Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз*/
public class Lesson_M11 {
    public static void main(String[] args) {

        int[][] mat = new int[10][20]; //creat массив массивов  с размерностью 10 на 20

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                Random ran = new Random();// insert int to array random from 0 to 15
                int r = ran.nextInt(16);
                mat[i][j] = r;
            }
        }
        printArray(mat);
        findIntFiveInStringOfArray(mat);
    }

    public static void printArray(int[][] matrix) {
        for (int i = 0; i < 10; i++) {
            System.out.println();
            System.out.print("Строка " + (i + 1) + ": ");
            for (int j = 0; j < 20; j++) {
                System.out.print(matrix[i][j] + ",");
            }
        }
    }

    public static void findIntFiveInStringOfArray(int[][] matrix) {
        for (int i = 0; i < 10; i++) {
            int sum = 0;
            for (int j = 0; j < 20; j++) {
                if (matrix[i][j] == 5) {
                    sum++;
                } else if (sum ==3) {
                    System.out.println();
                    System.out.print("Строка " + (i + 1) + " имеет 3 и более чисел 5 ");
                    j=20;
                }else{
                    continue;
                }
            }
        }
    }

}
