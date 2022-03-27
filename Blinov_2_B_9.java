package com.company;

// Задания к главе 2 B № 9
// Ввести число от 1 до 12 Вывести название месяца соответствующего этому числу.
// Осуществить проверку корректности ввода чисел.

import java.util.Scanner;

public class Blinov_2_B_9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите любое число: ");
        int numberOfMonth = scan.nextInt();
        if (0 < numberOfMonth && numberOfMonth < 13) // correction of integer
            System.out.print("Good, this month is: ");
        else
            System.out.println("Месяца под таким номером нет, мне жаль.");
        if (numberOfMonth == 1)
            System.out.println("January");
        else if (numberOfMonth == 2)
            System.out.println("February");
        else if (numberOfMonth == 3)
            System.out.println("Mart");
        else if (numberOfMonth == 4)
            System.out.println("April");
        else if (numberOfMonth == 5)
            System.out.println("May");
        else if (numberOfMonth == 6)
            System.out.println("June");
        else if (numberOfMonth == 7)
            System.out.println("July");
        else if (numberOfMonth == 8)
            System.out.println("August");
        else if (numberOfMonth == 9)
            System.out.println("September");
        else if (numberOfMonth == 10)
            System.out.println("October");
        else if (numberOfMonth == 11)
            System.out.println("November");
        else if (numberOfMonth == 12)
            System.out.println("December");

    }
}
