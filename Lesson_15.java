package com.company;
//n
import java.util.Scanner;

//Найти все натуральные n-значные числа, цифры которыхобразуют строго возрастающую последовательность
//(например 1234, 5678). для решения использовать декомпозицию.
public class Lesson_15 {
    public static void main(String[] args) {
        //in view of the dimension of the numbers

        Scanner scanner = new Scanner(System.in);
        System.out.print("количество разрядов в числе ");
        int n = scanner.nextInt();

//создаем массив 10 злементов и заполняем его по порядку цифрами
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        //выводим n значные числа
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = i; j < n+i; j++) {
                System.out.print(arr[j]);
            }
        }
    }
}
