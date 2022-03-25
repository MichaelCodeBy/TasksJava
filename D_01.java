package com.company;

import java.util.Scanner;

//Написать метод для нахождения наибольшего общего делителя и наименьшего общего кратного.
public class D_01 {
    private static float nod;
    private static float nok;
    private static float a;
    private static float b;

    public static float evklid(float a, float b) {//наибольший общий делитель двух чисел
        while ((a != 0) && (b != 0)) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        nod = a + b;
        return nod;
    }

    public static float raschetNOK(float a, float b, float nod) {//наименьшее общее кратное
        nok = (a * b) / nod;
        return nok;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// insert numbers
        System.out.print("Введите а ");
        a=scan.nextFloat();
        System.out.print("Введите b ");
        b=scan.nextFloat();
        evklid(a,b);
        raschetNOK(a,b,nod);
        System.out.println("NOD= "+ nod);
        System.out.println("NOK= "+nok);
    }
}
