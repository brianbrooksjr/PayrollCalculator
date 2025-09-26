package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

        //Prompt for name
        System.out.print("Enter your name: ");
        String name = myscanner.nextLine();

        // Prompt for hours worked
        System.out.print("Enter hours worked: ");
        double hoursWorked = myscanner.nextDouble();

        // Prompt for pay rate
        System.out.print("Enter pay rate: ");
        double payRate = myscanner.nextDouble();

        //Formula for gross pay is rate mulitiplied by hours worked.
        double grossPay = hoursWorked * payRate;

        // Display the Employee name and Gross pay
        System.out.printf("Employee Name: %s\n", name);
        System.out.printf("Gross Pay: $%.2f\n", grossPay);

        // Close the scanner
        myscanner.close();
    }
