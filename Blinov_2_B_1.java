package com.company;

// Задания к главе 2 B № 1
// Вывести на экран таблицу умножения.


public class Blinov_2_B_1 {

    public static void main(String[] args) {

        int[][] tabUmn = new int[10][11];//creat matrix
        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 1; j < 11; j++) {
                tabUmn[i][j] = (i + 1) * j;
                if (tabUmn[i][j]/10<1)
                    System.out.print(tabUmn[i][j] + "  ");
                else
                    System.out.print(tabUmn[i][j] + " ");
            }
        }

    }
}
