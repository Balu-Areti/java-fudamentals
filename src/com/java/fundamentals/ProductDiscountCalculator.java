package com.java.fundamentals;
import java.util.Scanner;

    public class ProductDiscountCalculator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // 1. Reading Inputs
            System.out.print("Enter Product Price: ");
            double productPrice = sc.nextDouble();

            System.out.print("Enter Discount Percentage: ");
            double discountPercentage = sc.nextDouble();

            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();

            // Fixed Tax Values
            double stateTax = 2.5;
            double centralTax = 2.5;

            // 2. Calculations (Step-by-Step as per Assignment)

            // Mana logic: (price * percentage) / 100
            double discountAmount = (productPrice * discountPercentage) / 100;

            double discountedPrice = productPrice - discountAmount;

            // Tax amount on the discounted price
            double stateTaxAmount = (discountedPrice * stateTax) / 100;
            double centralTaxAmount = (discountedPrice * centralTax) / 100;

            // Final Price of One Product
            double finalPrice = discountedPrice + stateTaxAmount + centralTaxAmount;

            // Amount Saved on One Product
            double savedAmount = productPrice - finalPrice;

            // Final Bill & Total Savings based on Quantity
            double finalBill = finalPrice * quantity;
            double totalSaved = savedAmount * quantity;

            // 3. Output Printing
            System.out.println("\n===== 🛒 BILLING SUMMARY =====");
            System.out.println("Product Price              : ₹" + productPrice);
            System.out.println("Discount Percentage        : " + discountPercentage + "%");
            System.out.println("Discount Amount            : -₹" + discountAmount);
            System.out.println("Discounted Price           : ₹" + discountedPrice);
            System.out.println("State Tax (2.5%)           : +₹" + stateTaxAmount);
            System.out.println("Central Tax (2.5%)         : +₹" + centralTaxAmount);
            System.out.println("------------------------------------");
            System.out.println("Final Price (1 Product)    : ₹" + finalPrice);
            System.out.println("====================================");
            System.out.println("Final Bill Amount ("+quantity+" items) : ₹" + finalBill);
            System.out.println("🎉 Total Amount Saved      : ₹" + totalSaved);
            System.out.println("====================================");
        }
    }
