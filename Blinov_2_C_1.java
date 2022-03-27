package com.company;

// Задания к главе 2 С № 1
// Ввести с консоли n размерность матрицы a[n][n].Задать значения элементов матрицы в размере -n до n.
// C помощью генератора случайных чисел.
// упорядочить строки матрицы в порядке возрастания значений элементов k-го столбца.

        import java.util.Arrays;
        import java.util.Random;
        import java.util.Scanner;

public class Blinov_2_C_1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Ввведите любое число: ");

        int n = scan.nextInt();
        int[][] a = new int[n][n]; //массив массивов  с n размерностью

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Random ran = new Random();
                int r = ran.nextInt(n + 1);
                boolean b = ran.nextBoolean();// assign plus or minus
                if (b == false)
                    r = r / -1;
                a[i][j] = r;
            }
        }
        for (int i = 0; i < n; i++) {// out to console array
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + ",");
                if (j == n - 1)
                    System.out.println();

            }

        }
        System.out.print("Insert number of sorting column-");
        int k = scan.nextInt();// insert number of sorting column

        int[] arrayLine = new int[n];
        System.out.println("Вывод " + k + " столбца массива- ");
        for (int i = 0; i < n; i++) {

            arrayLine[i] = a[i][k];
            System.out.println(arrayLine[i]);

        }
        System.out.println("Вывод отсортированного стобца массива");
        Arrays.sort(arrayLine);

        for (int i = 0; i < n; i++) {

            System.out.println(arrayLine[i]);
        }

    }
}
