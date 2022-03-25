package com.company;
//n
// сортировка методом Шелла
public class Sorting_6 {
    public static void sortingOfShell(int[] arr) {
        int d = arr.length / 2;//делим масссив пополам
        while (d > 0) {
            for (int i = 0; i < (arr.length - d); i++) {
                int j = i;
                //перестановка элементов массива
                while ((j >= 0) && (arr[j] > arr[j + d])) {
                    int temp = arr[j];
                    arr[j] = arr[j + d];
                    arr[j + d] = temp;
                    j--;
                }

            }
            d = d / 2;//делим части массива еще на две части
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");//вывод на кансоль

        }
    }

    public static void main(String[] args) {
        int[] arr = {52, 45, 9, 6, 7,4,34, 96, 2, 5,27};
        sortingOfShell(arr);
    }
}
