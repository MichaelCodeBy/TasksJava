package com.company;

import java.util.Arrays;
import java.util.Random;

// сформировать случайную матрицу МхN , состоящую из нулей и единиц,
// причем в каждом столбце число единиц = номеру столбца
public class M_14 {
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ,");
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = new int[10][10]; //creat массив массивов  с размерностью любой
        for (int i = 0; i < mat.length; i++) {
            for (int j = i; j < mat.length; j++) { // all next column +1
                int r = 1;// insert int 1 to array
                mat[i][j] = r;
            }
        }
        //fUr наглядности.
        printArray(mat);
    }
}