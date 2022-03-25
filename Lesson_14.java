package com.company;
//натуральное число в записи которого n цифр называется числом армстронга,
// если сумма его циф возведенная в степень n равна самому числу
//найти все числа Армстронга от 1 до к. В решении использовать декомпозицию.

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Lesson_14 {
    public static void main(String[] args) {
        //составить ряд натуральных чисел
        Scanner scan = new Scanner(System.in);
        System.out.print("Ввести натуральное число К-");
        int k= scan.nextInt();
        for (int i = 0; i < k; i++) {

        }
        //сделать метод разделяющий числа на цифры
        //методом подстановки проверить на соответствие числу КрепкойРуки
        //вывести на консоль числа КрепкойРуки
        int num=7263; // num2=92820;
        String number = String.valueOf(num);// перевод в строчный тип
        for(int i = 0; i < number.length(); i++) { //цикл размером в строку
            double j = Character.digit(number.charAt(i), 10);//присваивание цифры по счету

          //  double sqOfJ=  pow( double z = j, number.length());
            System.out.println("digit of first int: " + j); //вывод в консоль
        }
        }
    }

