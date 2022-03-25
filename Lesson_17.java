package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

//из заданного числа вычти сумму его чисел и потом из того что получилось опять вычти и так до того пока не выйдет 0
public class Lesson_17 {
    // private static int sum = new int ;
    private static int sum = 0;

    //метод вычисления суммы цифр из числа
    public static int SumDigitsInNumber(int number) {

        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
      //  System.out.println("The sum is " + sum);
        return sum;

    }


    public static void main(String[] args) {

        int number = 949383;
        SumDigitsInNumber(number);
        for (int i = number; number >= 0; number -= sum) {//minus summ of digit from number and go to zero/
            System.out.println(number);

        }
    }
}
