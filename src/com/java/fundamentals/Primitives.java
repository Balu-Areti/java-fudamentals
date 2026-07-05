package com.java.fundamentals;

public class Primitives {
    public static void main(String[] args) {
        System.out.println("=== SMARTPHONE SPECIFICATIONS (Real-World Primitives) ===");

        // ---------------------------------------------------------
        // 1. INTEGER TYPES (Whole numbers - No decimal points)
        // ---------------------------------------------------------

        // 🟢 byte (Size: 1 byte | Range: -128 to 127)
        // Use case: For very small numbers. RAM size rarely exceeds 127 GB, so byte is perfect to save memory.

        byte ramSize = 12;
        System.out.println("RAM SIZE : "+ ramSize + "GB");


        // 🟢 short (Size: 2 bytes | Range: -32,768 to 32,767)
        // Use case: Numbers slightly larger than byte. A year will never exceed 32,000, making short ideal.
        short releaseYear = 2026;
        System.out.println("Release Year :"+ releaseYear);

        // 🟢 int (Size: 4 bytes | Range: -2 Billion to 2 Billion)
        // Use case: The default data type for numbers. Used for Price, Salary, Views, etc.
        int smartphonePrice = 125000;
        System.out.println("Price : RS " + smartphonePrice);

        // 🟢 long (Size: 8 bytes | Range: Extremely large numbers)
        // Use case: Bank accounts, Phone numbers, IMEI numbers.
        // MASTER RULE: You MUST append 'L' or 'l' at the end of a long value. Otherwise, Java treats it as an int.
        long imeiNumber = 8912345678L;
        System.out.println("IMEI number :" + imeiNumber);




        // ---------------------------------------------------------
        // 2. FLOATING-POINT TYPES (Numbers with decimal points)
        // ---------------------------------------------------------

        // 🟢 float (Size: 4 bytes | Precision: 6 to 7 decimal digits)
        // Use case: Standard decimals (Weight, Height, Rating).
        // MASTER RULE: You MUST append 'F' or 'f' at the end of a float value.
        float screenResolution = 6.7f;
        System.out.println("Screen Size : " + screenResolution + "inches");

        // 🟢 double (Size: 8 bytes | Precision: 15 decimal digits)
        // Use case: Highly accurate decimals (GPS coordinates, Scientific calculations, Currency).
        // MASTER RULE: By default, Java treats any decimal as a double. Adding 'D' is optional.
        double gpsCoordinates = 17.385044912345;
        System.out.println("GPS Coordinates : "+ gpsCoordinates);

        // ---------------------------------------------------------
        // 3. CHARACTER TYPE (Single Letter or ASCII)
        // ---------------------------------------------------------

        // 🟢 char (Size: 2 bytes)
        // Use case: A single letter, symbol, or grade.
        // MASTER RULE: You MUST use Single Quotes (' '). Using Double Quotes ("") makes it a String.
        char batteryGrade = 'A';
        System.out.println("Battery Grade : " + batteryGrade);

        // EXTRA TRICK: If you assign an integer number to a char, Java prints its corresponding ASCII character. (97 = 'a')
        char secretCode = 97;
        System.out.println("Secret Code (97) : " + secretCode);


        // ---------------------------------------------------------
        // 4. BOOLEAN TYPE (True or False)
        // ---------------------------------------------------------

        // 🟢 boolean (Size: 1 bit)
        // Use case: Yes/No, On/Off, True/False flags.
        // MASTER RULE: It strictly accepts the keywords true or false (No quotes allowed).
        boolean is5GSupported = true;
        System.out.println("5G Supported? : " + is5GSupported);

        System.out.println("=========================================================");


    }
}
