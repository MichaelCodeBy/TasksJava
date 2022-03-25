package com.company;

import java.io.Console;
import java.util.Scanner;

//Написать метод для нахождения наибольшего общего делителя четырех натуральных чисел.
public class D_02 {

    //метод вычисления наибольшего общего делителя по формуле Евклида
    public static void evklid(int a, int b) {
        while ((a != 0) && (b != 0)) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        System.out.print(a + b + " ,");
    }

    public static void main(String[] args) {
        int[] numbers = new int[4];
        Scanner scan = new Scanner(System.in);// insert numbers to array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Введите число: ");
            numbers[i] = scan.nextInt();
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.println();
            evklid(numbers[i], numbers[i + 1]);// run metod of Evklid for numbers
        }
    }

}

