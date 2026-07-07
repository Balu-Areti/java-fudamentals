package com.java.fundamentals;

import java.util.Scanner;

public class ProductData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Product id : ");
        int productId = sc.nextInt();

        System.out.println("Enter Product Code: (Single Character");
        char productCode = sc.next().charAt(0);

        System.out.println("Enter category Code : ");
        short categoryCode = sc.nextShort();

        System.out.println("quantity :");
        short quantity = sc.nextShort();

        System.out.println("Enter unit price : ");
        double price = sc.nextDouble();

        System.out.println("Discount: ");
        float discount = sc.nextFloat();

        System.out.println("Supplier Contact: ");
        long supplierContact = sc.nextLong();

        System.out.println("isAvailable");
        boolean isAvailable = sc.nextBoolean();

        System.out.println("rating :");
        byte rating = sc.nextByte();

        System.out.println("\n--- Product Details ---");
        System.out.println("Product ID: " + productId);
        System.out.println("Product Code: " + productCode);
        System.out.println("Category Code: " + categoryCode);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Supplier Contact: " + supplierContact);
        System.out.println("Available: " + isAvailable);
        System.out.println("Rating: " + rating);
    }
}
