package com.abhi;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first Number");
        int num1 = input.nextInt();
        System.out.println("Enter Second Number");
        int num2 = input.nextInt();
        int sum = num2+num1;

        System.out.println("The Sum is " +sum);


    }
}
