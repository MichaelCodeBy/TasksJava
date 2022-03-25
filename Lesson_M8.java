package com.company;
//n2
/* в квадратной числовой матрице поменять местами два любых столбца.
 номера столбцов вводит пользователь с клавиатуры */

import java.util.Random;
import java.util.Scanner;

public class Lesson_M8 {
    public static void fillArrayRandom(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                Random ran = new Random();// insert random int to array
                int r = ran.nextInt(9);
                arr[i][j] = r;
            }
        }
    }
    private static void swapColumns(int[][] m, int ft, int sd) {
        //меняем элементы в каждой строке
        for(int r=0; r<m.length; r++) {
            int temp = m[r][ft]; // темпу присваивается значение первого выбранного элемента
            m[r][ft] = m[r][sd];// первому выбранному присваивается значение второго
            m[r][sd] = temp;// второму присваивается значение первого через темп
            // и так по кругу все строки
        }
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + ",");
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix= new int[10][10];
        fillArrayRandom(matrix);
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите номер первого столбца для замены: ");
        int first=scan.nextInt();
        System.out.print("Введите номер второго столбца для замены: ");
        int second=scan.nextInt();

        printArray(matrix);
        System.out.println();

        swapColumns(matrix,first,second);

        printArray(matrix);
    }

}
