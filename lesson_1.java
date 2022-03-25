package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//дана матрица, вывести на экран нечетные столбцы в которых первый элемент больше последнего.
class Lesson_1 {

    public static void main(String[] args) {
        int[] matrixVibor = new int[0];

        System.out.print("Ввведите любое число: "); //задаем размер матрицы
        Scanner scan = new Scanner(System.in);
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
        int j = 0;//print columns when first element bigger last)
        for (int i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (mat[i][0] > mat[i][n - 1]) ;
                else if (j / 2 != 0) ;
                matrixVibor[j] = j - 1;
            }

            {
                for (int k = 0; k < n; k++) { // вывод на печать согласно условию
                    System.out.println(mat[k][j - 1] + ",");

                }
            }
        }

        System.out.println(Arrays.deepToString(mat));
    }
}


//private static int toString(int[] ints)







