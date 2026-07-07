package com.java.fundamentals;

import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte age;
        int salary;

        System.out.println("Enter Age :");
        age = sc.nextByte();

        System.out.println("Emter Salary : ");
        salary = sc.nextInt();

        System.out.println("age :"+age);
        System.out.println("Salary : "+salary);

        sc.close();
    }
}
