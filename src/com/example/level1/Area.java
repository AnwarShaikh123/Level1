package com.example.level1;

import java.util.Scanner;

class Rectangle {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }
}

class Triangle {
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Area {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for Rectangle
        System.out.println("Enter the value of length:");
        double rectLength = sc.nextDouble();

        System.out.println("Enter the value of breadth:");
        double rectBreadth = sc.nextDouble();

        Rectangle rect = new Rectangle(rectLength, rectBreadth);

        double rectArea = calculateRectangleArea(rect);
        System.out.println("Area of rectangle is: " + rectArea);

        // Input for Triangle
        System.out.println("Enter the value of base:");
        double triBase = sc.nextDouble();

        System.out.println("Enter the value of height:");
        double triHeight = sc.nextDouble();

        Triangle tri = new Triangle(triBase, triHeight);

        double triArea = calculateTriangleArea(tri);
        System.out.println("Area of triangle is: " + triArea);

        sc.close();
    }

    public static double calculateRectangleArea(Rectangle rectangle) {
        return rectangle.calculateArea();
    }

    public static double calculateTriangleArea(Triangle triangle) {
        return triangle.calculateArea();
    }
}
