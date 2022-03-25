package com.company;

import java.util.Scanner;

//написать метод для проверки, являются ли три числа взаимно простыми
public class D_06 {
    private static float a;
    private static float b;
    private static float c;
    private static float nod;


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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// insert numbers
        System.out.print("Введите а ");
        a = scan.nextFloat();
        System.out.print("Введите b ");
        b = scan.nextFloat();
        System.out.print("Введите c ");
        c = scan.nextFloat();

        evklid(a, b);
        float nodA=nod;
        //System.out.println(nodA);
        evklid(b, c);
        float nodB=nod;
        //System.out.println(nodB);
        evklid(a, c);
        float nodC=nod;
        //System.out.println(nodC);
        if ((nodA==1) && (nodB==1) && (nodC==1)) {
            System.out.println("Эти три числа: "+a+", "+b+", "+c+ " являются взаимно простыми.");
        }else{
            System.out.println("Эти три числа: "+a+", "+b+", "+c+ " не взаимно простые.");
        }
    }
}
