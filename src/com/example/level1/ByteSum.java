package com.example.level1;

import java.util.Scanner;

public class ByteSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        byte byte1= sc.nextByte();
        System.out.println("Enter a number:");
        byte byte2= sc.nextByte();

        int int1=(int) byte1;
        int int2=(int) byte2;

       int sum= int1+int2;

       System.out.println(" sum: "  +sum);

    }

}
