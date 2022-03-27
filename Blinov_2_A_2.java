package com.company;
import java.util.Arrays;
import java.util.Scanner;

// Задания к главе 2 задача 2
// Ввести N чисел.
// Упорядочить и вывести числа в порядке возрастания (убывания) значений их длинны.

public class Blinov_2_A_2 {

    public static void main(String[] args) {

        int n; //количество строк
        int[] text; //creat Int array
        Scanner scan = new Scanner(System.in); //switch Scanner
        System.out.print("Ввведите количество строк-");
        if (scan.hasNextInt()) { // if integer then TRUE

            n = scan.nextInt(); // insert array index
            text = new int[n]; //array with "n" strings
            System.out.println("Введите " + n + " чисел с переводом строки-");
            for (int i = 0; i < n; i++) {// insert to array
                text[i] = scan.nextInt();
            }
            Arrays.sort(text);
            //Выводим отсортированный массив на консоль.
            for (int i = 0; i < n; i++) {
                System.out.print(text[i] + "  ");
            }
            System.out.println();
            //Выводим массив в обратной последовательности на консоль.
            for (int i = n-1; i >= 0; i--) {
                System.out.print(text[i] + "  ");
            }
        }
    }
}
