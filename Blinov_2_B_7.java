package com.company;

// Задания к главе 2 B № 7
// Написать код программы, которая переводила бы числа из десятичной системы в любую другую.

import java.util.Scanner;

public class Blinov_2_B_7 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Ввведите любое число: ");
        int integer=scan.nextInt();
        System.out.println(Integer.toString(integer, 2));
    }
}
