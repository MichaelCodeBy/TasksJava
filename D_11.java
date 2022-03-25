package com.company;

public class D_11 {
    public static int count;
//расчитать в каком из предложенных чисел больше цифр
    //подсчет количества цифр в числе
    public static int getCountsOfDigits(int a) {
        while (a != 0) {
            count++;
            a /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int a = 73734;
        int b = 834456;
        getCountsOfDigits(a);
        int countA = count;
        count = 0;
        getCountsOfDigits(b);
        int countB = count;
        if (countA > countB) {
            System.out.println("В числе \"А\" больше цифр чем в числе \"В\"");
        } else if (countA == countB) {
            System.out.println("В числе \"B\" и в числе \"A\" равное количество цифр ");
        } else {
            System.out.println("В числе \"B\" больше цифр чем в числе \"A\"");

        }
    }
}
