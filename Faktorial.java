package com.company;

public class Faktorial {
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
                factorialOfNumber(9);


        System.out.println(f);
    }
}


