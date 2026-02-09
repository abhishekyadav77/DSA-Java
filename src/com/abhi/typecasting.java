package com.abhi;

import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
//        float num = input.nextFloat();
//        int num = input.nextInt();
//        System.out.println(num);
    // type casting
//        int num = (int)(67.62f);
//        System.out.println(num);
//
//        //Auto matic type promotion in expressions
//        int a = 254;
//        byte b = (byte)(a);
//
//        System.out.println(b);

        int number = 'A';
        System.out.println(number); // ascii values are printed


         byte b= 24;
         int i = 50000;
         char c = 'a';
         short s = 1024;
         float f= 5.67f;
         double d= 0.1234;
         double result = (f*b)+(i/c)-(d-s);
        System.out.println(result);

    }
}
