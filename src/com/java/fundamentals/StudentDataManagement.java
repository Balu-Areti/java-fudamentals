package com.java.fundamentals;

import java.util.Scanner;

public class StudentDataManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: read rollNumber (int), age (byte), section (char),
        // totalMarks (int), averageMarks (float), yearOfJoining (short),
        // mobileNumber (long), passed (boolean)
        // TODO: print "--- Student Details ---" and each labeled field
        /*  --- Student Details ---

*/

        System.out.println("---Student Details---");

        //totalMarks (int)
        System.out.println("Enter roll number :");
        int rollNumber = sc.nextInt();

        System.out.println("Age : ");
        byte age = sc.nextByte();

        System.out.print("Enter Section: ");
        char section = sc.next().charAt(0);

        System.out.println("Enter Total Marks : ");
        int totalMarks = sc.nextInt();

        System.out.println("Enter Average Marks: ");
        float averageMarks = sc.nextFloat();

        System.out.println("Enter year of Joining :");
        short yearOfJoining = sc.nextShort();

        System.out.println("Enter Mobile Number :");
        long mobileNumber = sc.nextLong();

        System.out.println("Is Passed? (true/false): ");
        boolean isPassed = sc.nextBoolean();


        System.out.println("--- Student Details ---");
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Age: " + age);
        System.out.println("Section: " + section);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average: " + averageMarks);
        System.out.println("Year of Joining: " + yearOfJoining);
        System.out.println("Mobile: " + mobileNumber);
        System.out.println("Passed: " + isPassed);





        sc.close();
    }
}