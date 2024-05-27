package com.example.level1;

import java.util.Scanner;

public class Calculator {
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        double num1= sc.nextInt();
        System.out.println("Enter a number:");
        double num2= sc.nextInt();
        double result=add(num1,num2);
        System.out.println("result:"+result);
    }

    public  double add(double a,double b){
        return a+b;
    }


    public static void main(String[] args) {
        Calculator  calc=new Calculator();
        calc.input();

    }
}
