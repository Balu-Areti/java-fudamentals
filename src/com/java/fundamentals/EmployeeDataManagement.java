package com.java.fundamentals;

import java.util.Scanner;

public class EmployeeDataManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int employeeId = sc.nextInt();

        System.out.print("Enter Employee Initial: ");
        char employeeInitial = sc.next().charAt(0);

        System.out.print("Enter Age: ");
        byte age = sc.nextByte();

        System.out.print("Enter Department Code: ");
        char departmentCode = sc.next().charAt(0);

        System.out.print("Enter Monthly Salary: ");
        double monthlySalary = sc.nextDouble();

        System.out.print("Enter Years of Experience: ");
        short experienceYears = sc.nextShort();

        System.out.print("Enter Mobile Number: ");
        long mobileNumber = sc.nextLong();

        System.out.print("Is Permanent Employee (true/false): ");
        boolean isPermanent = sc.nextBoolean();

        System.out.print("Enter Performance Rating (1–5): ");
        float rating = sc.nextFloat();

        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Initial: " + employeeInitial);
        System.out.println("Age: " + age);
        System.out.println("Department Code: " + departmentCode);
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Experience: " + experienceYears + " years");
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Permanent: " + isPermanent);
        System.out.println("Rating: " + rating);

        sc.close();
    }
}

/*
--- Employee Details ---
ID: 101
Age: 28
Department Code: T
Salary: 45000.75
Experience: 5 years
Mobile: 9876543210
Permanent: true
Rating: 4.5
* */