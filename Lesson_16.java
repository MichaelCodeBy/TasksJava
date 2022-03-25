package com.company;
//n
// Написать программу, определяющую сумму n-значных чисел, содержащих только нечетные цифры.
// Определить также сколько четных цифр в найденной сумме. Для решения использовать декомпозицию.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class Lesson_16<sum> {
    public static void DigitsInNumber(int number) {
//метод вычисления суммы нечетных цифр из числа разрядностью n
        String n = Integer.toString(number);//переводим iteger to String
        char[] charArray = n.toCharArray();//create char array
        List<Integer> cia = new ArrayList<Integer>();//creat cia listing
        for (int i = 0; i < charArray.length; i++) {//incert int to list
            int c = Character.getNumericValue(charArray[i]);
            cia.add(c);
        }
        System.out.println(cia);// вывод списка цифр числа n-ной разрядности
        int num = 0;
        int kolChetCifr=0;
//выбираем нечетные цифры из числа и складываем
        for (int i = 0; i < cia.size(); i++) {
            if (cia.get(i) % 2 != 0)
                num += cia.get(i);
            else
            {
                System.out.println("Это число " + cia.get(i) + " четное. ");}
        }
        System.out.println("Сумма нечетных цифр числа ="+num);
//int num=num;


        //System.out.println("четных цифр в числе суммы нечетных= "+kolChetCifr);

    }
   public static void SumNechDig(int num) {
       String m = Integer.toString(num);//переводим iteger to String
       char[] charArray = m.toCharArray();//create char array
       List<Integer> cia2 = new ArrayList<Integer>();//creat cia listing
        for(
       int i = 0;
       i<charArray.length;i++)

       {//incert int to list
           int c = Character.getNumericValue(charArray[i]);
           cia2.add(c);
       }
        System.out.println(cia2);// вывод списка цифр

       int kolChetCifr = 0;
//выбираем четные цифры из числа и складываем
        for(
       int i = 0; i<cia2.size();i++)

       {
           if (cia2.get(i) % 2 == 0)
               System.out.println("Это число " + cia2.get(i) + " нечетное. ");
           else {
               System.out.println("Это число " + cia2.get(i) + " четное. ");
           }
           kolChetCifr++;
       }
   }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введи кол-во знаков в числе ");
        int stOfDigit = scan.nextInt();
        System.out.print("Введи число " + stOfDigit + " знаков ");
        int number = scan.nextInt();

        DigitsInNumber(number);


    }
}