package com.company;

import java.util.Random;

public class Main {
    public static void printArray(int [][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ,");

            }

        }
    }
    public static void fillArrayRandom(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                Random ran = new Random();// insert random int to array
                int r = ran.nextInt(9);
                arr[i][j] = r;
            }
        }
    }


    public static void main(String[] args) {

        System.out.println("Hello world");// write your code here
    }
}
