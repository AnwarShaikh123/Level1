package com.example.level1;

public class MethodOverloading {
    public int sum(int a,int b){
        return a+b;
    }
public int sum(int a, int b, int c)
{
    return a+b+c;
}
public int sum (int a, int b,int c, int d)
{
    return a+b+c;
}
    public static void main(String[] args) {
        MethodOverloading methodOverloading=new MethodOverloading();
       int result1= methodOverloading.sum(2,3);
        System.out.println("result1:" +result1);
        int result2=methodOverloading.sum(2,4,7);
        System.out.println("result2:" +result2);
        int result3=methodOverloading.sum(2,6,9,0);
        System.out.println("result3:" +result3);

    }
}
