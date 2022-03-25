package com.company;
//n
public class Lesson3_1 {
    public static void Main(String[] args) {
        int counter = 1;
        int[][] matrix = new int[9][9];

        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[0].length; y++) {
                matrix[x][y] = counter;
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }

        for (int x = 0; x < matrix.length; x++) {
            int[] row = matrix[x];
        }

    }
}

