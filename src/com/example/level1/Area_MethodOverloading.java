package com.example.level1;

import java.util.Scanner;

public class Area_MethodOverloading {

    public int area(int side)
    {

        return side*side;

    }

    public int area(int length, int breadth){
        return length*breadth;
    }
    public Double area(double r)
    {

        return 3.14*r*r;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value ");
        int side1= sc.nextInt();
        Area_MethodOverloading am=new Area_MethodOverloading();
        int result1=am.area(side1);
        System.out.println("area of square:" +result1);
        System.out.println("enter the value ");
        int length= sc.nextInt();
        System.out.println("enter the value ");
        int breadth= sc.nextInt();
       int result2= am.area(length,breadth);
        System.out.println("Area of rectangle:" +result2);
        System.out.println("enter the value ");
        double r=sc.nextInt();
        double result3=am.area(r);
        System.out.println("Area of circle: "+ result3);





    }
}
