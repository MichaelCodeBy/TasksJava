package com.company;

// Задания к главе 2 B № 4
// Вывести на экран все числа от 1 до 100, которые делятся на 3 без остатка.

public class Blinov_2_B_4 {

    public static void main(String[] args) {
        System.out.print("числа от 1 до 100, которые делятся на 3 без остатка: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + ", ");
        }
    }
}
