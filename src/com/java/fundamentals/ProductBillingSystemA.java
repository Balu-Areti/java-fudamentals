package com.java.fundamentals;

import java.util.Scanner;

public class ProductBillingSystemA {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product Price : ");
        double price = sc.nextDouble();

        System.out.println("Enter Membership Type (S=Silver, G=Gold, D=Diamond, N=None): ");
        char membership = sc.next().toUpperCase().charAt(0); // .toUpperCase() makes it easy to compare

        System.out.println("Enter quantity : ");
        int quantity = sc.nextInt();

        // Variables for our logic
        double discountPercent = 0;
        double shippingCharge = 100; // Default for no membership

        // 2. Conditional Logic for Membership
        if (membership == 'S'){
            discountPercent = 10.0;
            shippingCharge = 50.0;
        } else if (membership == 'G') {
            discountPercent = 15.0;
            shippingCharge = 20.0;
        } else if (membership == 'D') {
            discountPercent = 20.0;
            shippingCharge = 0.00; //Free shipping Charges
        }else {
            // Any other character means No Membership
            discountPercent = 0;
            shippingCharge = 100.0;
        }

        // 3. Mathematical Calculations
        double discountAmount = price * (discountPercent/100);
        double discountedPrice = price - discountAmount;

        // Taxes (2.5% each on the discounted price)
        double stateTax = discountedPrice * 0.025;
        double centralTax = discountedPrice * 0.025;

        // Final per product price
        double finalPricePerProduct = discountedPrice + stateTax + centralTax;

        // Final bill for total quantity
        double finalBill = (finalPricePerProduct * quantity) + shippingCharge;

        // Total savings calculation
        // Saved on discount + Saved on shipping (Standard 100 - Actual Shipping)
        double savedOnShipping = 100.0 - shippingCharge;
        double totalSavings = (discountAmount * quantity) + savedOnShipping;

        // 4. Output Printing
        System.out.println("\n===== BILLING SUMMARY =====");
        System.out.println("Original Price Per Product : ₹" + price);
        System.out.println("Discount Applied (" + discountPercent + "%) : -₹" + discountAmount);
        System.out.println("State Tax (2.5%)           : +₹" + stateTax);
        System.out.println("Central Tax (2.5%)         : +₹" + centralTax);
        System.out.println("---------------------------------");
        System.out.println("Final Price (1 Product)    : ₹" + finalPricePerProduct);
        System.out.println("Quantity Purchased         : " + quantity);
        System.out.println("Shipping Charges           : +₹" + shippingCharge);
        System.out.println("=================================");
        System.out.println("Total Bill Amount          : ₹" + finalBill);
        System.out.println("🎉 Total Amount Saved      : ₹" + totalSavings);
        System.out.println("=================================");


    }
}
