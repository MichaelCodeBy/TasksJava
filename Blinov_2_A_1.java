package com.company;

import java.util.Scanner;

// Задания к главе 2
// Ввести N чисел, найти самое короткое и самое длинное число.
// Вывести найденные числа и их длину.

public class Blinov_2_A_1 {

    public static void main(String[] args) {

        int n; //количество strings
        String[] text; //creat array
        Scanner scan = new Scanner(System.in); //switch Scanner
        System.out.print("Ввведите количество строк-");
        if (scan.hasNextInt()) { // if integer then TRUE

            n = Integer.parseInt(scan.nextLine()); // insert array index
            int indexMax = 0;
            int indexMin = 0;
            text = new String[n]; //array with "n" strings
            System.out.println("Введите "+n+" чисел с переводом строки-");
            for (int i = 0; i < n; i++) {// cicl for find Min  and Max
                text[i] = scan.nextLine();// заполнение Array
                if (text[i].length() <= text[indexMin].length())
                    indexMin = i;
                if (text[i].length() >= text[indexMax].length())
                    indexMax = i;
            }

            System.out.printf("MIN (%d): \"%s\"%n", text[indexMin].length(), text[indexMin]);
            System.out.printf("MAX (%d): \"%s\"%n", text[indexMax].length(), text[indexMax]);
        }
    }
}
