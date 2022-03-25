package com.company;
//n
import java.util.Arrays;
import java.util.Scanner;

//сформировать квадратную матрицу размером n по представленному образцу. n чётная.
public class Lesson_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ввести четное число -");
        int n = scan.nextInt();// insert the size of matrix
        int[][] matrix = new int[n][n]; // create matrix
        for (int i = 0; i < n; i++) {//insert all cells for 1,2,3....
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (j + 1);

            }
        }

        System.out.println(Arrays.deepToString(matrix));//print array for viewing
        //
        for (int i = 1; i < n; i += 2) {//insert x-cells for n,....2,1
            int k = n;
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (k--);

            }
        }
        System.out.println(Arrays.deepToString(matrix));//print array for viewing
    }

}