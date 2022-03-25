package com.company;
//n
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

//задачи масив массивов. Дана матрица, вывести к строку и p столбец этой матицы
class Lesson_3 {
    // creat metod out of column
    public static int[] getColumn(int[][] array, int index) {
        int[] column = new int[array[0].length];
        for (int i = 0; i < column.length; i++) {
            column[i] = array[i][index];
        }
        return column;

    }

    // creat metod out of string
    public static int[] getString(int[][] array, int index) {
        int[] string = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            string[i] = array[index][i];
        }
        return string;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Ввведите любое число: "); //задаем размер матрицы

        int n = scan.nextInt();
        int[][] matrix = new int[n][n]; //creat массив массивов  с n размерностью
// insert array from random
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Random ran = new Random();
                int r = ran.nextInt(n + 1);
                boolean b = ran.nextBoolean();// assign plus or minus
                if (b == false)
                    r = r / -1;
                matrix[i][j] = r;

            }
        }

        int k, p;
        //print string
        System.out.println("Введите переменную к она должна быть >=0 и <" + n);
        k = scan.nextInt();
        System.out.println("string-k " + Arrays.toString(getString(matrix, k)));

        //print column
        System.out.println("Введите переменную p она должна быть >=0 и <" + n);
        p = scan.nextInt();
        System.out.println("column-p " + Arrays.toString(getColumn(matrix, p)));
    }
}
