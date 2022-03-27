package com.company;

import java.util.Scanner;

// Задания к главе 2 № 3
// Ввести N чисел.
// Вывести числа длинна которых больше и меньше средней и их длину.

public class Blinov_2_A_3 {

    public static void main(String[] args) {

        int n; //количество strings
        String[] text; //create array
        Scanner scan = new Scanner(System.in); //switch Scanner
        System.out.print("Ввведите количество строк-");
        if (scan.hasNextInt()) { // if integer then TRUE

            n = Integer.parseInt(scan.nextLine()); // insert array index
            int indexMax = 0;
            int indexMin = 0;
            int midlIntOfArray =0;
            int sum = 0;

            text = new String[n]; //array with "n" strings
            System.out.println("Введите"+n+"чисел с переводом строки-");
            for (int i = 0; i < n; i++) {
                text[i] = scan.nextLine();// заполнение Array
                sum=sum+text[i].length();// summa digits of integers in array
            }
            midlIntOfArray=sum/n;
            System.out.println("средняя длина числа в архиве: " + midlIntOfArray );

            for (int i = 0; i < n; i++) {
                if (midlIntOfArray > text[i].length())
                    System.out.print(text[i]+" " );// вывод чисел меньших среднего
            }

        }

    }
}
