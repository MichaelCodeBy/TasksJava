package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

//Вычислить площадь правильного шестиугольника со стороной а , используя метод вычисления площади треугольника.
public class D_03 {
    public static Object s;
    //double a = 0;

    public static double sqwearOfTriangl(double a) {
// углы треугольника вписанного в правильный шестиугольник = 60градусов
        double angle;
        //преобразуем градусы в радианы
        angle = toRadians(60);
        s = 0.5 * (pow(a, 2)) * ((sin(angle) * sin(angle)) / sin(angle));//расчет площади треугольника
        return (double) s;
    }

    public static void main(String[] args) {

        double a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер стороны шестиугольника: ");
        a= scan.nextDouble();
        double ofGrans=6;// количество граней многоугольника=кол-во треугольников
        double squerOfSixGran; //
        sqwearOfTriangl(a);
        System.out.println("Площадь треугольника со стороной "+a+" равна "+s);
        squerOfSixGran=(double)s * ofGrans;
        System.out.print("Площадь шестиугольника со стороной "+a+" равна "+squerOfSixGran);

    }
}
