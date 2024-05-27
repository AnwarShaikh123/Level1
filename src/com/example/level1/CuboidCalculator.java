package com.example.level1;

import java.util.Scanner;

class Cuboid{
double length;
 double breadth;
 double height;

public  Cuboid(double length,double breadth,double height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
}
public  double CalculatePerimeter()
{
    double perimeter=4*(length+breadth+height);
    System.out.println("Perimeter of cuboid is" +perimeter);
    return perimeter;
}
public  double CalculateArea()
{
   double perimeter= CalculatePerimeter();
    double area = 2 * (length * breadth + breadth * height + height * length);
    System.out.println("Area of cuboid is" +area);
    return area;
}
  public double CalculateVolume() {
        double area = CalculateArea();
        double volume = length * breadth * height;
        System.out.println("volume of cuboid is" + volume);
return volume;
}

    }
public class CuboidCalculator {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of length: ");
        double length = sc.nextDouble();
        System.out.println("Enter the value of breadth: ");
        double breadth = sc.nextDouble();
        System.out.println("enter the value of height: ");
        double height = sc.nextDouble();

       Cuboid cuboid = new Cuboid(length, breadth, height);
        cuboid.CalculateVolume();
    }


}
