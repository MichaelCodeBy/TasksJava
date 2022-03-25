package com.company;

import java.util.Arrays;
import java.util.Scanner;

//построить магический квадрат
public class M_16HZ {

    private static int[][] matrix=new int[5][5];

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ,");
            }
        }
    }
    public static void main(String[] args) {

        insertMagicSquare(matrix,5);
        printArray(matrix);
    }

    //заполнение матрицы магического квадрата
    private static int[][] insertMagicSquare(int [][] matrix, int n) {

        for (int i = 0; i < n; i++) {
            Arrays.fill(matrix[i], 0);
        }
        int count = 1, y = 0, x = matrix.length/2;
        while (true){
            matrix[y][x] = count;

            count++;
            if (((y == 0) && (x >= n-1)) && (matrix[n-1][0] != 0)){
                y++;
            }
            else {
                y--;
                if (y < 0) {
                    y = n - 1;
                }
                x++;
                if (x == n) {
                    x = 0;
                }
                if(matrix[y][x]!=0){
                    y+=2;
                    x--;
                }
            }

            if(count==n*n+1) break;
        }

        //System.out.println(Arrays.deepToString(matrix));
        return matrix;
    }
}




