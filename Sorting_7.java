package com.company;
// Даны две неубывающие последоватеьности. надо указать те места,
// на которые нужно вставлять элементы последовательности b
// в последовательность а,
// чтобы новая последовательность осталась возрастающей.

import java.sql.SQLOutput;

public class Sorting_7 {
    public static void unitedArray(int[] a, int[] b) {
        if (b[0] < a[0]) {
            System.out.println("номер позиции " + 0 + " последовательности В встанет по номеру " + 0 + " последовательности А ");
        }
        for (int i = 0; i < (a.length - 1); i++) {
            for (int j = 0; j < b.length; j++) {

                if (a[i] <= b[j] && b[j] <= a[i + 1]) {

                    System.out.println("номер позиции " + j + " последовательности В встанет по номеру " + (i + 1) + " последовательности А ");

                    j = b.length;
                }
            }

        }
        if (b[b.length - 1] > a[a.length - 1]) {
            System.out.println("номер позиции " + (b.length - 1) + " последовательности В встанет по номеру " + (a.length) + " последовательности А ");
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 7, 9, 12, 14, 27, 38, 52, 70};
        int[] b = {1, 3, 4, 8, 26, 36, 58, 169,};//первый не проходит и последний не проходит!

        unitedArray(a, b);

    }
}
