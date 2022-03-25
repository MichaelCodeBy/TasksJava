package com.company;

// написать метод вычисления суммы факториалов всех нечетных чисел от 1 до 9
public class D_07 {
    public static int f;

    //метод вычисления факториала числа
    public static int factorialOfNumber(int x) {
        f = 1;
        for (int i = 1; i <= x; i++) {
            f = f * i;
        }
        return f;
    }


    public static void main(String[] args) {
        int sumF = 0;
        for (int i = 1; i <= 9; i++) {
            if (i % 2 == 0) {
            continue;
            }else{
                factorialOfNumber(i);// only negative numbers from 1 to 9

                sumF = sumF + f;
            }
        }
        System.out.println("Сумма факториалов нечетных чисел от 1 до 9 включительно = "+sumF);//проверено на железном феликсе
    }
}
