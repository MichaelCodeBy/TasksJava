package com.company;
//задачи масив массивов. вывести на экран элементы стоящие на диагонали

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//n
public class Lesson_2 {
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
       // System.out.println(Arrays.deepToString(mat));//print all array

        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][i] + ",");// print diagonal of array from left to rite
        }

    }
}
