package com.company;

import java.util.Scanner;

import static java.lang.Math.sqrt;

//даны числа x,y,z,t-длины сторон четырехугольника. Угол между х у прямой. Написать методы вычисления его площади
public class D_09 {
    public static double x;
    public static double y;
    public static double z;
    public static double t;
    public static double s1;
    public static double b;// гипотенуза
    public static double sqver;

    //расчет площади прямоугольного треугольника
    public static double sqverOfTriangl(double x, double y){
        s1=(x*y)/2;
        return s1;
    }
    //расчет гипотенузы прямоугольного треугольника
    public static double gipotenuzaOfTringle(double x,double y){
        b=sqrt(x*2+y*2);
        return b;
    }
    //расчет площади треугольника по трем сторонам
public static double sqverOfTriangleFromThreeSide(double z,double t,double b){
        double p=(z+t+b)/2;
        sqver=sqrt(p*(p-z)*(p-t)*(p-b));
        return sqver;
}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// insert numbers
        System.out.print("Введите x ");
        x = scan.nextDouble();
        System.out.print("Введите y ");
        y = scan.nextDouble();
        System.out.print("Введите z ");
        z = scan.nextDouble();
        System.out.print("Введите t ");
        t = scan.nextDouble();
        gipotenuzaOfTringle(x,y);
        System.out.println("Гипотенуза= "+b);
        sqverOfTriangl(x,y);
        System.out.println("Площадь прямоугольного треугольника= "+ s1);
        sqverOfTriangleFromThreeSide(z,t,b);
        System.out.println("Площадь треугольника по трем сторонам= "+sqver);
        double sqverOfquadrangle=s1+sqver;
        System.out.println("Площадь прямоугольника= "+sqverOfquadrangle);

    }
}
